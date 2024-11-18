package writing;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileWrite {
    public static Path source = Paths.get("C:\\Users\\LeoDonnelly\\IdeaProjects\\JavaWriteToFile\\src\\writing\\logins.txt");

    public static void main(String[] args) {
        createFile(String.valueOf(source));
    }

    public static void createFile (String source){
        try {
            File myFile = new File(source);
            if (myFile.createNewFile()) {
                System.out.println("File has been created: " + source);
            } else {
                System.out.println("File already exists in " + source);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        writeToFile();
    }

    public static void writeToFile(){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\LeoDonnelly\\IdeaProjects\\JavaWriteToFile\\src\\writing\\logins.txt", true))){
            int i;
            for(i=0; i<=499; i++){
                writer.write("username"+(i+1)+":password"+(i+1));
                writer.newLine();
            }
        }catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        moveFile();
    }

    public static void moveFile(){
        Path destination = Paths.get("C:\\Users\\LeoDonnelly\\IdeaProjects\\WeDunnoYet\\src\\dunno\\logins.txt");
        try{
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File has been copied to "+destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
