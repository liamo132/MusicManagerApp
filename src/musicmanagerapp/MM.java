/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicmanagerapp;

/**
 *
 * @author liamf
 *
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JTextArea;

public class MM {

    private Map<String, List<Song>> likedSongsBySubgenre;

    public MM() {
        // use HashMap to create 3 different ArrayLists for subgenres 
        likedSongsBySubgenre = new HashMap<>();

        likedSongsBySubgenre.put("Pop", new ArrayList<>());
        likedSongsBySubgenre.put("Hip-Hop", new ArrayList<>());
    }

    //add song function
    public void addLikedSong(Song song, String subgenre, JTextArea displayTA) {
        List<Song> songs = likedSongsBySubgenre.get(subgenre);
        if (songs != null) {
            songs.add(song);
            String message = " \n added a " + subgenre + " song called " + song.getTitle() + " to the liked playlist.\n";
            displayTA.append(message);
        } else {
            System.out.println("Unknown subgenre: " + subgenre);
        }
    }

    // Method to add a song to the Pop genre playlist
    public void addPopSong(Song song) {
        List<Song> popPlaylist = likedSongsBySubgenre.get("Pop");
        if (popPlaylist != null) {
            popPlaylist.add(song);
        } else {
            System.out.println("Pop playlist not found.");
        }
    }

    // Method to add a song to the Hip-Hop genre playlist
    public void addHipHopSong(Song song) {
        List<Song> hipHopPlaylist = likedSongsBySubgenre.get("Hip-Hop");
        if (hipHopPlaylist != null) {
            hipHopPlaylist.add(song);
        } else {
            System.out.println("Hip-Hop playlist not found.");
        }
    }

    public List<Song> getPopPlaylist() {
        return likedSongsBySubgenre.get("Pop");
    }

    public List<Song> getHipHopPlaylist() {
        return likedSongsBySubgenre.get("Hip-Hop");
    }
}
