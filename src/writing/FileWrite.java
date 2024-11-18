package writing;

import java.io.*;

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
        writeToFile();
    }

    public static void writeToFile(){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\LeoDonnelly\\IdeaProjects\\JavaWriteToFile\\src\\writing\\logins.txt", true))){
            int i;
            for(i=0; i<=50; i++){
                writer.write("username"+(i+1)+":password"+(i+1));
                writer.newLine();
            }
        }catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
