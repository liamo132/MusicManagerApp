/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicmanagerapp;

/**
 *
 * @author liamf
 */
public class PQElement {
    //with my Primary Queue element i can use my "rearange" button in my gui to change a songs position in the array
    private int key;
    private Song song;

    public PQElement(int key, Song song) {
        this.key = key;
        this.song = song;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public String printSong() {
        return " Title: " + song.getTitle() + ", Genre: " + song.getGenre();
    }
}
