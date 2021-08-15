
import java.lang.reflect.Array;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amyqk
 */
public class SongMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Song song1 = new Song("Shoot Me", 53497448, "Day6", 175, "K-pop");
        Song song2 = new Song("Somehow", 5029536, "Day6", 202, "K-pop");
        Song song3 = new Song("Happier", 205983265, "Ed Sheeran", 207, "Pop");
        
        //System.out.print(song1.SpotifyStreams);
        
        Song[] songList = new Song[3];
        songList[0] = song1;
        songList[1] = song2;
        songList[2] = song3;
        
        /*int gradeList [] = new int [3];
        gradeList[0] = 98;
        gradeList[0] += 2;
        
        System.out.println(gradeList[0]);
        
        int gradeList [] = {98, 87, 100}; 
        */
        
        /*for (Song song :songList){
            System.out.println(song.name);
        }
        for (int i=0; i<songList.length; i++){
            System.out.println(songList[i].name);
        }*/
        for (Song song : songList){
            if (song.length>180){
                System.out.println(song.name);
            }
        }
    }
    
}
