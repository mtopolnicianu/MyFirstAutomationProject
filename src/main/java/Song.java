public class Song {

    private String title;
    private String artist;
    private int length;
    private static int songsCount = 0;


    public Song(String title, String artist, int length) {
        this.artist = artist;
        this.title = title;
        this.length = length;
        songsCount++;
        System.out.println("Song count: " + songsCount);
    }

    public int getSongsCount() {
        return songsCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist() {
        this.artist = artist;
    }

    public int getLength() {
        return length;
    }

    public void setLength() {
        this.length = length;
    }

}
