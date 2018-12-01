package DemoPack;

public class TwoDArray {                                    //Start of class
    public static void main(String[] args) {               //Start of main
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        printarray(array);

         }

        public static void printarray ( int a[][]) {        // Start of printarray method
            for (int row = 0; row < a.length; row++) {      //Start of row for loop
                for (int column = 0; column < a[row].length; column++) { //Start of column for loop
                    System.out.print(a[row][column] + " ");

                }                                           // End of column for loop

                System.out.println();

            }                                               // End of row for loop

        }                                                   //End of printarray method

    }                                                       // End of class
