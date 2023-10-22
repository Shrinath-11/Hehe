package Set01;

public class free {
    public static void main(String[] args) {

        String s1 = "L";
        String s2 = "L";

        String s3 = new String("L");
        String s4 = "l";

        // " == " OPERATOR

        // Comparing s1 and s2
        System.out.println(s1 == s2); // Return true

        // Comparing s1 and s3
        System.out.println(s1 == s3); // Return false

        // Comparing s1 and s4
        System.out.println(s2 == s4); // return false

        System.out.println("============================================================");
        /* ========================================================================== */

        /* .equals() Method */

        // Comparing s1 and s2
        System.out.println(s1.equals(s2)); // Return True

        // Comparing s1 and s3
        System.out.println(s1.equals(s3)); // Return True

        // Comparing s1 and s4
        System.out.println(s1.equals(s4)); // Return false (s1 and s2 has different characters)

        System.out.println("============================================================");
        /* ========================================================================== */

        /* equalsIgnoreCase() */
        // Comparing s1 and s2
        System.out.println(s1.equalsIgnoreCase(s2)); // Return True

        // Comparing s1 and s3
        System.out.println(s1.equalsIgnoreCase(s3)); // Return True

        // Comparing s1 and s4
        System.out.println(s1.equalsIgnoreCase(s4)); // Return true (equalIgnoreCase is insensitive )

        System.out.println("============================================================");

        String dcn = "123321";
        String edd = "123321";


    }
}
