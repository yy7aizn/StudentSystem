package com.window.admin;

import com.window.Login;
import com.window.admin.student.StudentMenue;
import com.window.admin.teacher.GetallTeacher;
import com.window.admin.teacher.TeacherMenue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menue {
    private JFrame jFrame;
    private JPanel jPanel;
    private GridLayout layout;
    private JButton student;
    private JButton teacher;
    private JButton breaks;

    public void show(){
        jFrame = new JFrame();
        jFrame.setBounds(400,100,500,300);
        jFrame.add(panel());
        jFrame.setVisible(true);
    }
    public JPanel panel(){
        layout = new GridLayout(3, 1);
        jPanel = new JPanel(layout);

        student = new JButton("学生");
        jPanel.add(student);
        student.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StudentMenue().show();
                jFrame.setVisible(false);
            }
        });

        teacher = new JButton("教师");
        jPanel.add(teacher);
        teacher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TeacherMenue().show();
            }
        });
        breaks = new JButton("退出");
        jPanel.add(breaks);
        breaks.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Login().show();
                jFrame.setVisible(false);
            }
        });
        return jPanel;
    }
}
