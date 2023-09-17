package com.window.student;

import com.achieve.score.Scoresql;
import com.achieve.student.StudentInformationsql;
import com.achieve.subjectTable.SubjectTable;
import com.achieve.subjectTable.SubjectTablesql;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ChooseSubject {
    private JFrame jFrame;
    private JPanel jPanel;
    private JLabel id;
    private JTextField idtxt;
    private JLabel subject;
    private JTextField subjecttxt;
    private JLabel subjectTeacher;
    private JTextField subjectTeachertxt;
    private JButton choose;

    public void show(){
        jFrame = new JFrame("选课");
        jFrame.setBounds(500,100,500,500);
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

        subject = new JLabel("课程");
        subject.setBounds(30,80,50,30);
        jPanel.add(subject);

        subjecttxt = new JTextField();
        subjecttxt.setBounds(100,80,100,30);
        jPanel.add(subjecttxt);


        subjectTeacher = new JLabel("代课老师");
        subjectTeacher.setBounds(30,130,50,30);
        jPanel.add(subjectTeacher);

        subjectTeachertxt = new JTextField();
        subjectTeachertxt.setBounds(100,130,100,30);
        jPanel.add(subjectTeachertxt);

        choose = new JButton("选择");
        choose.setBounds(60,180,100,30);
        jPanel.add(choose);
        choose.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Scoresql.update(Integer.parseInt(idtxt.getText()), subjecttxt.getText(),subjectTeachertxt.getText());
                SubjectTablesql.update(StudentInformationsql.getclazz(Integer.parseInt(idtxt.getText())),Integer.parseInt(idtxt.getText()),StudentInformationsql.getname(Integer.parseInt(idtxt.getText())),subjecttxt.getText());
                System.out.println(StudentInformationsql.getname(Integer.parseInt(idtxt.getText())));
            }
        });
        return jPanel;
    }
}
