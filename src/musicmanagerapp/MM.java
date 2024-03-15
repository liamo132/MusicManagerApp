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
import java.util.List;
import java.util.Stack;
import javax.swing.JTextArea;

public class MM {

    private List<Song> likedSongs;
    private List<Song> popSongs;
    private List<Song> hipHopSongs;
    private Stack<Song> lastAddedStack;

    public MM() {
        //3 arrays to store songs in
        likedSongs = new ArrayList<>();
        popSongs = new ArrayList<>();
        hipHopSongs = new ArrayList<>();

        lastAddedStack = new Stack<>();
    }
    
    // add a song to my liked playlist
    public void addLikedSong(Song song, String title, JTextArea displayTA) {
        likedSongs.add(song);
        String message = "\n" + "Added song: " + song.getTitle() + ", Genre: " + song.getGenre() ;
        displayTA.append(message);
    }

    // add a song from "liked" to my pop playlist
    public void addPopSong(Song song, JTextArea displayPopTA) {
        popSongs.add(song);
        String message = song.getTitle() + " has been added to Pop playlist.\n";
        displayPopTA.append(message);
    }
    
    // add a song from "liked" to my HipHop playlist
    public void addHipHopSong(Song song, JTextArea displayHipHopTA) {
        hipHopSongs.add(song);
        String message = song.getTitle() + " has been added to Hip-Hop playlist.\n";
        displayHipHopTA.append(message);
    }
    
    //get methods
    public List<Song> getPopPlaylist() {
        return popSongs;
    }

    public List<Song> getHipHopPlaylist() {
        return hipHopSongs;
    }

}
