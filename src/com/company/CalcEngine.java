package com.company;

public class CalcEngine {
    public static void main(String[] args) {
                double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
                double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
                char[] opCodes = {'a', 'b', 'c', 'd'};
                double[] results = new double[opCodes.length];

                for (int i = 0; i < opCodes.length; i++) {
                    if (opCodes[i] == 'a')
                        results[i] = leftVals[i] / rightVals[i];
                    else if (opCodes[i] == 'b')
                        results[i] = leftVals[i] + rightVals[i];
                    else if (opCodes[i] == 'c') {
                        results[i] = rightVals[i] != 0.0d ? leftVals[i] - rightVals[i] : 0.0d;

                    } else if (opCodes[i] == 'd')
                        results[i] = leftVals[i] * rightVals[i];
                    else {
                        System.out.println("Error - invalid opCode");
                        results[i] = 0.0d;
                    }
        }

        for (double theResult : results) {
            System.out.print("result = ");
            System.out.println(theResult);
        }

    }
}