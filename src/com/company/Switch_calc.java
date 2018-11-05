package com.company;

public class Switch_calc {
    public static void main(String[] args) {
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'a', 'b', 'c', 'd'};
        double[] results = new double[opCodes.length];

        for (int i = 0; i < opCodes.length; i++) {

            switch (opCodes[i]) {
                case 'a':
                    results[i] = leftVals[i] / rightVals[i];
                    break;
                case 'b':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 'c':
                    results[i] = rightVals[i] != 0.0d ? leftVals[i] - rightVals[i] : 0.0d;
                    break;
                case 'd':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                default:
                    System.out.println("Error - invalid opCode");
                    results[i] = 0.0d;
                    break;

            }
        }
        for (double theResult : results) {
            System.out.print("result = ");
            System.out.println(theResult);
        }

    }
}