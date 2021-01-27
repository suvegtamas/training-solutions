package week13d03;

public class Teacher {
    private final String name;
    private final String subject;
    private final String classroom;
    private final int hours;

    public Teacher(String name, String subject, String classroom, int hours) {
        this.name = name;
        this.subject = subject;
        this.classroom = classroom;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String getClassroom() {
        return classroom;
    }

    public int getHours() {
        return hours;
    }
}
