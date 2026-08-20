package org.example;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;

public class square {
    public static void main(String[] args) {
        // Create the Swing window
        JFrame frame = new JFrame("Swing Square Outline") {
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                g.setColor(Color.BLUE);
                // drawRect(x, y, width, height) draws just the outline
                g.drawRect(200, 150, 100, 100);
            }
        };

        frame.setSize(550, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center window on screen
        frame.setVisible(true);
    }
}
