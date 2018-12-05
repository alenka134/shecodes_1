package DemoPack;

import java.util.Scanner;

public class TwoDExchange {
    public static void main(String[] args) {

        int[][] array = {{10, 20, 30, 40, 50, 60}, {55, 666, 78, 80, 90, 70}, {92, 100, 110, 120}, {130, 140, 150, 160}};

        printarray(array);

        System.out.println("The fourth number from " + "{10,..., 60}: " + array[0][3]);


    }

    public static void printarray(int a[][]) {
        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[row].length; column++) {

                System.out.print(a[row][column] + " ");

            }

            System.out.println();

        }

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter The Number Of Matrix Rows");

        int matrixRow = scan.nextInt();


        System.out.println("Enter The Number Of Matrix Columns");

        int matrixCol = scan.nextInt();

        //defining 2D array to hold matrix data
        int[][] matrix = new int[matrixRow][matrixCol];

        // Enter Matrix Data
        enterMatrixData(scan, matrix, matrixRow, matrixCol);

        // Print Matrix Data
        printMatrix(matrix, matrixRow, matrixCol);
    }

    public static void enterMatrixData(Scanner scan, int[][] matrix, int matrixRow, int matrixCol){
        System.out.println("Enter Matrix Data");

        for (int i = 0; i < matrixRow; i++)
        {
            for (int j = 0; j < matrixCol; j++)
            {
                matrix[i][j] = scan.nextInt();
            }
        }
    }

    public static void printMatrix(int[][] matrix, int matrixRow, int matrixCol){
        System.out.println("Your Matrix is : ");

        for (int i = 0; i < matrixRow; i++)
        {
            for (int j = 0; j < matrixCol; j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }

            System.out.println();
        }

    }

}




