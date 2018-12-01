package DemoPack;

import java.util.Random;

public class RandomFrom1 {
    public static void main(String[] args) {


        Random rnd = new Random();

        int[] numbers = {10, 20, 30};

        int num = rnd.nextInt(2) +1;



        System.out.println("Index: " + num + " Value: " + numbers[num]);

       }
    }

