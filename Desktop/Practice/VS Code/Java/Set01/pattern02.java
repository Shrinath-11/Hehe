package Set01;

public class pattern02 {
    public static void main(String[] args) {
        int r = 5;
        int c = 5;
        for (int i = 1; i <= r; i++) {

            for (int j = 1; j <= c; j++) {

                System.out.print("*");
            }
            System.out.println(" ");
            c--;
        }

    }
}
