package week13d02;


import java.time.LocalTime;

public class Airways {
    private String id;
    private Status status;
    private String city;
    private LocalTime time;

    public Airways(String id, Status status, String city, LocalTime time) {
        this.id = id;
        this.status = status;
        this.city = city;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public String getCity() {
        return city;
    }

    public LocalTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return  id  + " " + status + " " + city  + " " + time;

    }
}
