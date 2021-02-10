package week15d03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostFinderTest {

    @Test
    void dateAfterActualDateShouldThrowException() {
        Post p3 = new Post("Asteroid", LocalDate.of(2025,2,12), "Avalanche","Kate");
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new PostFinder(List.of(p3)).findPostsFor("Kate"));
        assertEquals("Date can't be after the actual date.",ex.getMessage());
    }
    @Test
    void emptyContentAndOwnerShouldThrowException() {
        Post p2 = new Post("Ice Age", LocalDate.of(2020,7,21), "","null");
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new PostFinder(List.of(p2)).findPostsFor("Test"));
        assertEquals("Content and owner can't be empty.",ex.getMessage());
    }
    @Test
    void testAddCorrectData() {
        Post p1 = new Post("Google", LocalDate.of(2012,4,14), "The great escape","Dwayne");
        Post p2 = new Post("Ice Age", LocalDate.of(2020,7,21), "Backstreet Boys","Carol");
        Post p3 = new Post("Asteroid", LocalDate.of(2015,2,12), "aaaaaa","Kate");
        Post p4 = new Post("Avalanche", LocalDate.of(2010,11,24), "Almost Christmas","Dwayne");
        PostFinder postFinder = new PostFinder(List.of(p1,p2,p3,p4));
        List<Post> result = postFinder.findPostsFor("Dwayne");

        assertEquals(2,result.size());
    }



}