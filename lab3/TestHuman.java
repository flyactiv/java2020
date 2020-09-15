package ru.mirea.lab3;

import ru.mirea.lab3.Head;
import ru.mirea.lab3.Human;
import ru.mirea.lab3.Leg;
import ru.mirea.lab3.Hand;

public class TestHuman {
    public static void main(String[] args) {
        Leg legRight = new Leg(38);
        Leg legLeft = new Leg(38);
        Hand handRight = new Hand("главная");
        Hand handLeft = new Hand("второстепенная");
        Head head = new Head("коричневые", "зеленые");
        Human h = new Human(head, legRight, legLeft, handRight, handLeft);
        System.out.println(h);
    }
}
