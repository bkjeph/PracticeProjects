package com.personal.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by balkrishna.jeph on 3/10/17.
 */
public class MinStepsInfiniteGrid {
    public static int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int totalSteps = 0;
        for(int i = 0 ; i < X.size() - 1;  i++){
            if(X.get(i) == X.get(i+1))
                totalSteps = totalSteps + Math.abs(Y.get(i+1) - Y.get(i));
            else if(Y.get(i) == Y.get(i+1))
                totalSteps = totalSteps + Math.abs(X.get(i+1) - X.get(i));
            else {
                if(Math.abs(Y.get(i+1) - Y.get(i)) == Math.abs(X.get(i+1) - X.get(i))){
                    totalSteps = totalSteps + Math.abs(X.get(i+1) - X.get(i));
                } else if(Math.abs(Y.get(i+1) - Y.get(i)) < Math.abs(X.get(i+1) - X.get(i))){
                    totalSteps = totalSteps +    Math.abs(X.get(i+1) - X.get(i));
                } else {
                    totalSteps = totalSteps +   Math.abs(Y.get(i+1) - Y.get(i));
                }
            }

        }
        return totalSteps;
    }

    public static void main(String[] args) {
        ArrayList<Integer> input1 = new ArrayList<Integer>();
        input1.add(0);
        input1.add(1);
        input1.add(2);
        ArrayList<Integer> input2 = new ArrayList<Integer>();
        input2.add(0);
        input2.add(1);
        input2.add(2);

        System.out.println(coverPoints(input1, input2));
    }

}
