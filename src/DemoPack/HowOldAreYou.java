package DemoPack;

import java.io.DataInputStream;
import java.util.Scanner;

public class HowOldAreYou {
    public static void main(String[] args) {
        String s;
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        s = in.nextLine();


        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("OK, " + s + ", how old are you? ");
        int n = reader.nextInt(); // Scans the next token of the input as an int.
//once finished
        reader.close();


       if (n <= 0 || n >= 100)

            System.out.println(s + ", please, enter correct number");



        if (n <= 25) {
            System.out.println("You can't rent a car");

            if (n <= 18)
                System.out.println("You can't vote");

            if (n <= 16)
                System.out.println("You can't drive");

        } else if (n >= 25) {
            System.out.println("You can do anything that's legal");

        }

    }
}






