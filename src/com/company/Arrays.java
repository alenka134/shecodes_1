package com.company;

/* Option 1

public class Arrays {
    public static void main(String[] args) {
        float[] theVals = {10.0f, 20.0f, 15.0f};

        float sum = 0.0f;
        for (int i = 0; i < theVals.length; i++)
            sum += theVals[i];

        System.out.println(sum);

    }
} */

// Option 2
public class Arrays {
    public static void main(String[] args) {
        float[] theVals = {10.0f, 20.0f, 15.0f};

        float sum = 0.0f;
        for (float currentVal : theVals)
            sum += currentVal;

        System.out.println(sum);

    }
}