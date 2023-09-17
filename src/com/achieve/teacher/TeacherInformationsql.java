package com.achieve.teacher;

import java.sql.*;

public class TeacherInformationsql {
    public static Object[][] teadata = new Object[99][6];
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
     *          插入
     * */
    public static int insert(Teacher teacher) {
        Connection conn = getConn();
        int i = 0;
        String sql = "insert into teacher (id,name,subject,sex,phone,password) values(?,?,?,?,?,?)";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setInt(1, teacher.getId());
            pstmt.setString(2, teacher.getName());
            pstmt.setString(3, teacher.getSubject());
            pstmt.setString(4, teacher.getSex());
            pstmt.setInt(5, teacher.getPhone());
            pstmt.setString(6,teacher.getPassword());
            i = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
    /**
     *          修改
     * */
    public static int update(int id,int phone ,String password) {
        Connection conn = getConn();
        int i = 0;
        String sql = "update teacher set phone='" + phone + "',password='"+password+"' where id='" + id + "'";
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
     *          查询
     * */
    public static Integer getAll() {
        Connection conn = getConn();
        String sql = "select * from teacher";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();
            int i = 0;
            while (rs.next()) {
                teadata[i][0] = rs.getInt(1);
                teadata[i][1] = rs.getString(2);
                teadata[i][2] = rs.getString(3);
                teadata[i][3] = rs.getString(4);
                teadata[i][4] = rs.getInt(5);
                teadata[i][5] = rs.getString(6);
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     *          删除
     * */
    public static int delete(int id) {
        Connection conn = getConn();
        int i = 0;
        String sql = "delete from teacher where id='" + id + "'";
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
