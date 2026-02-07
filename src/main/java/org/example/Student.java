package org.example;

public class Student {
    private String ID;
    private String Name;
    private String program;

    public Student(){

    }

    public Student(String ID, String Name, String program){
        this.ID = ID;
         this.Name = Name;
         this.program = program;

    }
    public String getID(){
        return ID;
    }
    public void setID(String ID){
        this.ID = ID;
        }

    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }
    public String getprogram(){
        return program;
    }

    public void setprogram(String program){
        this.program = program;
    }

public void display(){
    System.out.println("Student Name: " + getName());
    System.out.println("Student ID: " + getID());
    System.out.println("Student's Program: " + getprogram());
}


}


