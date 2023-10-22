package Set01;

import java.util.Scanner;

class practice01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // System.out.println("===============================================================");
        // System.out.println("PRINTING ARRAY FROM USER INPUT");
        // System.out.println("Enter Length of An Array");
        // int length = sc.nextInt();
        // int[] arr = new int[length];

        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();

        // }
        // // for (int j : arr) {
        // // System.out.println(j);
        // // }

        // for (int j = 0; j < arr.length; j++) {
        // System.out.println(arr[j]);
        // }
        // System.out.println("===========================================================");

        System.out.println("REVERSING AN ARRAY FROM USER INPUT");
        System.out.println("Enter Length Of An Array: ");
        int num = sc.nextInt();

        int[] arr1 = new int[num];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Array In Normal Way:-- ");
        for (int j1 : arr1) {
            System.err.println(j1);
        }
        System.out.println("Array In Reverse Format: ");

        for (int k = arr1.length - 1; k >= 0; k--) {
            System.err.println(arr1[k]);
        }

        // System.out.println("===========================================================");
    }
}