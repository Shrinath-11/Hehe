package Set01;

public class javapractice {

    public static void main(String[] args) {

        String str = "shrinath";

        String str1 = new String("shrinath");

        String str3 = "shrinath";

        System.out.println(str == str3);
        System.out.println(str == str1);

        // String s = "The Amazing Spiderman";

        // char [] c = s.toCharArray();

        // for (int i = c.length - 1; i >= 0; i--) {
        // System.out.print(c[i]);
        // }

        int num = 1234;

        String m = String.valueOf(num);
        System.out.println(m);

        String n = Integer.toString(num);

        char[] v = n.toCharArray();

        for (int i = v.length - 1; i >= 0; i--) {
            System.out.print(v[i]);
        }

    }
}
