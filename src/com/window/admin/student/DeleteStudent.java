package com.window.admin.student;

import com.achieve.score.Scoresql;
import com.achieve.student.Student;
import com.achieve.student.StudentInformationsql;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class DeleteStudent {
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

        id = new JLabel("学号");
        id.setBounds(30,30,50,30);
        jPanel.add(id);

        idtxt = new JTextField();
        idtxt.setBounds(100,30,100,30);
        jPanel.add(idtxt);

        delete = new JButton("删除");
        delete.setBounds(60,280,80,30);
        jPanel.add(delete);
        delete.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentInformationsql.delete(Integer.parseInt(idtxt.getText()));
                Scoresql.delete(Integer.parseInt(idtxt.getText()));
            }
        });
        return jPanel;
    }
}

