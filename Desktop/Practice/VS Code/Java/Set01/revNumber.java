package Set01;

public class revNumber {
    public static void main(String[] args) {

        int num = 1233;

        int store = 0;

        while (num != 0) {

            int remainder = num % 10; // it will return remainder
            store = store * 10 + remainder;
            num = num / 10;
        }

        System.out.println(store);
    }
}
