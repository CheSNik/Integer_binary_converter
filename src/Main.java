import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


/**
 * Assignment 5 E6.14 This program converts 10 digit integers to binary
 * @author Sergei Chekhonin
 */
public class Main {

    public static void main(String[] args) {
        //This block initialize printWriter and dateFormatter
        PrintWriter out = null;
        try {
            out = new PrintWriter("Assignment5_E6.14output.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        final JFrame frame = new JFrame();

        //initialisation of input dialog window
        String input = JOptionPane.showInputDialog("Enter your integer:");
        out.println("Enter your integer:");
        out.println(input);
        //Convert String input into Array and call convertion method
        ArrayList<Integer> arr =intToBinary(Integer.parseInt(input));

        //print out output
        out.println("Binary performance is:");
        for (int i: arr ) {
            out.println(i);
        }
        out.close();
        System.exit(0);

    }

    public static ArrayList<Integer> intToBinary(int n)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        while (n > 0)
        {
            arr.add( (n % 2 ) == 0 ? 0 : 1);
            n = n / 2;
        }
        return arr;
    }
}
