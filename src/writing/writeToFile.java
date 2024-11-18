package writing;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writeToFile {
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
        copyFile.copyFile();
    }
}
