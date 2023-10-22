package Set01;

import java.util.Scanner;

public class practice02 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Here ");
        int input = sc1.nextInt();

        int arr[] = new int[input];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc1.nextInt();
        }
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }

    }
}
