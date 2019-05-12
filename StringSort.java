/**
 * StringSort.java
 * James Jutt
 * 2/13/19
 * Application that allows the user to enter up to 15 Strings and stores them in an array.
 * The user can quit early. The app will then display the strings entered in alphabetical order
 */
import javax.swing.JOptionPane;
import java.util.Arrays;
public class StringSort 
{
    public static void main(String[] args) 
    {
        // Variables and Constants
        String[] userValues = new String[15];
        final String QUIT = "zzz";
        int x; // This is a throwaway varible for the loops
        int count = 0;
        String userWord; // Holds what user enters
        boolean didUserQuit = false;

        // for loop that fills our array with dummy values so the length starts out at the size of the array
        for (x = 0; x < userValues.length; x++) 
        {
            userValues[x] = "zzzz";
        }
        
        // Reset our throw away variable to zero
        x = 0;
        
        // While loop that first checks if there is space in the array. While that is true, it will continue
        while (x < userValues.length) 
        {
            userWord = JOptionPane.showInputDialog(null, "Enter a word or type " + QUIT + " to quit now.");

            // Decide if the user entered the QUIT command or entered a valid word
            if (userWord.equalsIgnoreCase(QUIT)) 
            {
                count = x;
                x = userValues.length;
                didUserQuit = true;
            }
            else
            {
                userValues[x] = userWord;
                x++;
            }
        }
        Arrays.sort(userValues);
        String message = "Values: ";

        for (x = 0; x < count; x++) 
        {
            message = message + "\n" + userValues[x];
        }
        JOptionPane.showMessageDialog(null, message);
    }
}