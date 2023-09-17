package com.window.admin.teacher;

import com.achieve.subjectTable.SubjectTablesql;
import com.achieve.teacher.Teacher;
import com.achieve.teacher.TeacherInformationsql;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddTeacher {
    private JFrame jFrame;
    private JPanel jPanel;
    private JLabel id;
    private JTextField idtxt;
    private JLabel name;
    private JTextField nametxt;
    private JLabel subject;
    private JTextField subjecttxt;
    private JLabel sex;
    private JTextField sextxt;
    private JLabel phone;
    private JTextField phonetxt;
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

        id = new JLabel("工号");
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

        subject = new JLabel("科目");
        subject.setBounds(30,130,50,30);
        jPanel.add(subject);

        subjecttxt = new JTextField();
        subjecttxt.setBounds(100,130,100,30);
        jPanel.add(subjecttxt);

        sex = new JLabel("性别");
        sex.setBounds(30,180,50,30);
        jPanel.add(sex);

        sextxt = new JTextField();
        sextxt.setBounds(100,180,100,30);
        jPanel.add(sextxt);

        phone = new JLabel("手机号码");
        phone.setBounds(30,230,50,30);
        jPanel.add(phone);

        phonetxt = new JTextField();
        phonetxt.setBounds(100,230,100,30);
        jPanel.add(phonetxt);

        password = new JLabel("密码");
        password.setBounds(30,280,50,30);
        jPanel.add(password);

        passwordtxt = new JTextField();
        passwordtxt.setBounds(100,280,100,30);
        jPanel.add(passwordtxt);

        add = new JButton("添加");
        add.setBounds(60,330,80,30);
        jPanel.add(add);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Teacher t = new Teacher(Integer.parseInt(idtxt.getText()),nametxt.getText(),subjecttxt.getText(),sextxt.getText(),Integer.parseInt(phonetxt.getText()),passwordtxt.getText());
                TeacherInformationsql.insert(t);
                SubjectTablesql.insert(nametxt.getText(),subjecttxt.getText());
            }
        });
        return jPanel;
    }
}

