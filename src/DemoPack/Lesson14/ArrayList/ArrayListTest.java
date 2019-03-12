package DemoPack.Lesson14.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {


    static Scanner reader = new Scanner(System.in);
    static ArrayList<Integer> array = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Please enter an array of numbers, type in 0 when finished!");
        int in = reader.nextInt();
        while (in != 0) {
            array.add(in);
            in = reader.nextInt();
        }

        PrintArray();

        System.out.println("What number would you like to delete?");
        int del = reader.nextInt();
        for (int i = 0; i < array.size(); i++) {

            if (array.get(i) == del) {
                array.remove(i);
                break;
            }
        }
        //Break will put us here
        PrintArray();
    }

    public static void PrintArray() {
        System.out.println("*******");
        for (int i : array) {
            System.out.println(i);
        }
    }
}