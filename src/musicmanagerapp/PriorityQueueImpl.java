/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicmanagerapp;

/**
 *
 * @author liamf
 */
import java.util.PriorityQueue;

public class PriorityQueueImpl implements PQInterface {
    private PriorityQueue<PQElement> priorityQueue;
    

    public PriorityQueueImpl() {
        priorityQueue = new PriorityQueue<>();
    }

    @Override
    public void enqueue(int key, Song song) {
        priorityQueue.add(new PQElement(key, song));
    }

    @Override
    public int size() {
        return priorityQueue.size();
    }

    @Override
    public boolean isEmpty() {
        return priorityQueue.isEmpty();
    }

    @Override
    public Song dequeue() {
        if (!isEmpty()) {
            return priorityQueue.poll().getSong();
        }
        return null;
    }

    @Override
    public String printPQueue() {
        StringBuilder sb = new StringBuilder();
        for (PQElement element : priorityQueue) {
            sb.append(element.getSong().getTitle()).append(" - ").append(element.getSong().getGenre()).append("\n");
        }
        return sb.toString();
    }
}

