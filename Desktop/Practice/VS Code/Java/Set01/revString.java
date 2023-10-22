package Set01;

public class revString {
    public static void main(String[] args) {

        // //BY USING STRINGBUFFER (INBUILT METHOD)
        // StringBuffer sb = new StringBuffer();
        // sb.append("Shrinath");
        // System.out.println(sb.reverse());

        /* ========================================================================= */

        // By using reverse array String
        String s = "Laptop";
        String tmp = "";

        char[] ch = s.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            tmp = tmp + ch[i];
        }

        System.out.println(tmp);

        /* ======================================================================== */

        int i = 12345;
        String n = Integer.toString(i);
        // String n1 = String.valueOf(i);

        char[] c = n.toCharArray();

        String rev = "";

        for (int j = c.length - 1; j >= 0; j--) {

            rev = rev + c[j];
        }

        System.out.println(rev);

        /* ======================================================================== */
        // REVERSING NUMBER

        int num = 31424;

        int store = 0;

        while (num != 0) {
            int remainder = num % 10;
            store = store * 10 + remainder;
            num = num / 10;
        }
        System.out.println(store);
    }
}
