package Chapter8;

import java.util.ArrayList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> tracks;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.tracks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public ArrayList<Song> getTracks() {
        return tracks;
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) != null) {
            return false;
        }
        tracks.add(new Song(title, duration));
        return true;
    }

    public Song findSong(String title) {
        for (Song s : tracks) {
            if (s.getTitle().equals(title)){
                return s;
            }
        }
        return null;
    }
}
