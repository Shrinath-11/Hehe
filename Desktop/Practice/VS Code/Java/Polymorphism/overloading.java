package Polymorphism;

//COMPILE - TIME POLYMORPHISM (METHOD-OVERLOADING)
class Animal {

    public void Type(String land) {

        System.out.println("The Animal Type is " + land);

    }
}

class Tiger extends Animal {

    // OVERLOADED METHOD WITH DIFFERENT PARAMETERS BUT SAME METHOD NAME
    public void Type(String eat, int legs) {

        System.err.println("Tiger is " + eat + " Tiger has " + legs);
    }
}

public class overloading {
    public static void main(String[] args) {

        Animal a = new Tiger();
        Animal a1 = new Animal();
        Tiger t = new Tiger();

        // a.Type("Carnivorus ");
        // a1.Type("Terrestrial");
        t.Type("Carnivorous", 4);
    }
}
