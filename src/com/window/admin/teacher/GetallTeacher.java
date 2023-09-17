package com.window.admin.teacher;

import com.achieve.teacher.TeacherInformationsql;

import javax.swing.*;

public class GetallTeacher {
    private JFrame jFrame;
    private JPanel jPanel;
    private Object[] heard = new Object[]{"工号","姓名","科目","性别","固话","密码"};
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
        Object [][]data = new Object[99][6];
        TeacherInformationsql.teadata = data;
        TeacherInformationsql.getAll();
        table = new JTable(TeacherInformationsql.teadata,heard);
        jScrollPane = new JScrollPane(table);
        jScrollPane.setBounds(0,0,500,500);
        jPanel.add(jScrollPane);
        return jPanel;
    }
}

