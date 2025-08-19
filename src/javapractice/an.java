package javapractice;
class animal{
    String name;
    int age;
    public animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void bite(){
        System.out.println("the animal barks:::::");
    }
}

class Dog extends animal{
    public Dog(String name, int age){
        super(name,age); // called construction used in super class or animal class
    }
    // Dog-specified method
    public void bark(){
        System.out.println(getName()+ " is barking");
    }
}
public class an {
    public static void main(String[] args) {
        Dog d = new Dog("Tommy",2);
        d.bark();

        System.out.println("Dog's name: " +d.getName());
        System.out.println("Dog's age: " + d.getAge());




    }

}

