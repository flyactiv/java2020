package ru.mirea.lab30;

import java.util.NoSuchElementException;

public abstract class AbstractQueue<E> implements Queue<E> {

    protected AbstractQueue() {
    }

    protected abstract int size();

    public E element() {
        E element = peek();
        if (element != null){
            return element;
        }
        throw new NoSuchElementException();
    }

    public E remove() {
        E element = poll();
        if (element != null){
            return element;
        }
        throw new NoSuchElementException();
    }

    public boolean add(E element){
        if (offer(element))
            return true;
        else
            throw new IllegalStateException("Queue full");
    }
}