package ru.homeWork.lesson_8;

import javafx.scene.layout.Pane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyWindow extends JFrame {

    public MyWindow() {
        setTitle("Homework Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 600, 600);


        JPanel mainPanel = new JPanel();
        JTextField textField = new JTextField("Введите сообщение:");
        textField.setSize(new Dimension(50, 100));
        JTextArea textArea = new JTextArea("Здесь отображается история сообщений:" + "\n");
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(textField, BorderLayout.SOUTH);
        mainPanel.add(textArea, BorderLayout.CENTER);


        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getExtendedKeyCode() == 10) {
                    textArea.setText(textArea.getText() + textField.getText() + "\n");
                    textField.setText("");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        textField.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == 1) {
                    textField.setText("");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });


        /*if (textField.getText().equals("")) {
            String errText = "Введите сообщение";
            textField.setText(errText);
            textField.select(0, errText.length());
        } else {
            textArea.setText(textArea.getText() + textField.getText() + "\n");
            textField.setText("");
        }*/


        add(mainPanel);
        setVisible(true);
    }
}
