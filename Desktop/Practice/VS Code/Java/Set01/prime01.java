package Set01;

public class prime01 {
    public static void main(String[] args) {
        int num = 3;
        boolean f = false;

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                f = true;
                break;
            }
        }
        if (!f) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is Not a prime number.");
        }
    }
}
