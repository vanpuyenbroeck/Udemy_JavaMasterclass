package Chapter8;

import java.util.ListIterator;
import java.util.Scanner;

public class ex8_96 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        AlbumCollection myCollection = new AlbumCollection();
        addDemoContent(myCollection);
        myCollection.listCollection();

        Playlist myPlaylist = new Playlist();
        addDemoSongs(myCollection, myPlaylist);

        playSongsInPlaylist(myPlaylist);

    }

    private static void addDemoContent(AlbumCollection collection) {
        collection.addAlbum("Unplugged", "Eric Clapton");
        collection.addSongToAlbum("Hey Hey", 3.16, "Unplugged");
        collection.addSongToAlbum("Tears in Heaven", 4.40, "Unplugged");
        collection.addSongToAlbum("Layla", 3.45, "Unplugged");
        collection.addSongToAlbum("Old Love", 7.53, "Unplugged");

        collection.addAlbum("Master of Puppets", "Metallica");
        collection.addSongToAlbum("Battery", 5.12, "Master of Puppets");
        collection.addSongToAlbum("Master of Puppets", 8.35, "Master of Puppets");
        collection.addSongToAlbum("The Thing That Should Not Be", 6.36, "Master of Puppets");

        collection.addSongToAlbum("DuplicateAlbum", 0.01, "Unplugged");
        collection.addSongToAlbum("Test", 1.23, "DoesNotExist");
    }

    private static void addDemoSongs(AlbumCollection collection, Playlist playlist) {
        collection.addSongToPlaylist("Unplugged", "Layla", playlist);
        collection.addSongToPlaylist("Unplugged", "Old Love", playlist);
        collection.addSongToPlaylist("Unplugged", "Hey Hey", playlist);
        collection.addSongToPlaylist("Master of Puppets", "Battery", playlist);

        collection.addSongToPlaylist("Master of Puppets", "Does not exist", playlist);
        collection.addSongToPlaylist("Does not exist", "Battery", playlist);
    }

    private static void showMenu() {
        System.out.println("========\nOptions: ");
        System.out.println("1 - Quit\n" +
                "2 - Skip to next song\n" +
                "3 - Skip to previous song\n" +
                "4 - Replay current song\n" +
                "5 - List the songs in the playlist");
    }

    private static void playSongsInPlaylist(Playlist playlist) {
        ListIterator<Song> iterator = playlist.getPlaylist().listIterator();
        boolean isPlaying = true;
        boolean forward = true;

        showCurrentSong(iterator, forward);

        while (isPlaying) {
            showMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    isPlaying = false;
                    break;
                case 2:
                    if (!forward) {
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                        forward = true;
                    }
                    if (iterator.hasNext()) {
                        showCurrentSong(iterator, forward);
                    } else {
                        System.out.println("Already at last position in playlist");
                        forward = false;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        forward = false;
                    }
                    if (iterator.hasPrevious()) {
                        showCurrentSong(iterator, forward);
                    } else {
                        System.out.println("Already at start of playlist");
                        forward = true;
                    }
                    break;
                case 4:
                    if (forward) {
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                            showCurrentSong(iterator, forward);
                        }
                    } else {
                        if (iterator.hasNext()) {
                            iterator.next();
                            showCurrentSong(iterator, forward);
                        }
                    }
                    break;
                case 5:
                    playlist.showPlaylist();
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
        scanner.close();
    }

    private static void showCurrentSong(ListIterator<Song> iterator, boolean forward) {

        if (forward) {
            System.out.println("Now playing: " + iterator.next().getTitleAndDuration());
        } else {
            System.out.println("Now playing: " + iterator.previous().getTitleAndDuration());
        }
    }
}
