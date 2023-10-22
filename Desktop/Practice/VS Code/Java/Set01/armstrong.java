package Set01;

public class armstrong {
    public static void main(String[] args) {

        int num = 163;

        int store = 0;
        int temp = num;

        // int numDigits = (int) (Math.log10(num) + 1);

        // System.out.println(numDigits);

        while (num != 0) {
            int remainder = num % 10;
            store = (int) (store + Math.pow(remainder, 3));
            num = num / 10;
        }
        if (temp == store) {
            System.out.println("Arm");
        } else {
            System.out.println("not");
        }

    }
}
