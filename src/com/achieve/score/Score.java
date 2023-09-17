package com.achieve.score;

public class Score {
    private int id;
    private String subject;
    private String subjectTeacher;
    private String member;
    private int result;

    public Score() {
    }

    public Score(int id, String subject, String subjectTeacher, String member,int result) {
        this.id = id;
        this.subject = subject;
        this.subjectTeacher = subjectTeacher;
        this.member = member;
        this.result = result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubjectTeacher() {
        return subjectTeacher;
    }

    public void setSubjectTeacher(String subjectTeacher) {
        this.subjectTeacher = subjectTeacher;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
