package Set01;

public class N {

    public static void main(String args[]) {
        int a = 10;

        String name = null;

        try {

            a = name.length(); // line1

            a++; // line2

        } catch (NullPointerException e) {

            ++a;

            return;

        } catch (RuntimeException e) {

            a--;

            return;

        } finally {

            System.out.println(a);

        }

    }
}
