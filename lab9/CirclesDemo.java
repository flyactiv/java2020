package ru.mirea.lab9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class CirclesDemo {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new CirclesDemo();

            }
        });
    }

    public CirclesDemo() {
        JFrame frame = new JFrame();
        frame.add(panel);
        frame.add(createButton(), BorderLayout.PAGE_END);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private final DrawingPanel panel = new DrawingPanel();

    private JButton createButton() {
        JButton button = new JButton("Add Circle and Rectangle");
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                int[] circleValues = generateRandomValuesCircle(300, 300, 50, 150);
                int[] rectangleValues = generateRandomValuesRectangle(300, 300, 50, 150);
                int x1 = rectangleValues[0];
                int y1 = rectangleValues[1];
                int width1 = rectangleValues[2];
                int height1 = width1;
                Rectangle rectangle = new Rectangle(x1, y1, width1, height1);
                panel.addRectangle(rectangle);

                int x = circleValues[0];
                int y = circleValues[1];
                int width = circleValues[2];
                int height = width;
                Circle circle = new Circle(x, y, width, height);
                panel.addCircle(circle);
            }
        });
        return button;
    }


    private int[] generateRandomValuesCircle(int maxX, int maxY,
                                       int minSize, int maxSize) {
        Random random = new Random();
        int[] values = new int[3];
        values[0] = random.nextInt(maxX);
        values[1] = random.nextInt(maxY);
        values[2] = Math.min(random.nextInt(maxSize) + minSize, maxSize);

        return values;
    }

    private int[] generateRandomValuesRectangle(int maxX1, int maxY1,
                                             int minSize1, int maxSize1) {
        Random random = new Random();
        int[] values = new int[3];

        values[0] = random.nextInt(maxX1);
        values[1] = random.nextInt(maxY1);
        values[2] = Math.min(random.nextInt(maxSize1) + minSize1, maxSize1);
        return values;
    }

    public Color randomColor()
    {
        Random random=new Random(); // Probably really put this somewhere where it gets executed only once
        int red=random.nextInt(256);
        int green=random.nextInt(256);
        int blue=random.nextInt(256);
        return new Color(red, green, blue);
    }

    class Circle {

        int x, y, width, height;

        public Circle(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;

        }

        public void draw(Graphics g) {
            g.setColor(randomColor());
            g.drawOval(x, y, width, height);
            g.setColor(randomColor());
            g.fillOval(x, y, width, height);
        }
    }

    class Rectangle {

        int x1, y1, width1, height1;

        public Rectangle(int x1, int y1, int width1, int height1) {
            this.x1 = x1;
            this.y1 = y1;
            this.width1 = width1;
            this.height1 = height1;
        }

        public void draw(Graphics g) {
            g.setColor(randomColor());
            g.drawRect(x1, y1, width1, height1);
            g.setColor(randomColor());
            g.fillRect(x1, y1, width1, height1);
        }
    }

    class DrawingPanel extends JPanel {

        List<Circle> circles = new ArrayList<>();
        List<Rectangle> rectangles = new ArrayList<>();

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (Circle circle : circles) {
                circle.draw(g);
            }
            for (Rectangle rectangle : rectangles) {
                rectangle.draw(g);
            }
        }

        public void addCircle(Circle circle) {
            circles.add(circle);
            repaint();
        }
        public void addRectangle(Rectangle rectangle) {
            rectangles.add(rectangle);
            repaint();
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(500, 500);
        }
    }
}
