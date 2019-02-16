package DemoPack.Lesson13.Exceptions.TryAndCatch.Throw;

public class targil1 {

    public static void main(String[] args) {
        try {
            int[] arr = new int[10];
            System.out.println(arr[9001]);

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Problem with code detected");
        }
    }
}
   /* public static void main(String[] args) {

        {

           int[] arr = new int[9001];
            if (arr.length > 10) {
                throw new ArrayIndexOutOfBoundsException("Problem with code detected");
            }
            else {
                System.out.println("array is good enough!");
            }

        } */


