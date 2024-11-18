package writing;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

import static writing.FileWrite.source;

public class createFile {
    public static void FileCreate (){
        try {
            File myFile = new File(String.valueOf(source));
            if (myFile.createNewFile()) {
                System.out.println("File has been created: " + source);
            } else {
                System.out.println("File already exists in " + source);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        choice();
    }
    public static void choice(){
        String userChoice = JOptionPane.showInputDialog(null, "Enter 1 for your file to be auto filled || Enter 2 for you to enter information into the file.");

        if(userChoice.equals("1")){
            autoWriteToFile.writeToFile();
        }else{
            userEnteringStuff.amountOfUsername();
        }
    }
}
