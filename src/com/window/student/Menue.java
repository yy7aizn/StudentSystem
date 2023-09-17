package com.window.student;

import com.window.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menue {
    private JFrame jFrame;
    private JPanel jPanel;
    private GridLayout layout;
    private JButton course;
    private JButton score;
    private JButton choose;

    public void show(){
        jFrame = new JFrame();
        jFrame.setBounds(400,100,500,300);
        jFrame.add(panel());
        jFrame.setVisible(true);
    }
    public JPanel panel(){
        layout = new GridLayout(3, 1);
        jPanel = new JPanel(layout);
        course = new JButton("退出");
        jPanel.add(course);
        course.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Login().show();
                jFrame.setVisible(false);
            }
        });
        score = new JButton("成绩");
        jPanel.add(score);
        score.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GetScore().show();
            }
        });
        choose = new JButton("选课");
        jPanel.add(choose);
        choose.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ChooseSubject().show();
            }
        });

        return jPanel;
    }
}

