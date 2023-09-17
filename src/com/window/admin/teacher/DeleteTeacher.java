package com.window.admin.teacher;

import com.achieve.teacher.TeacherInformationsql;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteTeacher {
    private JFrame jFrame;
    private JPanel jPanel;
    private JLabel id;
    private JTextField idtxt;
    private JButton delete;
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

        delete = new JButton("删除");
        delete.setBounds(60,280,80,30);
        jPanel.add(delete);
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TeacherInformationsql.delete(Integer.parseInt(idtxt.getText()));
            }
        });
        return jPanel;
    }
}


