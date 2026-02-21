package org.example.service;
import org.example.model.Person;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonEnrollment {

    private ArrayList<Person> personArrayList = new ArrayList<>();
    private Scanner cyc = new Scanner(System.in);
    //Create
    public void addPerson(Person person){
        personArrayList.add(person);
    }

    //Read
    public void displayAll(){
        System.out.println(personArrayList);

    }

    //update
    public void updatePerson(Person person){

        for(int i = 0; i < personArrayList.size(); i++){
            if(personArrayList.get(i).getpersonID() == (person.getpersonID())) {
                System.out.println("Enter name: ");
                String name = cyc.nextLine();

                System.out.println("Enter age: ");
                int age = cyc.nextInt();
                personArrayList.set(i, new Person(person.getAge()));
                break;
            }
            }

    }

    //remove

    public String delete(Person person){
        for(int i = 0; i < personArrayList.size(); i++){
            if(personArrayList.get(i).getpersonID()  == (person.getpersonID())){
                personArrayList.remove(i);
                return "Successfully deleted";
            }
        }
        return "Error";
    }



    //remove
}
