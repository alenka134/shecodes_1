package DemoPack;

import java.util.Random; // Generate random numbers with this library


public class randomTutorial {
    public static void main(String[] args) {
        Random rnd = new Random();
        System.out.println(rnd.nextInt(10));


        Random rand = new Random();
        int[] numbers = {10, 20, 30, 40, 50, 60};

        int num = rand.nextInt(6);

        for(int i=0; i < num; i++){
            System.out.print("* ");
        }
        System.out.println("\nIndex: " + num + "," + " Number: " + numbers[num]);

    }

}