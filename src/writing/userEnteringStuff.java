package writing;

import javax.swing.*;

public class userEnteringStuff {

    public static int amountOfUsername(){
        String amount = JOptionPane.showInputDialog("Enter the amount of usernames you would like to enter:");
        return Integer.parseInt(amount);
    }
}
