package ru.mirea.lab30;

import java.util.ArrayList;

public class ArrayQueue<E> extends AbstractQueue<E> {
    ArrayList<E> queue;
    public ArrayQueue() {
        this.queue = new ArrayList<>();
    }

    protected int size() {
        return queue.size();
    }

    public E poll() {
        if (queue == null){
            return null;
        }
        E element = queue.get(0);
        queue.remove(0);
        return element;
    }

    public E peek() {
        if (queue == null){
            return null;
        }
        return queue.get(0);
    }

    public boolean offer(E element) {
        return queue.add(element);
    }

    public String toString() {
        return "ArrayQueue{" +
                "queue=" + queue +
                '}';
    }
}