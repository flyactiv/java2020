package ru.mirea.lab24.num2;

public class VictorianChair implements Chair {
    private final String owner;

    public VictorianChair(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "VictorianChair{" +
                "owner='" + owner + '\'' +
                '}';
    }

    @Override
    public void printChair() {
        System.out.println("Victorian chair");
    }
}