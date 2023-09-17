package com.window.admin.teacher;

import com.achieve.subjectTable.SubjectTablesql;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClazzDate {
    private JFrame jFrame;
    private JPanel jPanel;
    private JLabel subjectTeacher;
    private JTextField subjectTeachertxt;
    private JLabel data;
    private JTextField datatxt;
    private JLabel classroom;
    private JTextField classroomtxt;
    private JButton set;

    public void show(){
        jFrame = new JFrame();
        jFrame.setBounds(400,100,500,500);
        jFrame.add(panel());
        jFrame.setVisible(true);
    }
    public JPanel panel(){
        jPanel = new JPanel(null);
        subjectTeacher = new JLabel("代课教师");
        subjectTeacher.setBounds(30,30,80,30);
        jPanel.add(subjectTeacher);

        subjectTeachertxt = new JTextField();
        subjectTeachertxt.setBounds(130,30,100,30);
        jPanel.add(subjectTeachertxt);

        data = new JLabel("上课时间");
        data.setBounds(30,80,80,30);
        jPanel.add(data);

        datatxt = new JTextField();
        datatxt.setBounds(130,80,100,30);
        jPanel.add(datatxt);

        classroom = new JLabel("教室");
        classroom.setBounds(30,130,80,30);
        jPanel.add(classroom);

        classroomtxt = new JTextField();
        classroomtxt.setBounds(130,130,100,30);
        jPanel.add(classroomtxt);

        set = new JButton("设置");
        set.setBounds(80,180,100,30);
        jPanel.add(set);
        set.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SubjectTablesql.update(subjectTeachertxt.getText(),datatxt.getText(),classroomtxt.getText());
            }
        });
        return jPanel;
    }
}
