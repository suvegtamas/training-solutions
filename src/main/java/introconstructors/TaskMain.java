package introconstructors;

public class TaskMain {
    public static void main(String[] args) {
        Task task = new Task("Learn","Training360 everyday everynight");
        task.setDuration(6);
        System.out.println(task.getDuration());
        System.out.println(task.getTitle());
        System.out.println(task.getDescription());
        task.start();
        System.out.println(task.getStartDateTime());
    }
}
