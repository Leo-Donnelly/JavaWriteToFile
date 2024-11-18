package writing;

import java.io.File;
import java.io.IOException;

public class FileWrite {

    public static void main(String[] args) {

        createFile();

    }

    public static void createFile (){
        try {
            File myFile = new File("C:\\Users\\LeoDonnelly\\IdeaProjects\\JavaWriteToFile\\src\\writing\\logins.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
                System.out.println("Absolute path: " + myFile.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
