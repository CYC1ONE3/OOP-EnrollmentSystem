package org.example;
public class Main {
    public static void main(String[] args){

       Student student = new Student();
        student.setName("John Doe");
        student.setID("0000123");
        student.setprogram("Information Technology");

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getID());
        System.out.println("Student's Program: " + student.getprogram());

        Course course = new Course();
        course.setcourseName("Inteprog");
        course.setcourseID("00001");
        course.setprogram("BSIT");

        System.out.println("Course Name: " + course.getcourseName());
        System.out.println("Course ID: " + course.getcourseID());
        System.out.println("Course Program: " + course.getprogram());
    }

}



