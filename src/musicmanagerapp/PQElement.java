/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicmanagerapp;

/**
 *
 * @author liamf
 */
import java.util.Comparator;
import java.util.PriorityQueue;

public class PQElement implements Comparable<PQElement> {
    private int key;
    private Song song;

    public PQElement(int key, Song song) {
        this.key = key;
        this.song = song;
    }

    public int getKey() {
        return key;
    }

    public Song getSong() {
        return song;
    }

    @Override
    public int compareTo(PQElement other) {
        return Integer.compare(this.key, other.key);
    }
}

   

