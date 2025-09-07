package Exception_handling;

public class Nested_try_catch {
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        try{
            System.out.println("Welcome Here!");
        }catch(Exception e){
            System.out.println("Exception in level one");
            System.out.println(e);

        }
    }
}
