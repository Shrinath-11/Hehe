package Set01;

public class arraypract {
    public static void main(String[] args) {

        int[] arr = { 2, 7, 10, 12, 23 };

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == current) {
                    System.out.println(current);
                    break;
                }
            }
        }
    }
}
