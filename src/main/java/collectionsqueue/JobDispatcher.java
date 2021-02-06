package collectionsqueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class JobDispatcher {

    public Queue<Job> addJob(Job... jobs) {
        PriorityQueue<Job> result = new PriorityQueue<>();
        for(Job job : jobs) {
            result.offer(job);
        }
        return result;
    }
    public Job dispatchNextJob(Queue<Job> jobs) {
        if(jobs.isEmpty()) {
            throw new NoJobException("No job available, get a rest!");
        }

        return jobs.poll();
    }
}
