/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicmanagerapp;

/**
 *
 * @author liamf
 */
public class StackElement implements STCKInterface {
    private Object[] stackArray;
    private int top;
    private int maxSize;

    public StackElement(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new Object[maxSize];
        top = -1;
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    @Override
    public void push(Object newItem) {
        if (!isFull()) {
            stackArray[++top] = newItem;
        } else {
            System.out.println("Stack is full");
        }
    }

    @Override
    public Object pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            System.out.println("Stack is empty");
            return null;
        }
    }

    @Override
    public int size() {
        return top + 1;
    }
}
