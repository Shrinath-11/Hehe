package Set01;

public class fdshk {
    public static void main(String[] args) {

        String s = "Expleo";

        char[] ch = new char[s.length()];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = s.charAt(i);

        }
        for (int j = 0; j < ch.length; j++) {
            System.out.print(ch[j] + " ");

        }
        System.out.println();

        char[] ch1 = s.toCharArray();

        for (int j1 = 0; j1 < ch1.length; j1++) {
            System.out.print(ch1[j1] + " ");
        }
    }
}
