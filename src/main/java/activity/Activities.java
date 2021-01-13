package activity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Activities {
    private List<Activity>  activities = new ArrayList<>();

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }
    public void addActivity(Activity other) {
        activities.add(other);
    }
    public List<Report> distancesByTypes() {
        List<Report> reports = new ArrayList<>();
        double fullDist = 0;
        for (ActivityType activityType : ActivityType.values()) {
            for(Activity activity : activities) {
                if (activityType == activity.getType()) {
                    fullDist += activity.getDistance();
                }
            }
            reports.add(new Report(activityType,fullDist));
        }

        System.out.println(reports.toString());
        return reports;
    }


    public int numberOfTrackActivities() {
        int count = 0;
        for (Activity activity : activities) {
            if ( activity instanceof ActivityWithTrack) {
                count++;
            }
        }
        return count;
    }
    public int numberOfWithoutTrackActivities() {
        int count = 0;
        for (Activity activity : activities) {
            if ( activity instanceof ActivityWithoutTrack) {
                count++;
            }
        }
        return count;
    }
}
