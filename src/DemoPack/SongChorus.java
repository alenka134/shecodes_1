package DemoPack;

public class SongChorus {

    public static void main(String[] args) {
        String str1 = "Girls, we run this motha, yeah";
        String str2 = "Who run the word?";
        for (int i = 0; i < 4; i++) {
            System.out.println(str1);
        }

        printGirls(str2);

        System.out.println("Some of them men think\n" +
                "They freak this like we do\n" +
                "But no they don't\n" +
                "Make your check come at they neck\n" +
                "Disrespect us no they won't\n" +
                "Boy don't even try to touch this\n" +
                "Boy this beat is crazy\n" +
                "This is how they made me\n" +
                "Houston Texas baby\n" +
                "This goes out to all my girls\n" +
                "That's in the club rocking the latest\n" +
                "Who will buy it for themselves\n" +
                "And get more money later\n" +
                "I think...");


        for (int i = 0; i < 4; i++) {
            System.out.println(str1);
        }

        printGirls(str2);

    }

    static void printGirls(String str2) {
        for (int i = 0; i < 8; i++) {
            System.out.println(str2 + " \n Girls");
        }
    }
}
