package Polymorphism;
// RUN-TIME POLYMORPHISM (METHOD-OVERRRIDING)
class Bike {

    public void speed(int speed) {

        // speed = 50;
        System.out.println("The Normal Bike Should Be  : " + speed + " Km/h");

    }

}

class fz extends Bike {

    // Overriden Method from Superclass Bike
    public void speed(int speed) {
        //super.speed(speed);
        System.out.println("The Fz Bike Speed Is : " + speed + " Km/h");

    }

}

public class FirstInheritance {
    public static void main(String[] args) {
        Bike b = new fz();
        Bike b1 = new Bike();

        b.speed(70);
        b1.speed(50);
    }

}
