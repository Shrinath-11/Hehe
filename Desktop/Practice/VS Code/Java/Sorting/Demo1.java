package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class Demo1 {
    public static void main(String[] args) {
        int[] ar = { 90, 23, 5, 109, 21, 33, 31 };

        // Invoking sort method for array

        Arrays.sort(ar);// Elements of array sorted in ascending order

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }

    }
}