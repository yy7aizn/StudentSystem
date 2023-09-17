package com.window.admin.student;

import com.achieve.student.StudentInformationsql;

import javax.swing.*;

public class GetallStudent {
    private JFrame jFrame;
    private JPanel jPanel;
    private Object[] heard = new Object[]{"学号","姓名","性别","班级","密码"};
    private JTable table;
    private JScrollPane jScrollPane;

    public void show(){
        jFrame = new JFrame("查询");
        jFrame.setBounds(500,100,500,500);
        jFrame.add(panel());
        jFrame.setVisible(true);
    }
    public JPanel panel(){
        jPanel = new JPanel(null);
        Object [][]data = new Object[99][5];
        StudentInformationsql.studata = data;
        StudentInformationsql.getAll();
        table = new JTable(StudentInformationsql.studata,heard);
        jScrollPane = new JScrollPane(table);
        jScrollPane.setBounds(0,0,500,500);
        jPanel.add(jScrollPane);
        return jPanel;
    }
}
