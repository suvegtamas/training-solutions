package activitytracker;



import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {
    private DataSource dataSource;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Activity saveActivity(Activity activity){
        try(Connection conn = dataSource.getConnection();
            PreparedStatement stmt = conn.prepareStatement("insert into activities(start_time,activity_desc,activity_type) values (?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);) {
                stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
                stmt.setString(2, activity.getDesc());
                stmt.setString(3, activity.getType().toString());
                stmt.executeUpdate();

                Activity act  = executeGeneratedKeys(activity,stmt);
                saveTrackPoint(activity.getTrackPoints(),act.getId());
                return act;

            } catch (SQLException sqle) {
            throw new IllegalStateException("Can't connect!",sqle);
        }
    }

    private Activity executeGeneratedKeys(Activity activity,PreparedStatement stmt) throws SQLException {
        try(ResultSet rs = stmt.getGeneratedKeys();) {
            if(rs.next()) {
                long id = rs.getLong(1);
                return new Activity(id,activity.getStartTime(),activity.getDesc(),activity.getType());
            }
        }

        throw new IllegalArgumentException("Can't find key");
    }

    private boolean checkLongitude(TrackPoint trackPoint) {
        return trackPoint.getLon() > -180 || trackPoint.getLon() < 180;
    }
    private boolean checkLatitude(TrackPoint trackPoint) {
        return trackPoint.getLat() > -90 || trackPoint.getLat() < 90;
    }
    public void saveTrackPoint(List<TrackPoint> trackPoints,long activityId) {
        try(Connection conn = dataSource.getConnection();) {
            conn.setAutoCommit(false);
            try(PreparedStatement stmt = conn.prepareStatement("insert into track_point(activity_id,track_time,lat,lon) values (?,?,?,?)")) {
                for(TrackPoint trackPoint : trackPoints) {
                    LocalTime localTime = LocalTime.of(00,00);
                    LocalDateTime localDateTime = LocalDateTime.of(trackPoint.getTime(),localTime);
                    if (!checkLatitude(trackPoint) || !checkLongitude(trackPoint)) {
                        throw new IllegalArgumentException("Wrong data!");
                    }
                    stmt.setLong(1,activityId);
                    System.out.println(activityId);
                    stmt.setTimestamp(2,Timestamp.valueOf(localDateTime));
                    stmt.setDouble(3,trackPoint.getLat());
                    stmt.setDouble(4,trackPoint.getLon());

                    stmt.executeUpdate();
                }
                conn.commit();
            } catch (IllegalArgumentException iae) {
                conn.rollback();
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can't connect!", sqle);
        }
    }

    public Activity findActivityById(long idToFind){
        try(Connection conn = dataSource.getConnection();
        Statement stmt = conn.createStatement();) {
            ResultSet rs = stmt.executeQuery("select * from activities");
            while(rs.next()) {
                if(rs.getInt(1) == idToFind) {
                    long id = rs.getLong(1);
                    LocalDateTime time = rs.getTimestamp(2).toLocalDateTime();
                    String desc = rs.getString(3);
                    ActivityType type = ActivityType.valueOf(rs.getString(4));
                    return new Activity(id,time,desc,type);
                }
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can't connect", sqle);
        }
        throw new IllegalArgumentException("No activity with id: " + idToFind);
    }
    public List<Activity> listActivities()  {
        List<Activity> result = new ArrayList<>();
        try(Connection conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();) {
            ResultSet rs = stmt.executeQuery("select * from activities");
            while(rs.next()) {
                int id = rs.getInt(1);
                LocalDateTime dateTime = rs.getTimestamp(2).toLocalDateTime();
                String desc = rs.getString(3);
                ActivityType type = ActivityType.valueOf(rs.getString(4));
                result.add(new Activity(id,dateTime,desc,type));
            }
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Can't connect", sqlException);
        }
        return result;
    }
}
