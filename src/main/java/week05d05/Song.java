package week05d05;

public class Song {
    private String name;
    private long lengthInSeconds;
    private String artist;

    public Song(String name, long lengthInSeconds, String artist) {
        if ( isEmpty(name) || isEmpty(artist)) {
            throw new IllegalArgumentException("Name and artist must be given.");
        }
        this.name = name;
        if (lengthInSeconds <= 0) {
            throw new IllegalArgumentException("Music length has to be over 0.");
        }
        this.lengthInSeconds = lengthInSeconds;
        this.artist = artist;
    }
    public boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }

    public String getName() {
        return name;
    }

    public long getLengthInSeconds() {
        return lengthInSeconds;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", lengthInSeconds=" + lengthInSeconds +
                ", artist='" + artist + '\'' +
                '}';
    }
}
