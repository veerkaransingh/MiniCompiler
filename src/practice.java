
class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String naam){
        name = naam;
    }
}

public class practice {
    public static void main(String[] args) {
        Employee1 karan = new Employee1();

        karan.getSalary();
        karan.setName("Coding With Karan");
        karan.salary = 111222;
        System.out.println(karan.getSalary());
        System.out.println(karan.getName());

        }
    }
