package Set01;

public class practice03 {
    public static void main(String[] args) {
        // int arr[] = { 10, 20, 30, 40, 50 };

        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = arr[i + 1];
        // System.out.println(arr[i]);
        // }
        // for (int j : arr) {
        // System.out.println(j);
        // }

        String name = "Shrinath Is Dumb";

        String arr[] = new String[10];
        arr = name.split(" ");
        System.out.println(arr.toString());

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        System.out.println(arr[1]);
    }
}
