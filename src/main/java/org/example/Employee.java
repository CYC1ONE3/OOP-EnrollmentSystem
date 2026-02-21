package org.example;

public class Employee {


    int employeeID;
    String employeeName;
    double employeeWeight;
    double employeeHeight;
    boolean civilStatus;

    public Employee() {
        this(1);

    }

    public Employee(int employeeID) {
        this(employeeID,  "Unknown");
        this.employeeID = employeeID;

    }

    public Employee(int employeeID, String employeeName) {
        this(employeeID, employeeName, 0);
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public Employee(int employeeID, String employeeName, double employeeWeight) {
        this(employeeID, employeeName, employeeWeight, 0);
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeWeight = employeeWeight;
    }

    public Employee(int employeeID, String employeeName, double employeeWeight, double employeeHeight) {
        this(employeeID, employeeName, employeeWeight, employeeHeight, false); //constructor chaining
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeWeight = employeeWeight;
        this.employeeHeight = employeeHeight;
    }



    public Employee(int employeeID, String employeeName, double employeeWeight, double employeeHeight, boolean civilStatus) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeWeight = employeeWeight;
        this.employeeHeight = employeeHeight;
        this.civilStatus = civilStatus;


    }

    public void display() {
        System.out.printf("Employee ID: %d \n", employeeID);
        System.out.printf("Employee Name: %s \n", employeeName);
        System.out.printf("Employee Weight: %.2f \n", employeeWeight);
        System.out.printf("Employee Height: %.2f \n", employeeHeight);

        // True: Married, False: Single
        if(civilStatus) {
            System.out.printf("Employee Civil Status: Married", civilStatus);
        }else{
            System.out.printf("Employee Civil Status: Single", civilStatus);
        }
/*public employee(){
        this("unknown"); Calls person(String Name
        public Person(String name)
        this(name, 0);
 */
    }
}
