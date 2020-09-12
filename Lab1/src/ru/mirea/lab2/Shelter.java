package ru.mirea.lab2;

import ru.mirea.lab2.Dog;

public class Shelter {
    private Dog array[] = new Dog[3];
    private int i = 0;

    public void addDog(String nameOfDog, int ageOfDog) {
        array[i] = new Dog(nameOfDog, ageOfDog);
        i++;
    }
    public void printInfo() {
        System.out.println(array[0].getName());
        System.out.println(array[1].getAge());
        System.out.println(array[2].dogToHuman());
        System.out.println(array[0].toString());
    }
}
