package com.window.admin.student;

import com.achieve.student.Student;
import com.achieve.student.StudentInformationsql;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class UpdateStudent {
    private JFrame jFrame;
    private JPanel jPanel;
    private JLabel id;
    private JTextField idtxt;
    private JLabel clazz;
    private JTextField clazztxt;
    private JLabel password;
    private JTextField passwordtxt;
    private JButton update;
    public void show(){
        jFrame = new JFrame();
        jFrame.setBounds(700,100,400,400);
        jFrame.add(panel());
        jFrame.setVisible(true);
    }
    public JPanel panel(){
        jPanel = new JPanel(null);

        id = new JLabel("学号");
        id.setBounds(30,30,50,30);
        jPanel.add(id);

        idtxt = new JTextField();
        idtxt.setBounds(100,30,100,30);
        jPanel.add(idtxt);


        clazz = new JLabel("班级");
        clazz.setBounds(30,180,50,30);
        jPanel.add(clazz);

        clazztxt = new JTextField();
        clazztxt.setBounds(100,180,100,30);
        jPanel.add(clazztxt);

        password = new JLabel("密码");
        password.setBounds(30,230,50,30);
        jPanel.add(password);

        passwordtxt = new JTextField();
        passwordtxt.setBounds(100,230,100,30);
        jPanel.add(passwordtxt);

        update = new JButton("修改");
        update.setBounds(60,280,80,30);
        jPanel.add(update);
        update.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentInformationsql.update(Integer.parseInt(idtxt.getText()),clazztxt.getText(),passwordtxt.getText());
            }
        });
        return jPanel;
    }
}
