package ru.mirea.lab5;

public class TestShape {
    public static void main(String[] args) {
        Shape c = new Circle("black", false, 6.0);
        Shape r = new Rectangle("orange", true, 17, 26);
        Shape s = new Square("green", true, 14);
        System.out.println(c);
        System.out.println(r);
        System.out.println(s);
    }
}
