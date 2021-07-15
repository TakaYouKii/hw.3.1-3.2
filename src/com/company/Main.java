package com.company;

public class Main {

    public static void main(String[] args) {

        double[] numbers = {3.5, 6.7, -5.6, 7.5, -6.7, -4.5, 5.6, 7.8, -4.4, 3.5, 8.7, -9.0, 7.6, -2.2, 4.5, };
        double col = 0.0;
        int s = 0;
        boolean m = false;

        for (double sum : numbers) {
            if (sum < 0) {
                m = true;
            } else if (m) {
                col = col + sum;
                s++;

            }

        }
        double i = col / s;
        System.out.println(i);
        System.out.println(i -numbers[0] - numbers[1]);


    }
}
