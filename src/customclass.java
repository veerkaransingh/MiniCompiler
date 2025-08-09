import java.util.*;


 class Employee{ // created a custom class Employee without access modifier which can only come ones
    int id; //setting attributes or adjectives for this employee
    String name;
    int salary;

    public void printDetails(){
        System.out.println("The id of employee is " + id);
        System.out.println("The name of employee is "+ name);
    }
    public int getSalary(){
        return salary;
    }

}
public class customclass {
    public static void main(String[] args) {
        System.out.println("Lets write a custom class");
        Employee karan = new Employee(); // instantiation of a new employee object
        Employee Aman = new Employee(); // instantiation of an employee object

        // Setting properties for karan
        karan.id = 2343;
        karan.name = "Preparingforinterview";
        karan.salary = 1000;

        // Setting properties for jogi
        Aman.id  = 233;
        Aman.name = "Goodguy";
        Aman.salary = 44499;

        karan.printDetails();
        System.out.println(karan.getSalary());

        Aman.printDetails();
        System.out.println(Aman.getSalary());


       // System.out.println(karan.id);
       // System.out.println(karan.name);
    }

}
