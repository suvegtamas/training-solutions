package collectionsqueue;

import java.util.ArrayDeque;
import java.util.Deque;


public class JobQueue {
    public Deque<Job> addJobByUrgency(Job... jobs) {
        Deque<Job> result = new ArrayDeque<>();
        for(Job job : jobs) {
            if(job.getJobDescription().equals("urgent")) {
                result.push(job);
            } else {
                result.addLast(job);
            }
        }

        return result;
    }
    public Job dispatchUrgentJob(Deque<Job> jobs) {
        if(jobs.isEmpty()) {
            throw new NoJobException("No job available, get a rest!");
        }
      return jobs.getFirst();
    }
    public Job dispatchNotUrgentJob(Deque<Job> jobs) {
        if(jobs.isEmpty()) {
            throw new NoJobException("No job available, get a rest!");
        }
        return jobs.getLast();
    }
}
