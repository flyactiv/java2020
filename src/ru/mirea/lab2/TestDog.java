package ru.mirea.lab2;

import ru.mirea.lab2.Shelter;

public class TestDog {
    public static void main(String[] args) {
        Shelter pitomnik = new Shelter();
        pitomnik.addDog("Charlie", 10);
        pitomnik.addDog("Kuzya", 5);
        pitomnik.addDog("Dog", 20);
        pitomnik.printInfo();
    }
}
