package DemoPack;

import java.util.Scanner;

public class InputToTwoD {

        public static void main(String[] args) {

            int[][] array = {{10, 20, 30, 40, 50, 60}, {55, 666, 78, 80, 90, 70}, {92, 100, 110, 120}, {130, 140, 150, 160}};

            printarray(array);

            System.out.println("The number for exchange from tab {10,..., 60} is: "  + array[0][3]);

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your value: ");

            int value = scan.nextInt();
            array[0][3]=value;

            System.out.println("The number 40 was changed to  " + value);
            printarray(array);

        }

        public static void printarray(int a[][]) {
            for (int row = 0; row < a.length; row++) {
                for (int column = 0; column < a[row].length; column++) {

                    System.out.print(a[row][column] + " ");

                }

                System.out.println();

           }

        }

    }






