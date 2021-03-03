package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ActivityDaoTest {
    MariaDbDataSource dataSource = new MariaDbDataSource();
    ActivityDao activityDao;
    Activity a1 = new Activity(LocalDateTime.of(2020,10,12,12,30),"Biking on mountain",ActivityType.BIKING);
    Activity a2 = new Activity(LocalDateTime.of(2010,7,13,10,30),"Hiking on mountain",ActivityType.HIKING);
    Activity a3 = new Activity(LocalDateTime.of(2016,8,17,9,30),"Running on mountain",ActivityType.RUNNING);


   @BeforeEach
    void setUp() {
       try {
           dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
           dataSource.setUser("activitytracker");
           dataSource.setPassword("activitytracker");
       } catch (SQLException sqle) {
           throw new IllegalStateException("Can't connect", sqle);
       }


       Flyway flyway = Flyway.configure().dataSource(dataSource).load();

       flyway.clean();
       flyway.migrate();

       activityDao = new ActivityDao(dataSource);
       activityDao.saveActivity(a1);
       activityDao.saveActivity(a2);
       activityDao.saveActivity(a3);


   }
   @Test
   void saveActivityTest() {




   }
    @Test
    void findActivityById() {
       Activity result = activityDao.findActivityById(2);
      assertEquals("Hiking on mountain", result.getDesc());
    }

    @Test
    void listActivities() {
        List<Activity> activities = activityDao.listActivities();
        assertEquals(3,activities.size());
    }
}