package DemoPack;

public class BottlesBeer {
    public static void main(String[] args) {
       /* int beerNum = 10;
        String word = "bottles";
        while (beerNum > 0) {

            System.out.println(beerNum + " " + word + " of beer on the wall, " + beerNum + " " + word + " of beer");
            beerNum = beerNum - 1;

            if (beerNum == 1) {
                word = "bottle"; //ONE bottle
            }

            if (beerNum > 0) {
                System.out.println("Take one down, pass it round " + beerNum + " " + word + " of beer");
            }
        }

        if (beerNum == 0) {
            System.out.println("No more bottles of beer");


        }*/
//**** 2nd option
        for (int i = 99; i >= 0; i--) {
            if (i > 1) {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
                System.out.println("Take one down and pass it around, " + (i - 1) + " bottles of beer on the wall.");
            } else if (i == 1) {
                System.out.println(i + " bottle of beer on the wall, " + i + " bottle of beer.");
                System.out.println("Take one down and pass it around, " + (i - 1) + " bottle of beer on the wall.");
            } else if (i == 0) {
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
                System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
            }
        }
    }

    }


