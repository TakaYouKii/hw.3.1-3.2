package com.company;

import java.util.Arrays;

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

        double id = col / s;
        System.out.println(id);




        int[] numberss = new int[]{5, -7, 734, -66, 55, 5, 4, -22};
        boolean sort = false;
        while (!sort){
            sort = true;
            for (int i = 1; i< numberss.length; i++) {
                if (numberss[i] < numberss[i - 1]) {
                    int w = numberss[i];
                    numberss[i] = numberss[i - 1];
                    numberss[i - 1] = w;
                    sort = false;
                }
            }
            System.out.println(Arrays.toString(numberss));
        }
    }
}
