package clone.issuetracker;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Issue {
    private final String name;
    private final LocalDateTime time;
    private final Status status;

    private  List<Comment> comments = new ArrayList<>();

    public Issue(String name, LocalDateTime time, Status status) {
        this.name = name;
        this.time = time;
        this.status = status;
    }

    public Issue(Issue other, CopyMode copyMode) {
        if(copyMode.equals(CopyMode.WITH_COMMENTS)) {
            List<Comment> temp = new ArrayList<>();
            for(Comment c : other.comments) {
                temp.add(new Comment(c));
            }
            comments = temp;
        }
        this.name = other.name;
        this.time = other.time;
        this.status = other.status;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public Status getStatus() {
        return status;
    }

    public List<Comment> getComments() {
        return comments;
    }
}
