package com.personal.practice;

import java.util.ArrayList;

/**
 * Created by balkrishna.jeph on 3/9/17.
 */
public class EquilibriumSum {

    public static int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length <= 0)
            return -1;
        if(A.length == 1)
            return 0;
        long totalSum  = 0;
        for(int i = 0 ; i < A.length; i++){
            totalSum = totalSum + A[i];
        }
        System.out.println(totalSum);
        long leftSum = 0;
        for(int i = 0; i < A.length; i++){
            if(totalSum - A[i] - leftSum == leftSum)
                return i;
            leftSum = leftSum + A[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, -2147483648, -2147483648}));
    }



}
