package Set01;

interface car {
    abstract void type();

    static String name = "BMW";

    abstract void carColor(String color);

}

abstract class carimp implements car {
    @Override
    public void type() {
        System.out.println("This is interface method " + car.name);

    }

    public void carColor(String color) {
        System.out.println("The Color of car is " + color);
    }

}

class CarRun extends carimp implements car {

    @Override
    public void carColor(String color) {

        super.carColor(color);
    }

    @Override
    public void type() {

        super.type();
    }

}

public class interfaceAbstraction {
    public static void main(String[] args) {
        CarRun c = new CarRun();
        c.carColor("red");
        c.type();

    }
}
