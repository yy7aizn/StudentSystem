package com.window.admin.teacher;

import com.window.admin.Menue;
import com.window.admin.student.DeleteStudent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacherMenue {
    private JFrame jFrame;
    private JPanel jPanel;
    private GridLayout layout;
    private JButton add;
    private JButton delete;
    private JButton update;
    private JButton getAll;
    private JButton breaks;
    private JButton clazzdate;

    public void show(){
        jFrame = new JFrame();
        jFrame.setBounds(400,100,500,300);
        jFrame.add(panel());
        jFrame.setVisible(true);
    }
    public JPanel panel(){
        layout = new GridLayout(5, 1);
        jPanel = new JPanel(layout);

        add = new JButton("注册教师信息");
        jPanel.add(add);
        add.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddTeacher().show();
            }
        });

        delete = new JButton("删除教师信息");
        jPanel.add(delete);
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DeleteTeacher().show();
            }
        });
        delete.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DeleteStudent();
            }
        });
        update = new JButton("修改教师信息");
        jPanel.add(update);
        update.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UpdateTeacher().show();
            }
        });
        getAll = new JButton("查询教师信息");
        jPanel.add(getAll);
        getAll.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GetallTeacher().show();
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
        clazzdate = new JButton("课程安排");
        jPanel.add(clazzdate);
        clazzdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ClazzDate().show();
            }
        });
        return jPanel;
    }
}


