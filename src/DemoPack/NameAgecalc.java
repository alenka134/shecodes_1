package DemoPack;

import java.util.Scanner;

public class NameAgecalc {

        public static void main(String[] args) {

            System.out.println("What is your name?");

            Scanner sc = new Scanner(System.in);

            String phrase1 = sc.nextLine();

            System.out.println("Hi, " + phrase1 +  "! How old are you?");

            Scanner scan = new Scanner(System.in);

            int number1 = scan.nextInt();


            System.out.println(phrase1 + "did you know that in five years you will be " + (number1 + 5) + " years old? \n" +
                    "And five years ago you were  " + (number1 - 5) + "! Imagine that!");

        }
    }


