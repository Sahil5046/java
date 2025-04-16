import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        //create a new file
        // File myfile = new File("hello.txt");
        // try
        // {
        //     myfile.createNewFile();
        // }catch(IOException e)
        // {
        //     System.out.println("Your file is not created...");
        //     e.printStackTrace();
        // }


        // now write into this file..
        // try {
        //     FileWriter wr = new FileWriter("hello.txt");
        //     wr.write("hi, this is your first file from java.\n hi, i am sk md sahil");
        //     wr.close();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }


        //read a file
        // File myfile = new File("hello.txt");
        // try {
        //     Scanner in = new Scanner(myfile);
        //     while(in.hasNextLine())
        //     {
        //         String line = in.nextLine();
        //         System.out.println(line);
        //     }
        //     in.close();
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }

        //deleting a file
        File myfile = new File("hello.txt");
        if(myfile.delete())
        {
            System.out.println("Your file is deleted: " + myfile.getName());
        }
        else
        {
            System.out.println("There are some issue occure.");
        }
    }
}
