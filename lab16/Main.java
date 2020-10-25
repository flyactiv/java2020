package ru.mirea.lab16;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> first = new LinkedList<>();
        first.offer(1);
        first.offer(3);
        first.offer(5);
        first.offer(7);
        first.offer(9);
        Queue<Integer> second = new LinkedList<>();
        second.offer(2);
        second.offer(4);
        second.offer(6);
        second.offer(8);
        second.offer(0);
        startGame(first, second);
    }
    public static void startGame(Queue<Integer> first, Queue<Integer> second){
        int count = 0;
        while(!first.isEmpty() && !second.isEmpty() && count < 106){
            int f = first.remove();
            int s = second.remove();

            if (f == 0 && s == 9){
                first.add(f);
                first.add(s);
            } else if (f == 9 && s == 0){
                second.add(f);
                second.add(s);
            } else if (f > s){
                first.add(f);
                first.add(s);
            } else {
                second.add(f);
                second.add(s);
            }
            count++;
        }

        if(count == 106){
            System.out.println("Botva!");
        }
        if(!first.isEmpty()){
            System.out.println("First " + count);
        } else{
            System.out.println("Second " + count);
        }
    }
}