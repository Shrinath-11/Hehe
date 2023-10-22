package Set01;

public class palindrome {
    public static void main(String[] args) {
        int r = 0;
        int sum = 0;
        int temp;

        int n = 541;
        temp = n;

        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }

        if (temp == sum) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
