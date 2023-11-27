package com.max_min;

public class MaxAmongThree<T extends Comparable<T>> {
    T a;
    T b;
    T c;

    public MaxAmongThree(T a,T b,T c){
        this.a = a;
        this.b = b;
        this.c = c;
    }


    /*
    @desc: find maximum value among three generics
    @params:a,b,c (generics)
    @return: max(a,b,c)
     */
    public T findMaxValue(){
        T res = this.a;
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
    @params: a,b,c (generics)
    @return:
    */
    public static <T extends Comparable<T>> void test(T a,T b,T c){
        T maxVal = new MaxAmongThree<>(a,b,c).findMaxValue();
        System.out.printf("Max among %s, %s, %s is %s",a,b,c,maxVal);
        System.out.println();
    }

}

