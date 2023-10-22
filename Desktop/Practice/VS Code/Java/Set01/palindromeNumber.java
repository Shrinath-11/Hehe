package Set01;

public class palindromeNumber {

    public static void main(String[] args) {
        int sum = 0;

        int n = 4541;// It is the number variable to be checked for palindrome

        int temp = n;

        while (n > 0) {
            int r = n % 10; // getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("Palindrome number ");
        else
            System.out.println("Not Palindrome");
    }
}