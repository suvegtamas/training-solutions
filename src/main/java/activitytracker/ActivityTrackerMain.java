package activitytracker;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


public class ActivityTrackerMain {


    public static void main(String[] args) throws SQLException {

        MariaDbDataSource dataSource = new MariaDbDataSource();
        dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
        dataSource.setUser("activitytracker");
        dataSource.setPassword("activitytracker");

        Activity a1 = new Activity(LocalDateTime.of(2020,10,12,12,30),"Biking on mountain",ActivityType.BIKING);
        Activity a2 = new Activity(LocalDateTime.of(2010,7,13,10,30),"Hiking on mountain",ActivityType.HIKING);
        Activity a3 = new Activity(LocalDateTime.of(2016,8,17,9,30),"Running on mountain",ActivityType.RUNNING);
        ActivityDao activityDao = new ActivityDao(dataSource);

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();

        flyway.clean();
        flyway.migrate();
        TrackPoint t1 = new TrackPoint(LocalDate.of(2021,02,18),80.0,120.0);
        TrackPoint t2 = new TrackPoint(LocalDate.of(2021,02,18),80.0,120.0);

        a2.addTrackPoint(t1);
        a2.addTrackPoint(t2);
        activityDao.saveActivity(a2);



//        activityDao.saveActivity(a3);


    }
}
