package ru.mirea.lab1;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Jordan", 6);
        Dog d2 = new Dog("Charlie", 3);
        Dog d3 = new Dog("Jastin", 1);
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
