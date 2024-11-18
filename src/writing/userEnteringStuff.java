package writing;

import javax.swing.*;

public class userEnteringStuff {
    public static String amount;

    public static int amountOfUsername(){
        amount = JOptionPane.showInputDialog("Enter the amount of usernames you would like to enter:");
        userWriteToFile.userWright();
        return Integer.parseInt(amount);
    }



}
