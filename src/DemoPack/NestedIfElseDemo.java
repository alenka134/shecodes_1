package DemoPack;

public class NestedIfElseDemo {
    public static void main(String[] args) {
        int temperature = 38;
        boolean isRaining = false;

        if (temperature > 35) {

            System.out.println("It is sunday");

            if (isRaining) {

                System.out.println("Bring umbrella");
            } else {
                System.out.println("Bring sunglasses");
            }
        }
        else {
            System.out.println("wear jeans");
        }
    }
}