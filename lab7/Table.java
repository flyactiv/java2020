package ru.mirea.lab7;

public class Table extends Furniture {
    private double numberOfPersons;
    private double width;
    private double height;
    private double length;

    public Table(double width, double height, double length, double numberOfPersons) {
        super(width, height, length);
        this.numberOfPersons = numberOfPersons;
    }

    public double getNumberOfPersons() {
        return numberOfPersons;
    }

    public void setNumberOfPersons(double numberOfPersons) {
        this.numberOfPersons = numberOfPersons;
    }

    @Override
    public String toString() {
        return "Table{" +
                "width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", numberOfPersons=" + numberOfPersons +
                '}';
    }
}
