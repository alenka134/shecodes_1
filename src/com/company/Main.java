package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world one"); // this is a comment
      /*  System.out.println("Hello world two");*/
        System.out.println("Hello world three");
            int myVar;
            myVar = 32;
        System.out.println(myVar);

            int anotherVar = 5;
        System.out.println(anotherVar);

       myVar = anotherVar;
        System.out.println(myVar);

        anotherVar = 400;
        System.out.println(anotherVar);
        System.out.println(myVar);

        int myVal = 10;
        System.out.println(myVal);
        System.out.println(--myVal);

        int myVal1 = 30;
        myVal1 +=5;
        System.out.println(myVal1);

        int result = 100;
        int val1 = 5;
        int val2 = 10;
        result /=  val1 * val2;
        System.out.println(result);

        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;

        int result1 = valA - (valB/valC);
        int result2 = (valA - valB)/valC;
        System.out.println(result1);
        System.out.println(result2);

        int result3 = valA/valC * valD + valB; //=13
        int result4 = valA/valC * (valD + valB); //7*7=49
        System.out.println(result3);
        System.out.println(result4);

        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteval = 7;
        short shortVal = 5;
        long longval = 9;

        short result5 = (short) byteval;
        short result6 = (short) (byteval-longval); //7 - 9 = -2
        float result7 = longval - floatVal; //9 - 1.0 = 8.0
        double result8 = longval - doubleVal; // 9 - 4.0 =5 .0
        long result9 = (long)(shortVal - longval + floatVal + doubleVal); //5 - 9 + 1.0 + 4.0 = 1

        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);

        System.out.println("Success");





    }
}
