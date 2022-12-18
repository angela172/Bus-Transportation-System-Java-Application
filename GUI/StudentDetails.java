package GUI;
// Java Program to write into a File
// Using BufferedWriter Class
 
// Importing java input output libraries
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import Classes.*;
 
// Main class
public class StudentDetails{
    private Object a;
   
   
    public void writeDetails(String s){
        
        try {
            String h= s.toString(); 
            // Step 1: Create an object of BufferedWriter
            BufferedWriter f_writer
                = new BufferedWriter(new FileWriter(
                    "loginDetails.txt"));
 
            // Step 2: Write text(content) to file
            f_writer.write(s);
 
            // Step 3: Printing the content inside the file
            // on the terminal/CMD
            System.out.print(s);
 
            // Step 4: Display message showcasing
            // successful execution of the program
            System.out.print(
                "File is created successfully with the content.");
 
            // Step 5: Close the BufferedWriter object
            f_writer.close();
        }
 
        // Catch block to handle if exceptions occurs
        catch (IOException e) {
 
            // Print the exception on console
            // using getMessage() method
            System.out.print(e.getMessage());
        }
    }
}
