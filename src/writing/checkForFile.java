package writing;

import javax.swing.*;

import static writing.createFile.myFile;

public class checkForFile {
    public static void checkForFile(){
        if(myFile.exists()){
            int choice = JOptionPane.showConfirmDialog(null, "File already exists. Do you want to overwrite it?",
                    "Confirmation", JOptionPane.YES_NO_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                createFile.FileCreate();
            } else if (choice == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Program will now close.");
                System.exit(0);
            }
        }else{
            createFile.FileCreate();
        }
    }
}
