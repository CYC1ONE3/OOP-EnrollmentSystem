package org.example.model;

public class Person {
    private int personID;
    private String name;
    private int age;

    //no-args constructor
    public Person(){

    }

    public Person(int personID, String name, int age){
        this.personID = personID;
        this.name = name;
        this.age = age;
    }

    public int getpersonID(){
        return personID;
    }

    public void setpersonID(int personID){
        this.personID = personID;
    }
    //getters
    public String getName(){
        return name;
    }
    //setters
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

