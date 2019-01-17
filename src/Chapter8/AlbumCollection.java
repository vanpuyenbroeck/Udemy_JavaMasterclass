package Chapter8;

import java.util.ArrayList;

public class AlbumCollection {
    private ArrayList<Album> collection;

    public AlbumCollection() {
        this.collection = new ArrayList<>();
    }

    public boolean addAlbum(String title, String album) {
        if (findAlbum(title) != null) {
            System.out.println("Album with that name already exists");
            return false;
        }
        collection.add(new Album(title, album));
        return true;
    }

    private Album findAlbum(String name) {
        for (Album a : collection) {
            if (a.getName().equals(name)) {
                return a;
            }
        }
        return null;
    }

    public boolean addSongToAlbum(String title, double duration, String album) {
        Album searchAlbum = findAlbum(album);
        if (searchAlbum == null) {
            System.out.println("Album does not exist");
            return false;
        }
        if (!searchAlbum.addSong(title, duration)) {
            System.out.println("Album already contains a song with that name");
            return false;
        }
        return true;
    }

    public void listCollection() {
        System.out.println("Album collection:");
        for (Album a : collection) {
            System.out.println(a.getName());
            ArrayList<Song> songs = a.getTracks();
            for (int i = 0; i < songs.size(); i++) {
                System.out.println("Track " + (i + 1)
                        + ": " + songs.get(i).getTitle()
                        + " " + songs.get(i).getDuration());
            }
        }
    }

    public boolean addSongToPlaylist(String album, String title, Playlist playlist) {
        Album searchAlbum = findAlbum(album);
        if (searchAlbum != null) {
            Song searchSong = searchAlbum.findSong(title);
            if (searchSong != null) {
                playlist.addSong(searchSong);
                return true;
            }
            System.out.println("Album does not contain a song with that name");
            return false;
        }
        System.out.println("Album with that name does not exist in collection");
        return false;
    }
}
