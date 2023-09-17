package com.window.admin.student;

import com.window.admin.Menue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class StudentMenue {
    private JFrame jFrame;
    private JPanel jPanel;
    private GridLayout layout;
    private JButton add;
    private JButton delete;
    private JButton update;
    private JButton getAll;
    private JButton breaks;

    public void show(){
        jFrame = new JFrame();
        jFrame.setBounds(400,100,500,300);
        jFrame.add(panel());
        jFrame.setVisible(true);
    }
    public JPanel panel(){
        layout = new GridLayout(5, 1);
        jPanel = new JPanel(layout);

        add = new JButton("插入学生信息");
        jPanel.add(add);
        add.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddStudent().show();
            }
        });

        delete = new JButton("删除学生信息");
        jPanel.add(delete);
        delete.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DeleteStudent().show();
            }
        });
        update = new JButton("修改学生信息");
        jPanel.add(update);
        update.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UpdateStudent().show();
            }
        });
        getAll = new JButton("查询学生信息");
        jPanel.add(getAll);
        getAll.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GetallStudent().show();
            }
        });
        breaks = new JButton("返回");
        jPanel.add(breaks);
        breaks.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Menue().show();
                jFrame.setVisible(false);
            }
        });
        return jPanel;
    }
}

