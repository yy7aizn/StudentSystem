package com.achieve.student;

import com.achieve.student.Student;

import java.sql.*;

public class StudentInformationsql {
    public static Object[][] studata = new Object[99][5];

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
    public static int insert(Student student) {
        Connection conn = getConn();
        int i = 0;
        String sql = "insert into student (id,name,sex,clazz,password) values(?,?,?,?,?)";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setInt(1, student.getId());
            pstmt.setString(2, student.getName());
            pstmt.setString(3, student.getSex());
            pstmt.setString(4, student.getClazz());
            pstmt.setString(5, student.getPassword());
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
    public static int update(int id,String clazz,String password) {
        Connection conn = getConn();
        int i = 0;
        String sql = "update student set clazz='" + clazz + "',password='"+password+"' where id='" + id + "'";
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
        String sql = "select * from student";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();
            int i = 0;
            while (rs.next()) {
                studata[i][0] = rs.getInt(1);
                studata[i][1] = rs.getString(2);
                studata[i][2] = rs.getString(3);
                studata[i][3] = rs.getString(4);
                studata[i][4] = rs.getString(5);
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
        String sql = "delete from student where id='" + id + "'";
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
     *          班级
     * */
    public static String getclazz(int id){
        String clazz = null;
        Connection conn = getConn();
        String sql = "select * from student where id ='"+id+"'";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            int i = 0;
            while (rs.next()) {
                clazz = rs.getString(4);
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clazz;
    }
    /**
     *          姓名
     * */
    public static String getname(int id){
        String name = null;
        Connection conn = getConn();
        String sql = "select * from student where id ='"+id+"'";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            int i = 0;
            while (rs.next()) {
                name = rs.getString(2);
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return name;
    }
}
