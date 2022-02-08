package com.company;

public class Student extends User {

    private String lessons;
    private String doneOfTheLessons;

    public Student(int id, String firstName, String lastName, String userName, String password, String lessons, String doneOfTheLessons) {
        super(id,firstName,lastName,userName,password);
        this.setLessons(lessons);
        this.setDoneOfTheLessons(doneOfTheLessons);
    }

    public String getLessons() {
        return lessons;
    }

    public void setLessons(String lessons) {
        this.lessons = lessons;
    }

    public String getDoneOfTheLessons() {
        return doneOfTheLessons;
    }

    public void setDoneOfTheLessons(String doneOfTheLessons) {
        this.doneOfTheLessons = doneOfTheLessons;
    }
}
