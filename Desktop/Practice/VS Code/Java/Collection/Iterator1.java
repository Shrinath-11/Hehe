package Collection;

import java.util.*;

public class Iterator1 {
    public static void main(String[] args) {

        ArrayList<Integer> ar = new ArrayList<>();

        ar.add(10);
        ar.add(20);
        ar.add(40);
        ar.add(30);
        ar.add(80);
        ar.add(100);

        // Collections.sort(ar);

        for (int i : ar) {
            System.out.println(i);
        }
        System.out.println("===============================");
        Iterator<Integer> iterator = ar.iterator();
        while (iterator.hasNext()) {
            // Integer num = iterator.next();
            // System.out.println(num);
            System.out.println(iterator.next());
        }
    }
}
