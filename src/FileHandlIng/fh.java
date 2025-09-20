package FileHandlIng;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fh {
    public static void main(String[] args) throws IOException {
        /*File myFile = new File("cwk111file.txt"); // created a file object
        /*try {
            myFile.createNewFile();// running a method which helps to create a new file
        } catch (IOException e) {
            System.out.println("unable to create this file");
            e.printStackTrace();
        }*/

        // Writing into a file
        try {
            FileWriter fileWriter = new FileWriter("cwk111file.txt", true);// for writing something in the file
            // true keeps the old content
            fileWriter.write("This is our first file from this java course\nh h h ");
            fileWriter.close(); // closing the file after writing into the file
        }catch (IOException e){
            e.printStackTrace();
        }

        //Reading a file
        File myFile = new File("/Users/btown/IdeaProjects/MiniCompiler/src/FileHandlIng/this.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()) { // will read if file has any next line after reading the first one
                String line = sc.nextLine();
                System.out.println(line);
            }sc.close();
        }catch (FileNotFoundException e){ // e is an object containing information about the error, The error message and where in the program error happened
            e.printStackTrace();

        }

     /*   File myfile = new File("cwk111.txt"); // created a new object of File class
        if(myfile.delete()){ // for deleting af file
            System.out.println("I have deleted: " + myfile.getName());
        }else{
            System.out.println("Some problem occured while deleting the file");
        }
*/
    }
}
