//package week05d05;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Playlist {
//    private List<Song> songs = new ArrayList<>();
//    public Playlist(List<Song> songs) {
//        this.songs = songs;
//    }
//
//    public List<Song> findByLengthGreaterThan(int mins) {
//        List<Song> found = new ArrayList<>();
//        for ( Song s : songs) {
//            if (mins > s.getLengthInSeconds() / 60) {
//                found.add(s);
//            }
//        }
//        return found;
//    }
//    public Song addToPlay(Song song) {
//
//    }
//
//    public static void main(String[] args) {
//
//        Playlist pl = new Playlist(Arrays.asList());
//    }
//}
