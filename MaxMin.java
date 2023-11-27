package com.max_min;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        test(1,2,3);
        test(1.1f,2.2f,3.3f);
        test("Banana","Apple","Peach");
    }

    /*
    @desc: find maximum value among three generics
    @params:a,b,c (generics)
    @return: max(a,b,c)
     */
    public static <T extends Comparable<T>> T findMaxValue(T a,T b,T c){
        T res = a;
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
    public static <T extends Comparable<T>> void test(T a,T b,T c){
        T maxVal = findMaxValue(a,b,c);
        System.out.printf("Max among %s, %s, %s is %s",a,b,c,maxVal);
        System.out.println();
    }
}
