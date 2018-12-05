package DemoPack;

import java.util.Scanner;

public class UserInputtillO {
    public static void main(String[] args) {

        System.out.println("Enter your number: ");
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        while (number > 0) {
            System.out.println("Enter a new number: ");
            scan = new Scanner(System.in);
            number = scan.nextInt();

            System.out.println("Your number is: " + number);

            if (number == 0) {
                System.out.println("Your number is: " + number + " your input is finished");
            }
        }
    }
}