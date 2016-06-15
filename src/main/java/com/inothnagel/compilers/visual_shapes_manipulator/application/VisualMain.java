package com.inothnagel.compilers.visual_shapes_manipulator.application;

import com.inothnagel.compilers.visual_shapes_manipulator.generated.lexer.Lexer;
import com.inothnagel.compilers.visual_shapes_manipulator.generated.lexer.LexerException;
import com.inothnagel.compilers.visual_shapes_manipulator.generated.node.Start;
import com.inothnagel.compilers.visual_shapes_manipulator.generated.parser.Parser;
import com.inothnagel.compilers.visual_shapes_manipulator.generated.parser.ParserException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;

import static java.lang.Thread.sleep;

public class VisualMain extends JFrame {
    private Canvas canvas = new Canvas();
    public static World world = new World();

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
        Action action = new AbstractAction()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try {
                    interpret(field.getText());
                } catch (ParserException e1) {
                    e1.printStackTrace();
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (LexerException e1) {
                    e1.printStackTrace();
                }
                field.setText("");
            }
        };
        field.addActionListener(action);
        main.add(field);

        main.mainLoop();
    }

    private static void interpret(String text) throws ParserException, IOException, LexerException {
        System.out.println("Interpreting: " + text);
        Parser parser = new Parser(new Lexer(new PushbackReader(new StringReader(text), 1024)));
        Start tree = parser.parse();
        System.out.println(tree);
        tree.apply(new Interpreter());
    }

    private void mainLoop() throws InterruptedException {
        while (true) {
            Graphics graphics = canvas.getBufferStrategy().getDrawGraphics();
            clearBackground(graphics);
            VisualMain.world.render();
            canvas.getBufferStrategy().show();
            sleep(40);
        }
    }

    private void clearBackground(Graphics graphics) {
        graphics.setColor(new Color(0, 0, 0));
        graphics.fillRect(0,0,getSize().width, getSize().height);
    }
}
