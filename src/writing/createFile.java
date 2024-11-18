package writing;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

import static writing.FileWrite.source;

public class createFile {

    public static File myFile = new File(String.valueOf(source));

    public static void checkForFile(){
        if(myFile.exists()){
            int choice = JOptionPane.showConfirmDialog(null, "File already exists. Do you want to overwrite it?",
                    "Confirmation", JOptionPane.YES_NO_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                FileCreate();
            } else if (choice == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Program will now close.");
                System.exit(0);
            }
        }
    }

    public static void FileCreate (){
        try {
            if (myFile.createNewFile()) {
                System.out.println("File has been created: " + source);
            } else if(myFile.delete()){
                System.out.println("File has been deleted: " + source);
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        choice();
    }
    public static void choice(){
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to add information to the file?",
                "Confirmation", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            userEnteringStuff.amountOfUsername();
        } else if (choice == JOptionPane.NO_OPTION) {
            autoWriteToFile.writeToFile();
        }
    }
}
