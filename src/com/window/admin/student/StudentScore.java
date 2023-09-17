package com.window.admin.student;

import com.achieve.score.Scoresql;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentScore {
    private JFrame jFrame;
    private JPanel jPanel;
    private JLabel id;
    private JTextField idtxt;
    private JLabel score;
    private JTextField scoretxt;
    private JButton updata;
    public void show(){
        jFrame = new JFrame();
        jFrame.setBounds(400,100,500,500);

        jFrame.setVisible(true);
    }
    public JPanel panel() {
        jPanel = new JPanel(null);
        id = new JLabel("学号");
        id.setBounds(30, 30, 50, 30);
        jPanel.add(id);

        idtxt = new JTextField();
        idtxt.setBounds(100, 30, 100, 30);
        jPanel.add(idtxt);

        score = new JLabel("成绩");
        score.setBounds(30, 80, 50, 30);
        jPanel.add(score);

        scoretxt = new JTextField();
        scoretxt.setBounds(100, 80, 100, 30);
        jPanel.add(scoretxt);

        updata = new JButton("修改");
        updata.setBounds(60, 130, 100, 30);
        jPanel.add(updata);

        updata.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Scoresql.update(Integer.parseInt(idtxt.getText()), Integer.parseInt(scoretxt.getText()));
            }
        });
        return jPanel;
    }
}
