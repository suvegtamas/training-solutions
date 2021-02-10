package week15d03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PostFinder {
    private List<Post> posts = new ArrayList<>();

    public PostFinder(List<Post> posts) {
        this.posts = posts;
    }

    public List<Post> findPostsFor(String user) {
        List<Post> result = new ArrayList<>();
        for(Post p : posts) {
            if(!isDateCorrect(p.getPublishedAt())) {
                throw new IllegalArgumentException("Date can't be after the actual date.");
            }
            if(isEmpty(p.getOwner()) || isEmpty(p.getContent())) {
                throw new IllegalArgumentException("Content and owner can't be empty.");
            }
            if(p.getOwner().equals(user)) {
                result.add(p);
            }
        }
        return result;
    }
    public boolean isEmpty(String str) {
        return str == null || str.trim().equals("");
    }
    public boolean isDateCorrect(LocalDate date) {
        return date.isBefore(LocalDate.now());
    }


}
