package com.inothnagel.compilers.visual_shapes_manipulator.application;

import javax.swing.*;
import java.awt.*;

import static java.lang.Thread.sleep;

public class VisualMain extends JFrame {
    private Canvas canvas = new Canvas();

    private VisualMain() {
        super();
        canvas.setSize(getSize());
        add(canvas);
        setVisible(true);
        canvas.createBufferStrategy(2);
    }

    public static void main(String[] args) throws InterruptedException {
        VisualMain main = new VisualMain();
        BoxLayout layout = new BoxLayout(main.getContentPane(),BoxLayout.PAGE_AXIS);
        main.setLayout(layout);
        main.setExtendedState(JFrame.MAXIMIZED_BOTH);

        JTextField field = new JTextField(20);
        field.setMaximumSize(new Dimension(500,100));
        main.add(field);

        main.mainLoop();
    }

    private void mainLoop() throws InterruptedException {
        while (true) {
            Graphics graphics = canvas.getBufferStrategy().getDrawGraphics();
            clearBackground(graphics);
            canvas.getBufferStrategy().show();
            sleep(40);
        }
    }

    private void clearBackground(Graphics graphics) {
        graphics.setColor(new Color(0, 0, 0));
        graphics.fillRect(0,0,getSize().width, getSize().height);
    }
}
