package com.achieve.subjectTable;

import com.achieve.score.Score;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SubjectTablesql {
    private static Connection getConn() {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/Information?serverTimezone=UTC";
        String username = "root";
        //改成你自己的数据库密码
        String password = "root";
        Connection conn = null;
        try {
            Class.forName(driver); //classLoader,加载对应驱动
            conn = (Connection) DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    /**
     *          教师姓名，科目插入
     * */
    public static int insert(String subjectTeacher,String subject) {
        Connection conn = getConn();
        int i = 0;
        String sql = "insert into subjectTable (subject,subjectTeacher) values(?,?)";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, subject);
            pstmt.setString(2, subjectTeacher);
            i = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
    /**
     *          学生姓名，学号，班级插入
     * */
    public static int update(String clazz,int id,String name,String subject) {
        Connection conn = getConn();
        int i = 0;
        String sql = "update subjecttable set clazz='" + clazz + "',id='"+id+"',name='"+name+"'where subject='" + subject + "'";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            i = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
    /**
     *              时间，教室插入
     * */
    public static int update(String subjectTeacher,String date,String classroom){
        Connection conn = getConn();
        int i = 0;
        String sql = "update subjecttable set date ='" + date + "',classroom='"+classroom+"'where subjectTeacher='" + subjectTeacher + "'";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            i = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
}
