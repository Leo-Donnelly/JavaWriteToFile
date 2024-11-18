package writing;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import static writing.FileWrite.source;

public class copyFile {

    private static String showFileChooser() {
        // Create a JFileChooser instance
        JFileChooser fileChooser = new JFileChooser();

        // Set the dialog title
        fileChooser.setDialogTitle("Select a Folder");

        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        // Show the file chooser dialog and wait for the user's selection
        int result = fileChooser.showOpenDialog(null);

        // If the user selects a file, return the file path, otherwise return null
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFolder = fileChooser.getSelectedFile();
            return selectedFolder.getAbsolutePath();
        } else {
            return null;  // User canceled, return null
        }
    }

    public static void copyFile(){
        String destination = showFileChooser();
        Path destinationPath = Paths.get(destination,"logins.txt");
        //Path destination = Paths.get("C:\\Users\\LeoDonnelly\\IdeaProjects\\WeDunnoYet\\src\\dunno\\logins.txt");
        try{
            Files.copy(source, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File has been copied to "+destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
