package DemoPack;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AgeDate {


    public static void main(String[] args) {

        java.util.Date date = new java.util.Date();
        System.out.println(date);

        Date currentYear = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        System.out.println("Now is " + sdf.format(currentYear) + " year");

        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String phrase1 = sc.nextLine();
        System.out.println(phrase1 + ", please enter your age and after enter this year");

        Scanner scan = new Scanner(System.in);

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        System.out.println(phrase1 + " , your birth date is: " + (number2 - number1));

    }

}
