package ru.mirea.lab27.num1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Иван", "Иванович", "Иванов");
        Person person2 = new Person("Станислав", "", "Мирный");
        Person person3 = new Person("Александр", "", "Александров");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
