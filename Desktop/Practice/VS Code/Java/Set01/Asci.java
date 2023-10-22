package Set01;

public class Asci {
    public static void main(String[] args) {

        int asc = 0;
        String s = "HelLo";

        // System.out.println(s.toUpperCase());

        for (int i = 0; i < s.length(); i++)
        {
            asc = s.charAt(i);

            if (asc >= 90)
            {

                asc = s.charAt(i);
                asc = asc - 32;
                char a = (char) asc;

                System.out.print(a);
            }
            else
            {
                asc = s.charAt(i);
                asc = asc + 32;
                char a = (char) asc;
                System.out.print(a);
            }
        }
    }
}
