package com.window.admin;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Registered {
    private JFrame jFrame;
    private JPanel jPanel;
    private JLabel user;
    private JLabel password;
    private JTextField usertxt;
    private JTextField passwordtxt;
    private JButton login;
    public void show(){
        jFrame = new JFrame("管理员");
        jFrame.setBounds(700,200,400,300);
        jFrame.add(panel());
        jFrame.setVisible(true);
    }
    public JPanel panel() {
        jPanel = new JPanel(null);

        user = new JLabel("用户名");
        user.setBounds(50, 50, 50, 30);
        jPanel.add(user);

        usertxt = new JTextField();
        usertxt.setBounds(120, 50, 100, 30);
        jPanel.add(usertxt);

        password = new JLabel("密码");
        password.setBounds(50, 100, 50, 30);
        jPanel.add(password);

        passwordtxt = new JTextField();
        passwordtxt.setBounds(120, 100, 100, 30);
        jPanel.add(passwordtxt);

        login = new JButton("登录");
        login.setBounds(80, 150, 70, 30);
        jPanel.add(login);
        login.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Menue().show();
                jFrame.setVisible(false);
            }
        });
        return jPanel;
    }
}
