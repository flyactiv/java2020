package ru.mirea.lab7;

public class Carpet extends Furniture {
    private boolean soft;
    private double width;
    private double height;
    private double length;

    public Carpet(double width, double length, double height, boolean soft) {
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
        return "Carpet{" + "width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", soft=" + soft +
                '}';
    }
}
