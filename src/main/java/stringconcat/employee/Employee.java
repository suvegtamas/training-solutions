package stringconcat.employee;

public class Employee {
    private String name;
    private String job;
    private int salary;

    public Employee(String name, String job, int salary) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Name must not be empty.");
        }
        if (isEmpty(job)) {
            throw new IllegalArgumentException("Job must not be empty.");

        }
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary must be positive.");
        }
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return getName() + " - " + getJob() + " - " + getSalary() + " Ft";
    }
    private boolean isEmpty(String s) {
        return s == null || s.isEmpty();
    }
}
