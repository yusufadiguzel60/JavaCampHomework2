package com.company;

public class Main {

    public static void main(String[] args) {
	    User student = new Student(1,"Yusuf","Adıgüzel","coderBro","12345.a","Java-React","C# Kampı");
        StudentManager studentManager = new StudentManager();
        studentManager.Login();
        studentManager.Logout();
        studentManager.TakeLesson();

        Instructor instructor = new Instructor(12562,"Engin","Demiroğ","engındemırog.1234","sdsds555","Java-React");
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.Login();
        instructorManager.Logout();
        instructorManager.AddLesson();
        instructorManager.DeleteLesson();
        instructorManager.UpdateLesson();

        User[] users = {student,instructor};

    }
}
