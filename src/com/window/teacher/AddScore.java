package com.window.teacher;

import com.achieve.score.Score;
import com.achieve.score.Scoresql;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddScore {
    private JFrame jFrame;
    private JPanel jPanel;
    private JLabel id;
    private JTextField idtxt;
    private JLabel subject;
    private JTextField subjecttxt;
    private JLabel subjectTeacher;
    private JTextField subjectTeachertxt;
    private JLabel member;
    private JTextField membertxt;
    private JLabel result;
    private JTextField resulttxt;
    private JButton insert;

    public void show(){
        jFrame = new JFrame();
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


        result = new JLabel("成绩");
        result.setBounds(30,80,50,30);
        jPanel.add(result);

        resulttxt = new JTextField();
        resulttxt.setBounds(100,80,100,30);
        jPanel.add(resulttxt);

        insert = new JButton("插入");
        insert.setBounds(60,130,100,30);
        jPanel.add(insert);

        insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Scoresql.update(Integer.parseInt(idtxt.getText()),Integer.parseInt(resulttxt.getText()));
            }
        });

        return jPanel;
    }

}
