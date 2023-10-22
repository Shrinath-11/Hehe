package Set01;

import java.util.Scanner;

public class prime {

    public void abc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value to check its prime or not: ");
        int num = sc.nextInt();

        boolean f = false;
        for (int i = 2; i <= num / 2; i++) {
            // condition for nonprime number
            if (num % i == 0) {
                f = true;
                break;
            }
        }
        if (!f)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

    public static void main(String[] args) {
        prime p = new prime();
        p.abc();

    }
}