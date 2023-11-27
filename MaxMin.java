package com.max_min;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        test("Apple","Peach","Banana");
        test("Peach","Banana","Apple");
        test("Banana","Apple","Peach");
    }

    /*
    @desc: find maximum value among three float numbers
    @params:a,b,c (three float)
    @return: max(a,b,c)
     */
    public static String findMaxValue(String a,String b,String c){
        String res = a;
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
    public static void test(String a,String b,String c){
        String maxVal = findMaxValue(a,b,c);
        System.out.printf("Max among %s, %s, %s is %s",a,b,c,maxVal);
        System.out.println();
    }
}
