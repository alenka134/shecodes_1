package DemoPack;

import java.util.Scanner;

public class GetNumMax {
    static int secondHighest(int... nums) {
        int high1 = Integer.MIN_VALUE;
        int high2 = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > high1) {
                high2 = high1;
                high1 = num;
            } else if (num > high2) {
                high2 = num;
            }
        }
        return high2;
    }
    public static void main(String[] args) {
        System.out.println("How many numbers? (minimum 2)?:");

        Scanner reader = new Scanner(System.in);
        if (reader.hasNextInt()) {
            int numbers = reader.nextInt();
            int[] array = new int[numbers];

            if (numbers >= 2) {
                System.out.println("Enter value #1");

                if (reader.hasNextInt()) {
                    int num1 = reader.nextInt();
                    array[0] = num1;
                    System.out.println("Enter value #2");

                    if (reader.hasNextInt()) {
                        int num2 = reader.nextInt();
                        array[1] = num2;
                        int biggest = 0;

                        for (int i = 3; i <= numbers; i++) {
                            System.out.println("Enter value #" + i);
                            int num3 = reader.nextInt();
                            array[i-1] = num3;
                        }
                        System.out.println("Second largest number is: " + secondHighest(array));
                        int largest = 0;

                        for(int i =0;i<array.length;i++) {
                            if(array[i] > largest) {
                                largest = array[i];
                            }
                        }

                        System.out.println("Largest number in array is: " +largest);

                    } else {
                        System.out.println("Please enter an integer");
                    }

                } else {
                    System.out.println("Please enter an integer");
                }
            } else {
                System.out.println("Please enter an integer equal or higher than 2.");
            }
        } else {
            System.out.print("Vennligst oppgi et heltall større eller lik 2.");
        }
    }
}
