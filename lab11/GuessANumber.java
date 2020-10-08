package ru.mirea.lab11;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.Math;

public class GuessANumber {
    public static void main(String[] args) {

        int UnknownNumber, UserNumber, TrysCount = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("ЗАДАЧА: Угадать число (от 0 до 20).");

        UnknownNumber = (int)Math.floor(Math.random() * 20);

        do {
            TrysCount=TrysCount+1;

            System.out.print("Введите ваше число: ");

            UserNumber = input.nextInt();

            if (UserNumber > UnknownNumber)
                System.out.println("Ошибка. Моё число меньше.");

            else if (UserNumber < UnknownNumber)
                System.out.println("Ошибка. Моё число больше.");

            else {
                System.out.println("Вы угадали!");
                System.exit(0);
            }

        } while ((TrysCount!=3) | (UserNumber==UnknownNumber));
        System.out.println("Завершение игры. Вы проиграли");
        System.out.println("Количество попыток: " + TrysCount);

    }
}