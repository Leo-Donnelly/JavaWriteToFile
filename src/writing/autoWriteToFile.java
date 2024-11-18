package writing;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static writing.GenerateSecurePasswords.generatePasswords;

public class autoWriteToFile {
    public static void writeToFile(){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\LeoDonnelly\\IdeaProjects\\JavaWriteToFile\\src\\writing\\logins.txt", true))){
            int i;
            for(i=0; i<=499; i++){
                String randomPass = generatePasswords(12);
                writer.write("username"+(i+1)+":"+randomPass);
                writer.newLine();
            }
        }catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        copyFile.copyFile();
    }
}
