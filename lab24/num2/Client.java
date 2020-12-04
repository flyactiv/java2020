package ru.mirea.lab24.num2;

public class Client {
    private Chair chair;

    public void sit() {
        System.out.println("Sit on " + chair);
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
