package Set01;

import java.util.Scanner;

//PRIME NUMBER CODE
public class primeNumber {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num1 = sc1.nextInt();
        int num = 0;
        for (int i = 2; i < num1; i++) {

            if (i % num1 == 0) {
                num++;
            }

            else {
                System.out.println(i);
            }
        }
    }
}
