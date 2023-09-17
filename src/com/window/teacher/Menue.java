package com.window.teacher;

import com.window.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menue {
    private JFrame jFrame;
    private JPanel jPanel;
    private GridLayout layout;
    private JButton getScore;
    private JButton addScore;
    private JButton subjecttable;
    private JButton breaks;

    public void show(){
        jFrame = new JFrame();
        jFrame.setBounds(700,100,400,400);
        jFrame.add(panel());
        jFrame.setVisible(true);
    }
    public JPanel panel(){
        layout = new GridLayout(3, 1);
        jPanel = new JPanel(layout);
        getScore = new JButton("此科目分数");
        jPanel.add(getScore);
        getScore.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GetScore().show();
            }
        });

        addScore = new JButton("添加分数");
        jPanel.add(addScore);
        addScore.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddScore().show();
            }
        });


        breaks = new JButton("退出");
        jPanel.add(breaks);
        breaks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Login().show();
                jFrame.setVisible(false);
            }
        });
        return jPanel;
    }

}
