package ru.mirea.lab22.num2;

public class NotFound extends Exception{
    public NotFound(String info){
        super("Student " + info + " is not found");
    }
}