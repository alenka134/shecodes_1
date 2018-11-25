package DemoPack;

public class LoopsSum2 {
    public static void main(String[] args) {

        int[] x = {29200,
                85406,
                661543,
                373848,
                692700,
                295739,
                818504,
                778212,
                404841,
                315208,
                850884,
                947959,
                613055,
                440633};
        int lengthX = x.length;

        int[] y = {798069,
                394909,
                100245,
                807143,
                49175,
                960036,
                640366,
                227852,
                505603,
                173347,
                997216,
                543540,
                214312,
                110082};
        int lengthY = y.length;

        for (int i = 0; i < lengthX && i < lengthY; i++) {
            int result =  x[i]+y[i];                        //calculated sum x+y

            System.out.println(result);
        }
    }
}
