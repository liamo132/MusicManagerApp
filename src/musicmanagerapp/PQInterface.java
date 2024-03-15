/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicmanagerapp;

/**
 *
 * @author liamf
 */
public interface PQInterface {

    public void enqueue(int key, Song song);

    public int size();

    public boolean isEmpty();

    public Song dequeue();

    public String printPQueue();
}
