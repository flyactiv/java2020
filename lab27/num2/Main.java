package ru.mirea.lab27.num2;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Address("Россия, Москва, Москва, шоссе Энтузиастов, 98, 1, 4"));
        System.out.println(new Address("Россия, Орловская область, Лопушки, улица Сталеваров, 1, 4, 7"));
        System.out.println(new Address("Россия-Москва-Москва-Саянская-5-1-10", "-"));
        System.out.println(new Address("Россия:Псковская область:Псков:улица Революции:7:1:5", ":"));
    }
}
