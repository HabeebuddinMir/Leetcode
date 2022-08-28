package com.codewithhabeeb;

import java.util.Arrays;
public class reverseArray {
    static void swap(char[] A, int i, int j)
    {
        char temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    static char[] arrayReverse(char[] A){
        int low = 0;
        int high = A.length - 1;
        while (low < high){
            swap(A, low, high);
            low++;
            high--;
        }
        return A;
    }

    public static void main(String[] args)
    {
        char[] A = {'h','e','l','l','o'};
        System.out.println(arrayReverse(A));
    }
}
