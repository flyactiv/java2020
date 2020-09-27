package ru.mirea.lab7;

public class Chair extends Furniture {
    private boolean soft;
    private double width;
    private double height;
    private double length;

    public Chair(double width, double height, double length, boolean soft) {
        super(width, height, length);
        this.soft = soft;
    }

    public boolean isSoft() {
        return soft;
    }

    public void setSoft(boolean soft) {
        this.soft = soft;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", soft=" + soft +
                '}';
    }
}
