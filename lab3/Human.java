package ru.mirea.lab3;

public class Human {
    private Head head;
    private Leg legLeft;
    private Leg legRight;
    private Hand handLeft;
    private Hand handRight;

    public Human(Head head, Leg legLeft, Leg legRight, Hand handLeft, Hand handRight) {
        this.head = head;
        this.legLeft = legLeft;
        this.legRight = legRight;
        this.handLeft = handLeft;
        this.handRight = handRight;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLegLeft() {
        return legLeft;
    }

    public void setLegLeft(Leg legLeft) {
        this.legLeft = legLeft;
    }

    public Leg getLegRight() {
        return legRight;
    }

    public void setLegRight(Leg legRight) {
        this.legRight = legRight;
    }

    public Hand getHandLeft() {
        return handLeft;
    }

    public void setHandLeft(Hand handLeft) {
        this.handLeft = handLeft;
    }

    public Hand getHandRight() {
        return handRight;
    }

    public void setHandRight(Hand handRight) {
        this.handRight = handRight;
    }

    @Override
    public String toString() {
        return "Человек  {"+ '\n' +
                "Голова=" + head +
                "левая нога=" + legLeft +
                "правая нога=" + legRight +
                "левая рука=" + handLeft +
                "правая рука=" + handRight +
                '}';
    }
}
