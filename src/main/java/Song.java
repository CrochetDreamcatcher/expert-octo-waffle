/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amyqk
 */
public class Song {
    public String name;
    public int SpotifyStreams;
    public String artist;
    public int length;
    public String genre;

    public Song(String name, int SpotifyStreams, String artist, int length, String genre) {
        this.name = name;
        this.SpotifyStreams = SpotifyStreams;
        this.artist = artist;
        this.length = length;
        this.genre = genre;
    }
    
    
    
}
