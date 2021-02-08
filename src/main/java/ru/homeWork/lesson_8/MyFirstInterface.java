package ru.homeWork.lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFirstInterface extends JFrame {

    public MyFirstInterface() {
        setTitle("Homework Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        //exampleBorderLayout();
        //exampleBorderLayoutTwo();
        //exampleBorderLayoutThree();

        JPanel mainPanel = new JPanel();




        JButton button = new JButton("Сюда отображается история сообщений");
        button.setPreferredSize(new Dimension(200, 100));
        add(button, BorderLayout.CENTER);
        JButton button2 = new JButton("Введите текст");
        add(button2, BorderLayout.PAGE_END);


        JTextField textField = new JTextField();
        JTextField textField2 = new JTextField();
        textField2.setEnabled(false);

        button2.add(textField);
        String text = "";

        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getExtendedKeyCode() == 10) {
                    System.out.println(textField.getText());
                    button.setText(textField.getText()+ "\n");
                    textField.setText("");
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {
            }
        });







        setVisible(true);
    }
}
