/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicmanagerapp;

/**
 *
 * @author liamf
 */
    public interface STCKInterface {

    boolean isEmpty();
    
    boolean isFull();
    
    void push(Object newItem);
    
    Object pop();
    
    int size();

    }

