package com.window;

import com.achieve.student.StudentInformationsql;
import com.achieve.teacher.TeacherInformationsql;
import com.window.admin.Menue;
import com.window.admin.Registered;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Login {
    private JFrame jFrame;
    private JPanel jPanel;
    private JLabel user;
    private JLabel password;
    private JTextField usertxt;
    private JTextField passwordtxt;
    private JButton login;
    private JButton registered;
    public static String subject;
    public static int id;
    public void show(){
        jFrame = new JFrame("学生成绩管理系统");
        jFrame.setBounds(700,200,400,300);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.add(panel());
        jFrame.setVisible(true);
    }
    public JPanel panel(){
        jPanel = new JPanel(null);

        user = new JLabel("用户名");
        user.setBounds(50,50,50,30);
        jPanel.add(user);

        usertxt = new JTextField();
        usertxt.setBounds(120,50,100,30);
        jPanel.add(usertxt);

        password = new JLabel("密码");
        password.setBounds(50,100,50,30);
        jPanel.add(password);

        passwordtxt = new JTextField();
        passwordtxt.setBounds(120,100,100,30);
        jPanel.add(passwordtxt);

        login = new JButton("登录");
        login.setBounds(80,150,70,30);
        jPanel.add(login);

        registered = new JButton("注册");
        registered.setBounds(170,150,70,30);
        jPanel.add(registered);

        login.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentInformationsql.getAll();
                TeacherInformationsql.getAll();
                String user = usertxt.getText();
                String password = passwordtxt.getText();
                for (int i = 0; i <StudentInformationsql.studata.length ; i++) {
                    //学生
                    if (user.equals(StudentInformationsql.studata[i][0]+"")&password.equals(StudentInformationsql.studata[i][4]+"")){
                        id = Integer.parseInt(user);
                        new com.window.student.Menue().show();
                        jFrame.setVisible(false);
                        break;
                        //教师
                    }else if (user.equals(TeacherInformationsql.teadata[i][0]+"")&password.equals(TeacherInformationsql.teadata[i][5]+"")){
                       subject  = TeacherInformationsql.teadata[i][2]+"";
                        new com.window.teacher.Menue().show();
                        jFrame.setVisible(false);
                        break;
                        //管理员
                    }else if (user.equals("admin")&password.equals("admin")){
                        new Menue().show();
                        jFrame.setVisible(false);
                        break;
                    }
                }
            }
        });
        registered.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Registered().show();
            }
        });
        return jPanel;
    }
}