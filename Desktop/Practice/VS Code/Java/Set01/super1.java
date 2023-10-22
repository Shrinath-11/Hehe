package Set01;

class a {
int a=3;
    a(String s) {

        System.out.println("superclass constructor" + s);
    }
}

class b extends a {

    b(String s) {
        super(s);
        System.out.println("Subclass constructor" +super.a);
    }

}

public class super1 {
public static void main(String[] args) {
    a a = new b("shrinath");


}
}
