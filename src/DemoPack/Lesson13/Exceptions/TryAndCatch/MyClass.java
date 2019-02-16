package DemoPack.Lesson13.Exceptions.TryAndCatch;

public class MyClass {
    public static void main(String[] args) {

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[4]); // error, because myNumbers[4] does not exist.
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}