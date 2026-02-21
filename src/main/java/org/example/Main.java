package org.example;
import java.util.Scanner;

import java.util.ArrayList;

/*
public class Main {

    static Scanner cyc = new Scanner(System.in);
    static ArrayList<Person> persons = new ArrayList<>();

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n=== PERSON CRUD MENU ===");
            System.out.println("1. Create Person");
            System.out.println("2. View Persons");
            System.out.println("3. Update Person");
            System.out.println("4. Delete Person");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            choice = Integer.parseInt(cyc.nextLine());

            switch (choice) {
                case 1: createPerson(); break;
                case 2: readPersons(); break;
                case 3: updatePerson(); break;
                case 4: deletePerson(); break;
            }

        } while (choice != 5);
    }


    public static void createPerson() {
        System.out.print("Enter Name: ");
        String name = cyc.nextLine();

        System.out.print("Enter Age: ");
        int age = Integer.parseInt(cyc.nextLine());

        persons.add(new Person(name, age));
        System.out.println("Person added!");
    }


    public static void readPersons() {
        if (persons.isEmpty()) {
            System.out.println("No records found.");
            return;
        }

        for (int i = 0; i < persons.size(); i++) {
            System.out.println(i + " | " + persons.get(i).getName() + " | Age: " + persons.get(i).getAge());
        }
    }

    // ✅ UPDATE
    public static void updatePerson() {
        readPersons();
        if (persons.isEmpty()) return;

        System.out.print("Enter index to update: ");
        int index = Integer.parseInt(cyc.nextLine());

        System.out.print("New Name: ");
        String name = cyc.nextLine();

        System.out.print("New Age: ");
        int age = Integer.parseInt(cyc.nextLine());

        persons.get(index).setName(name);
        persons.get(index).setAge(age);

        System.out.println("Person updated!");
    }

    // ✅ DELETE
    public static void deletePerson() {
        readPersons();
        if (persons.isEmpty()) return;

        System.out.print("Enter index to delete: ");
        int index = Integer.parseInt(cyc.nextLine());

        persons.remove(index);
        System.out.println("Person deleted!");
    }
}
*/

public class Main {
    public static void main(String[] args) {
        Scanner cyc  = new Scanner(System.in);


        Student student = new Student();
        student.setName("John Doe");
        student.setID("0000123");
        student.setprogram("Information Technology");
        student.display();

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



        ArrayList<Person> persons = new ArrayList();



        System.out.print("Enter Name: " );
        String Name = cyc.nextLine();
        cyc.nextLine();

        System.out.print("Enter Age: " );
        String Age = cyc.nextLine();

        String choice = "y";


        while (choice.equalsIgnoreCase("y")) {

            System.out.print("Enter Name: ");
            String name = cyc.nextLine();

            System.out.print("Enter Age: ");
            int age = Integer.parseInt(cyc.nextLine());

            // create object using input
            Person p = new Person(name, age);
            persons.add(p);

            System.out.print("Add another person? (y/n): ");
            choice = cyc.nextLine();
        }
        Person p1 = new Person("John Doe", 64);
        Person p2 = new Person("Bob", 88);

        persons.add(p1);
        persons.add(p2);
        persons.add(new Person("Charlie", 90));
        persons.add(new Person("Wiljohn", 67));
        System.out.println(persons.get(0).getName());
        System.out.println(persons.get(0).getAge());

        persons.get(0).setName("Migs");
        persons.get(0).setAge(45);
        System.out.println(persons.get(0).getName());
        System.out.println(persons.get(0).getAge());

        persons.remove(0);


    }
}








