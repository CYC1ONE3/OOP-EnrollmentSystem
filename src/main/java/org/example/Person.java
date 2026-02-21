package org.example;

public class Person {
    private String name;
    private int age;

    //no-args constructor
    public Person(){

    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
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