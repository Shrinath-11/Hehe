package Set01;

public class arm {
    public static void main(String[] args) {

        int num = 1234;
        int store = 0; // 36
        int tem = num;

        while (num != 0) {
            int rem = num % 10; // 3
            store = (int) (store + Math.pow(rem, 3));
            num = num / 10;
        }
        System.out.println(store);

        if (tem == store) {
            System.out.println("Armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }
}
