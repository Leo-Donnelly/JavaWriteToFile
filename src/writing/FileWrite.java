package writing;

import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileWrite {
    public static Path source = Paths.get("C:\\Users\\LeoDonnelly\\IdeaProjects\\JavaWriteToFile\\src\\writing\\logins.txt");

    public static void main(String[] args) {
        createFile.createFile();
    }

//    private static String showFileChooser() {
//        // Create a JFileChooser instance
//        JFileChooser fileChooser = new JFileChooser(); CAN YOU KICK ME OUT PLS I DONT WANT TO BREAK IT
//
//        // Set the dialog title
//        fileChooser.setDialogTitle("Select a Folder");
//
//        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//
//        // Show the file chooser dialog and wait for the user's selection
//        int result = fileChooser.showOpenDialog(null);
//
//        // If the user selects a file, return the file path, otherwise return null
//        if (result == JFileChooser.APPROVE_OPTION) {
//            File selectedFolder = fileChooser.getSelectedFile();
//            return selectedFolder.getAbsolutePath();
//        } else {
//            return null;  // User canceled, return null
//        }
//    }

//    public static void createFile (String source){
//        try {
//            File myFile = new File(source);
//            if (myFile.createNewFile()) {
//                System.out.println("File has been created: " + source);
//            } else {
//                System.out.println("File already exists in " + source);
//            }
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//        writeToFile.writeToFile();
//    }

//    public static void writeToFile(){
//        try(BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\LeoDonnelly\\IdeaProjects\\JavaWriteToFile\\src\\writing\\logins.txt", true))){
//            int i;
//            for(i=0; i<=499; i++){
//                writer.write("username"+(i+1)+":password"+(i+1));
//                writer.newLine();
//            }
//        }catch (IOException e){
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//        copyFile.copyFile();
//    }

//    public static void copyFile(){
//        String destination = showFileChooser();
//        Path destinationPath = Paths.get(destination,"logins.txt");
//        //Path destination = Paths.get("C:\\Users\\LeoDonnelly\\IdeaProjects\\WeDunnoYet\\src\\dunno\\logins.txt");
//        try{
//            Files.copy(source, destinationPath, StandardCopyOption.REPLACE_EXISTING);
//            System.out.println("File has been copied to "+destination);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
