package com.abhai;

import com.abhai.Model.Artist;
import com.abhai.Model.DataSource;
import com.abhai.Model.SongArtist;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        DataSource datasource = new DataSource();
        if(!datasource.open()) {
            System.out.println("Can't open dataSource");
            return;
        }

        List<Artist> artists = datasource.queryArtists(DataSource.ORDER_BY_ASC);
        if(artists == null) {
            System.out.println("No artists!");
            return;
        }
        for(Artist artist : artists)
            System.out.println("ID = " + artist.getId() + ", Name = " + artist.getName());

        List<String> albumsForArtist =
                datasource.queryAlbumsForArtist("Iron Maiden", DataSource.ORDER_BY_ASC);
        if (albumsForArtist == null) {
            System.out.println("No results fo this query");
            return;
        }
        for(String album : albumsForArtist)
            System.out.println(album);

        List<SongArtist> songArtists = datasource.queryArtistsForSong("Go Your Own Way", DataSource.ORDER_BY_ASC);
        if(songArtists == null) {
            System.out.println("Couldn't find the artist for the song");
            return;
        }

        for(SongArtist artist : songArtists) {
            System.out.println("Artist name = " + artist.getArtistName() +
                    " Album name = " + artist.getAlbumName() +
                    " Track = " + artist.getTrack());
        }

        datasource.querySongsMetadata();

        int count = datasource.getCount(DataSource.TABLE_SONGS);
        System.out.println("Number of songs is: " + count);

        datasource.createViewForSongArtists();

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the song's title: ");

        songArtists = datasource.querySongViewInfo(scanner.nextLine());
        if(songArtists.isEmpty()) {
            System.out.println("Couldn't find the artist for the song");
            return;
        }

        for(SongArtist artist : songArtists)
            System.out.println("FROM VIEW - Artist name = " + artist.getArtistName() +
                    " Album name = " + artist.getAlbumName() +
                    " Track number = " + artist.getTrack());
         */

        datasource.insertSong("Bird Dog", "Everly Brothers", "All-Time Greatest Hits", 7);
        datasource.close();
    }
}
