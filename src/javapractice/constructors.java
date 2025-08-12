package javapractice;

class Person{

    private  int id;
    private String name;

    public Person(int id, String name ){
        this.name = name; // name and id are local variables of this constructor, whereas this.name , this.id means objects' variables
        this.id = id;

    }
//   public Person(){   // this is default constructor, we have not passed any value insdie the brackets
//         id = 3;
//         name = "karan";
//    }

    public void setid(int n){
        id = n;

    }
    public int getid(){
        return id;
    }
    public void setname(String naam){
       name = naam;
    }
    public String getname(){
       return name;
    }


}

public class constructors {
    public static void main(String[] args) {
        Person p1 = new Person(4,"karan");
      //  p1.setid(3); // passed 3 as the id number to the setter method
        System.out.println(p1.getid()); // called the getter method to print id
        System.out.println(p1.getname());

    }
}
