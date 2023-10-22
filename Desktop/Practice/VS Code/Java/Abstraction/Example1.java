package Abstraction;

interface abc {
    default void m1() {

        System.out.println("Hey there using abc");
    }

}

abstract class a {
    abstract void display();
}

class b extends a {

    void display() {
        System.out.println("Abstract method called !");

    }

}

public class Example1 {
    public static void main(String[] args) {
        b ba = new b();

        ba.display();

    }
}
