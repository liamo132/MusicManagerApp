/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicmanagerapp;

/**
 *
 * @author liamf
 *
 */import java.util.ArrayList;
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
        likedSongsBySubgenre.put("Other", new ArrayList<>());
    }

    public void addLikedSong(Song song, String subgenre, JTextArea displayTA) {
        List<Song> songs = likedSongsBySubgenre.get(subgenre);
        if (songs != null) {
            songs.add(song);
            String message = "You added a " + subgenre + " song called " + song.getTitle() + " to the liked playlist.\n";
            displayTA.append(message);
        } else {
            System.out.println("Unknown subgenre: " + subgenre);
        }
    }
}

