package javapractice;

class MyEmployee{
   private int id;
   private String name;

   public void setName(String naam){
       name = naam;
   }
   public String getName(){ //will return something
       return name;
   }

   public void setId(int i){
       id = i;
   }
   public int getId(){
       return id;
   }
}

public class accessmodifiers {
    public static void main(String[] args) {
       MyEmployee karan = new MyEmployee(); //instantiation of an object
  //     karan.id = 34;
  //     karan.name = "Codewithkaran"; -- throws an error due to private access modifier

        karan.setName("karanprep");
        System.out.println(karan.getName());
        karan.setId(23);
        System.out.println(karan.getId());
    }

}
