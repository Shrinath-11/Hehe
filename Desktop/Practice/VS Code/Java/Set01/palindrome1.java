package Set01;

import java.util.Scanner;

public class palindrome1 {
    public static void main(String[] args) {
        String reverse = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value : ");
        String original = sc.nextLine();

        for (int i = original.length() - 1; i >= 0; i--) {

            reverse = reverse + original.charAt(i);
            // System.out.println(reverse);
        }
        if (original.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
