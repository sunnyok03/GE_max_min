package com.bridgelabz;

/*
@desc:This class uses Generics to compare elements and find maximum
 */
public class MaxAmongAll<T extends Comparable<T>> {

    private T[] arr;
    public MaxAmongAll(T ...arr){
        this.arr = arr;
    }


    /*
    @desc: find maximum value among n generics
    @params:a,b,c (generics)
    @return: max(among all)
     */
    public T findMaxValue(){
        if(arr.length == 0){
            System.out.println("Enter arr.length > 0...");
            return null;
        }
        T res = this.arr[0];
        for(T element : arr){
            if(res.compareTo(element) < 0){
                res = element;
            }
        }
        return res;
    }

    /*
     @desc: testing if findMaxValue method is working or not
    @params: array (generics)
    @return:
    */
    public static <T extends Comparable<T>> void test(T ...arr){
        T maxVal = new MaxAmongAll<>(arr).findMaxValue();
        if(maxVal == null){
            return;
        }
        printMax(maxVal,arr);
    }

    /*
    @desc: extended a new method to print after testing
    @params: maxValue and arr
    @return:
     */
    public static <T> void printMax(T maxVal,T ...arr){
        System.out.print("Max among ");
        for(T element : arr){
            System.out.print(element + " ");
        }
        System.out.printf("is %s.",maxVal);
        System.out.println();
    }

}

