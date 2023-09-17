package com.achieve.teacher;

public class Teacher {
    private int id;
    private String name;
    private String subject;
    private String sex;
    private int phone;
    private String password;

    public Teacher() {
    }

    public Teacher(int id, String name, String subject, String sex, int phone,String password) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.sex = sex;
        this.phone = phone;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
