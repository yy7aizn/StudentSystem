package com.window.admin.teacher;

import com.achieve.teacher.TeacherInformationsql;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateTeacher {
    private JFrame jFrame;
    private JPanel jPanel;
    private JLabel id;
    private JTextField idtxt;
    private JLabel phone;
    private JTextField phonetxt;
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

        id = new JLabel("工号");
        id.setBounds(30,30,50,30);
        jPanel.add(id);

        idtxt = new JTextField();
        idtxt.setBounds(100,30,100,30);
        jPanel.add(idtxt);


        phone = new JLabel("固话");
        phone.setBounds(30,180,50,30);
        jPanel.add(phone);

        phonetxt = new JTextField();
        phonetxt.setBounds(100,180,100,30);
        jPanel.add(phonetxt);

        password = new JLabel("密码");
        password.setBounds(30,230,50,30);
        jPanel.add(password);

        passwordtxt = new JTextField();
        passwordtxt.setBounds(100,230,100,30);
        jPanel.add(passwordtxt);

        update = new JButton("修改");
        update.setBounds(60,280,80,30);
        jPanel.add(update);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TeacherInformationsql.update(Integer.parseInt(idtxt.getText()),Integer.parseInt(phonetxt.getText()),passwordtxt.getText());
            }
        });
        return jPanel;
    }
}

