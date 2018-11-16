package DemoPack;

public class MethodString {
    public static void main(String[] args) {
        int result;
        String str1 = "GeeksforGeeks";
        String str2 = "GeeksforGeeksforGirls";

        result = str1.compareTo(str2);
        if (result > 0) {
            System.out.println(str1.length() + " > " + str2.length() + " " + str1);
        } else if (result < 0) {
            System.out.println(str1.length() + " < " + str2.length() + " " + str2);
        } else if (result == 0) {
            System.out.println(str1.length() + " = " + str2.length() + "equally");

        }
    }
}
/*       System.out.println(Str1.length());

        System.out.print("String Length :" );
        System.out.println(Str2.length()); */