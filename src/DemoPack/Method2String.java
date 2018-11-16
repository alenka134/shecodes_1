package DemoPack;

public class Method2String {
    public static void main(String[] args) {

        int result;
        String str1 = "Hellos";
        String str2 = "WORLD";

        result = str1.length();
        System.out.println(result);

        int mod = str1.length() % 2; // calculate if the word consists of odd numbers of the letters
        int mid = str1.length() / 2;
        System.out.println(mid + " - index of letter in the middle of the word");

        int index = mid;
        String a = str1.substring(0, index); // printed Hel
        String b = str1.substring(index++, str1.length()); // printed llo
        String c = str1.substring(0, index--); // printed Hel
        String d = str1.substring(index, str1.length()); // printed los
        //System.out.println(b + str2 + c);

        if (mod == 0) {
            System.out.println(mod + " - is odd number:"  + " " + a + str2 + b);
        }
        if (mod > 0) {

            System.out.println(mod + " - is even number: " + " " + c + str2 + d);
        }


    }
}