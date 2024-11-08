package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Samu {
    public static void main(String[] args) {
        int[] digits = {9};
        if(digits[digits.length-1] == 9){
            int[] ans = new int[digits.length+1];
            for(int i=0; i<= digits.length-1; i++){
                ans[i] = digits[i];
            }
            ans[digits.length] = 0;
            ans[digits.length-1] = 1;
            System.out.println(Arrays.toString(ans));
            return;
        }

        int[] ans = digits;
        ans[digits.length - 1] = digits[digits.length - 1] + 1;

        System.out.println(Arrays.toString(ans));
    }
}
