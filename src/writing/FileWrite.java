package writing;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileWrite {
    public static final Path source = Paths.get("C:\\Users\\LeoDonnelly\\IdeaProjects\\JavaWriteToFile\\src\\writing\\logins.txt");
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        checkForFile.checkForFile();
    }
}
