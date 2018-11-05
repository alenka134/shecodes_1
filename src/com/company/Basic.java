package com.company;

public class Basic {


       public void showSum(double x, double y, int count) {
           if (count <1)
               return;
            double sum = x + y;
            for (int i = 0; i < count; i++)
                System.out.println(sum);
            return;
        }

}