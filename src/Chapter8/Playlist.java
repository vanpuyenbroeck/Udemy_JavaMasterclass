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

//    public void play() {
//        ListIterator<Song> iterator = playlist.listIterator();
//        if (playlist.size() == 0) {
//            System.out.println("Playlist is empty");
//        } else {
//            System.out.println("Now playing: "
//                            + iterator.next().getTitle() + " "
//                            + iterator.previous().getDuration());
//        }
//
//    }
//
//    public void playNext() {
//        ListIterator<Song> iterator = playlist.listIterator();
//
//    }
}
