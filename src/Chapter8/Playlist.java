package Chapter8;

import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {
    private LinkedList<Song> playlist;

    public Playlist() {
        this.playlist = new LinkedList<>();
    }

    public LinkedList<Song> getPlaylist() {
        return playlist;
    }

    public void addSong(Song song){
        playlist.add(song);
    }

    public void showPlaylist() {
        System.out.println("Current playlist:");

        for (int i=0; i<playlist.size();i++) {
            System.out.println((i+1) + ": "
                                + playlist.get(i).getTitle() + " "
                                + playlist.get(i).getDuration());
        }
    }

    public void remove(ListIterator<Song> iterator, boolean forward) {
        if (forward) {
            playlist.remove(iterator.next());
        } else {
            playlist.remove(iterator.previous());
        }
    }
}
