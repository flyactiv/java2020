package ru.mirea.lab8.number1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main extends JFrame {

    private static final Random random = new Random();
    public static final int width = 850;
    public static final int height = 800;
    public static int x = 10;
    public static int y = 20;


    public static Color getRdmColor(){
        int r = random.nextInt(128);
        int g = random.nextInt(128);
        int b = random.nextInt(128);
        return new Color(r, g, b);
    }
    public static Shape getRandowShape(){
        Color color = getRdmColor();
        int nx = x;
        int ny = y;
        if (x + 100 <= width - 100){
            x += 75;
        } else {
            x = 10;
            y += 80;
        }
        int w = random.nextInt(50) + 70;
        int h = random.nextInt(50) + 50;
        switch (random.nextInt(3)){
            case 0:
                return new Circle(nx, ny, color, w / 2);
            case 1:
                return new Rectangle(nx, ny, color, w, h);
            case 2:
                return  new Square(nx, ny, color, w);
        }
        return new Circle(7, 7, color, w * 3);
    }
    public Main(){
        super("number 1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        JLayeredPane lp = getLayeredPane();
        for (int i = 0; i < 20; i++){
            Shape shape = getRandowShape();
            shape.setBounds(0, 0, width, height);
            lp.add(shape);
        }
        setSize(width, height);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Main();
    }
}

