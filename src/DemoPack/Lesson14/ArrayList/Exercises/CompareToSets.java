package DemoPack.Lesson14.ArrayList.Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class CompareToSets {

    static ArrayList<Integer> integerlist1 = new ArrayList<>();
    static Scanner reader1 = new Scanner(System.in);

    static ArrayList<Integer> integerlist2 = new ArrayList<>();
    static Scanner reader2 = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter an 1st array of numbers, type in 0 when finished!");
        int in = reader1.nextInt();
        while (in != 0) {
            integerlist1.add(in);
            in = reader1.nextInt();
        }

      //  PrintArray();

        System.out.println("Please enter an 2nd array of numbers, type in 0 when finished!");


        int in2 = reader2.nextInt();
        while (in2 != 0) {
            integerlist2.add(in2);
            in2 = reader2.nextInt();

        }
          PrintArray();
    }

    public static void PrintArray() {
        System.out.println("*******");
        for (int i : integerlist1) {
            System.out.println(i );

        }
        System.out.println("*****");
            for (int i : integerlist2) {
                System.out.println(i);


            }


        }
    }
