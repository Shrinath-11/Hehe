package Set01;

public class asciiLowerUpper {
    public static void main(String[] args) {
        int num = 0;
        String s = "ShriNaTh";

        for (int i = 0; i < s.length(); i++) {
            num = s.charAt(i);

            if (num >= 90) {
                num = s.charAt(i);
                num = num - 32;
                char c = (char) num;
                System.out.print(c);

            } else {

                num = s.charAt(i);
                num = num + 32;
                char b = (char) num;
                System.out.print(b);
            }
        }

    }
}
