package Set01;

import java.util.Scanner;

class OddEvenFind {

    public static void main(String[] args) {
        // Scanner sc1 = new Scanner(System.in);
        // System.out.println("Enter Number: ");
        // int num = sc1.nextInt();

        // int[] oddEven = new int[num];
        // for (int i = 1; i <= num; i++) {
        // if (num % 2 == 0) {

        // System.out.println(oddEven[]);

        // }

        // }
        // }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 1) {
            // Odd number series
            System.out.println(num);
            for (int i = 1; i <= num; i = i + 2) {
                System.out.print(i + " ");
            }
        } else {
            // Even number series
            System.out.println(num);
            for (int i = 2; i <= num; i = i + 2) {
                System.out.print(i + " ");
            }
        }
    }
}
