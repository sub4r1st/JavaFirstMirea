package ru.mirea.task8.task3;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Gif extends JFrame{
    public static void main(String[] args) {
        new Gif();
    }

    public Gif() {
        setSize(450, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void paint(Graphics g) {
        for(int i=0; i<3; i++) {
            Image img = new ImageIcon("/Users/bont1/Desktop/img1.png").getImage();
            g.drawImage(img, 50, 50, 300, 300, null);//выводим img
            try {
                TimeUnit.SECONDS.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            img = new ImageIcon("/Users/bont1/Desktop/img2.png").getImage();
            g.drawImage(img, 50, 50, 300, 300, null);//выводим img
            try {
                TimeUnit.SECONDS.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            img = new ImageIcon("/Users/bont1/Desktop/img3.png").getImage();
            g.drawImage(img, 50, 50, 300, 300, null);//выводим img
            try {
                TimeUnit.SECONDS.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            img = new ImageIcon("/Users/bont1/Desktop/img4.png").getImage();
            g.drawImage(img, 50, 50, 300, 300, null);//выводим img
            try {
                TimeUnit.SECONDS.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            img = new ImageIcon("/Users/bont1/Desktop/img5.png").getImage();
            g.drawImage(img, 50, 50, 300, 300, null);//выводим img
            try {
                TimeUnit.SECONDS.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
