package DemoPack;

public class isPositive {
    public static void main(String[] args) {

isPositive(-2.5);
isPositive(10);
isPositive(8.9);
isPositive(-12.6);
    }

    private static boolean isPositive(double n) {

        boolean success = true;


        if (n >= 0) {

            success = true;
            System.out.println(n);
        } else if (n < 0) {

            success = false;
            System.out.println(n + "- Your number is less then zero");
        }

        return success;
    }
}