package DemoPack;

public class MinTree {
    public static void main(String[] args) {

        //firstSolution();
        secondSolution();
    }


    private static void secondSolution() {
        String string = "-1035329 8769068 7965830 -6671190 -8585290 4039837 5319134 5448411 6988136 -4110246 4379232 -7511048 -3543825 -6504460 -9100405 3150576 6677625 -8246084 5809791 1889107 4194701 6085911 -4778143 4354043 751882 -1119429 -9182243 3697092 -8002160 -6358286 -8101309 962511 -7589218 9864521 4291321 -6174508 3904358 -389545 9273902 892495 5500209 3653134 3381447 -8043616 7148674 4281041 5106960 3826300 6034957 916751 -4284593 229659 -2997337 937264 -5416298 7754544 9817834 -4598541 1451637 -8184325 -956828 3350328 2778185 1453954 3214849 -2930494 5279445 -2880792 6679960 4553348 8011703 2180170";

        String[] stringArray = string.split(" ");

        for (int i = 0; i < stringArray.length; i = i + 3)
            if ((i + 2) < stringArray.length) {
                int number1 = Integer.parseInt(stringArray[i]);
                int number2 = Integer.parseInt(stringArray[i + 1]);
                int number3 = Integer.parseInt(stringArray[i + 2]);

                int minNumber = Integer.parseInt(stringArray[i]);


                if (minNumber > number1) {
                    minNumber = number1;
                }


                if (minNumber > number2) {
                    minNumber = number2;
                }

                if (minNumber > number3) {
                    minNumber = number3;

                }
                System.out.println(minNumber);
            }

    }

  /*  private static void firstSolution(){
        String string = "2638139 9142942 89270 666 777 -907";
        String[] stringArray = string.split(" ");

        int minNumber = Integer.parseInt(stringArray[0]);
        for (int i = 0; i < stringArray.length; i++) {

            int number = Integer.parseInt(stringArray[i]);
            if ((i + 1) % 3 == 0) {
                if (minNumber > number) {
                    minNumber = number;
                }
                System.out.println(minNumber);
                if ((i + 1) < stringArray.length) {
                    minNumber = Integer.parseInt(stringArray[i + 1]);
                }
            } else {
                if (minNumber > number) {
                    minNumber = number;
                }
            }

        } */

}

