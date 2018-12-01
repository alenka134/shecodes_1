package DemoPack;

public class TwoDString {
    public static void main(String[] args) {

        String[][] letters = {{"a", "b", "c"}, {"d", "e", "f"}};
        // String[][] letters = new String[2][3];

        System.out.println("Print letter f from " + "def: "  + letters[1][2]);

        for (int i = 0; i < letters.length; i++) {

            for (int j = 0; j < letters[0].length; j++) {


                System.out.print(letters[i][j] + " ");

            }

            System.out.println();

        }

    }

}

