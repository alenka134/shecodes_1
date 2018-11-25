package DemoPack;

import java.util.Arrays;

public class LoopsSum1 {

        public static void main(String[] args) {

            int[] numbers = {
                    737, 758, 1054, 191, 1233, 307, 785, 1187, 479, 154, 1175, 501, 1187, 934, 297, 880, 1055, 52, 417 ,
                    720, 504, 785, 753, 595, 1290, 240, 1155, 1195, 1089, 818 ,309, 525, 276, 63, 707, 208
                     };
int total = Arrays.stream(numbers).sum();        //calculated total sum

            System.out.println(total);




        }
    }

