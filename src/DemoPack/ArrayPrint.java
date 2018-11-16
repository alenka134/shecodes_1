package DemoPack;

public class ArrayPrint {
    public static void main(String[] args) {

        System.out.println("Index       Value");
        int[] numbers = {29, 12, 13, 15, 13, 16, 17, 100, -90, 80, -60, 1, 12, 13, 15, 13, 16, 17, 100, -90};


        int length = numbers.length;

        for (int i = 0; i < length; i++) {

            System.out.println(i + "           " + numbers[i]);
        }

    }

}
