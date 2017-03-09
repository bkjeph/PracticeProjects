package com.personal.practice;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by balkrishna.jeph on 3/10/17.
 */
public class AddOneNumber {

    public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
        int carry = 1;
        int tempSum;
        int noOfZeroes = 0;
        for(int i = 0 ; i < a.size() ; i++ ){
            if(a.get(i) != 0)
                break;
            noOfZeroes++;
        }

        for(int i = a.size() - 1 ; i >= noOfZeroes ; i-- ){
            tempSum = a.get(i) + carry;
            a.set(i, tempSum % 10);
            carry = tempSum / 10;
        }

        ArrayList<Integer> result = new ArrayList<Integer>();
        if(carry > 0){
            result.add(carry);
        }
        for(int i = noOfZeroes; i<= a.size() - 1; i++){
            result.add(a.get(i));
        }
        return result;
    }


    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(0);
        test.add(9);
        test.add(9);
        test.add(6);
        test.add(4);
        test.add(0);
        test.add(5);
        test.add(5);
        test.add(5);
        System.out.println(Arrays.toString(plusOne(test).toArray()));
    }
}
