package week15d03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PostFinder {
    private List<Post> posts;

    public PostFinder(List<Post> posts) {
        this.posts = posts;
    }

    public List<Post> findPostsFor(String user) {
        List<Post> result = new ArrayList<>();
        for (Post p : posts) {
            if (isDateCorrect(p.getPublishedAt())
                    && isNotBlank(p.getTitle())
                    && isNotBlank(p.getContent())
                    && p.getOwner().equals(user)) {
                result.add(p);
            }
        }
        return result;
    }

    public boolean isNotBlank(String str) {
        return str != null && !str.isBlank();
    }

    public boolean isDateCorrect(LocalDate date) {
        return date.isBefore(LocalDate.now());
    }


}
