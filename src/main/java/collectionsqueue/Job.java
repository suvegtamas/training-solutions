package collectionsqueue;

import java.util.Objects;

public class Job implements Comparable<Job>{
   private final int priority;
   private final String jobDescription;
   private boolean urgent;

    public Job(int priority, String jobDescription) {
        this.priority = priority;
        this.jobDescription = jobDescription;
    }

    public int getPriority() {
        return priority;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public boolean isUrgent() {
        return urgent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return priority == job.priority;
    }

    @Override
    public int hashCode() {
        return Objects.hash(priority);
    }

    @Override
    public int compareTo(Job o) {
        return this.priority - o.priority;
    }
}
