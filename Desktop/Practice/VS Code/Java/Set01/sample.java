package Set01;

import java.util.Scanner;

public class sample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length Of An Array: ");
        int length = sc.nextInt();

        String name[] = new String[length];

        for (int i = 0; i < name.length; i++) {
            name[i] = sc.next();
        }

        System.out.println("Entered Name Is : ");
        for (String j : name) {
            System.out.println(j);
        }
        // System.out.println();
    }
}
