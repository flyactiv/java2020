package ru.mirea.lab8.number3;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WorldRenderer extends JPanel {


    private static final int HEIGHT = 760;
    private static final int WIDTH = 500;

    private JFrame frame;
    private Timer timer;
    private Image image;
    public WorldRenderer() {
        frame = new JFrame("Application name");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(this);
        frame.setVisible(true);
        image =  new ImageIcon("src/1.jpg").getImage();
        count = 0;
        timer = new Timer();
        timer.schedule(animate, 1,200);
    }

    private int count;
    TimerTask animate = new TimerTask() {

        @Override
        public void run() {
            switch (count) {
                case 0:
                    image = new ImageIcon("src/1.jpg").getImage();
                    break;
                case 1:
                    image = new ImageIcon("src/2.jpg").getImage();
                    break;
                case 2:
                    image = new ImageIcon("src/3.jpg").getImage();
                    break;
                case 3:
                    image = new ImageIcon("src/4.jpg").getImage();
                    break;
                default:
                    break;
            }
            count++;
            if (count == 5) {
                count = 0;
            }
            repaint();
        }
    };

    public void paint(Graphics canvas) {
        canvas.drawImage(image, 0, 0,  null);
    }

}
