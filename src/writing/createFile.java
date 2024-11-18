package writing;

import java.io.File;
import java.io.IOException;

import static writing.FileWrite.source;

public class createFile {
    public static void createFile (){
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
        writeToFile.writeToFile();
    }
}
