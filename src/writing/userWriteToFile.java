package writing;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static writing.FileWrite.scanner;
import static writing.userEnteringStuff.amount;

public class userWriteToFile {
    public static void userWright(){
        int loopAmount = Integer.parseInt(amount);
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\LeoDonnelly\\IdeaProjects\\JavaWriteToFile\\src\\writing\\logins.txt", true))){
            for(int i=0; i<loopAmount; i++){
                String input = scanner.next();
                writer.write(input);
                writer.newLine();
            }
        }catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        copyFile.copyFile();
    }
}
