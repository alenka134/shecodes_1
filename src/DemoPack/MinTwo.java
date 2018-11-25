package DemoPack;


public class MinTwo {

    public static void main(String[] args) {




        int[] x = {-4696128,
                9009430,
                        -7843520,
                        -9025126,
                        -245123,
                9760061,
                        -2680340,
                        -462915,
                559624,
                        -498756,
                5921702,
                        -5408835,
                8236070,
                        -6183562,
                        -8292600,
                        -6236052,
                        -771102,
                7394032,
                5957084,
                8060595,
                        -257140,
                6412252,
                        -3092052,
                7785057


        };
        int lengthX = x.length;

        int[] y = {8965710,
                382761,
                3183705,
                        -3324782,
                1373954,
                700291,
                        -912709,
                        -9277462,
                        -6199441,
                        -1669334,
                8766969,
                1961091,
                392741,
                5011146,
                263188,
                        -2988729,
                        -7226621,
                1385378,
                8368906,
                        -4288039,
                7820657,
                7062520,
                        -4050663,
                7467571


        };
        int lengthY = y.length;

        for (int i = 0; i < lengthX && i < lengthY; i++) {
            int result = x[i];
            int result2 = y[i];
            if (x[i] < y[i]) {

                System.out.println(result);
            }
            if (x[i] > y[i]) {
                System.out.println(result2);
            }

        }
    }
}

