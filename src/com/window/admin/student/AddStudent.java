package com.window.admin.student;

import com.achieve.score.Scoresql;
import com.achieve.student.Student;
import com.achieve.student.StudentInformationsql;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AddStudent {
    private JFrame jFrame;
    private JPanel jPanel;
    private JLabel id;
    private JTextField idtxt;
    private JLabel name;
    private JTextField nametxt;
    private JLabel sex;
    private JTextField sextxt;
    private JLabel clazz;
    private JTextField clazztxt;
    private JLabel password;
    private JTextField passwordtxt;
    private JButton add;
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

        name = new JLabel("姓名");
        name.setBounds(30,80,50,30);
        jPanel.add(name);

        nametxt = new JTextField();
        nametxt.setBounds(100,80,100,30);
        jPanel.add(nametxt);

        sex = new JLabel("性别");
        sex.setBounds(30,130,50,30);
        jPanel.add(sex);

        sextxt = new JTextField();
        sextxt.setBounds(100,130,100,30);
        jPanel.add(sextxt);

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

        add = new JButton("添加");
        add.setBounds(60,280,80,30);
        jPanel.add(add);
        add.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Student s = new Student(Integer.parseInt(idtxt.getText()),nametxt.getText(),sextxt.getText(),clazztxt.getText(),passwordtxt.getText());
                StudentInformationsql.insert(s);
                Scoresql.insert(Integer.parseInt(idtxt.getText()),nametxt.getText());
            }
        });
        return jPanel;
    }
}
