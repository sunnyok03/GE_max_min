package com.max_min;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        test(1.1f,2.2f,3.3f);
        test(2.2f,3.3f,1.1f);
        test(3.3f,1.1f,2.2f);
    }

    /*
    @desc: find maximum value among three float numbers
    @params:a,b,c (three float)
    @return: max(a,b,c)
     */
    public static Float findMaxValue(float a,float b,float c){
        Float res = a;
        if(res.compareTo(b) < 0){
            res = b;
        }
        if(res.compareTo(c) < 0){
            res = c;
        }
        return res;
    }

    /*
    @desc: testing if findMaxValue method is working or not
    @params: a,b,c (three numbers)
    @return:
     */
    public static void test(float a,float b,float c){
        float maxVal = findMaxValue(a,b,c);
        System.out.printf("Max among %f, %f, %f is %f",a,b,c,maxVal);
        System.out.println();
    }
}
