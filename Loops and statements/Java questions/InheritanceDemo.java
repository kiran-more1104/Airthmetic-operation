class Car {
    void run() {
        System.out.println("Car is running");
    }
}

class Bike extends Car {
    void ride() {
        System.out.println("Bike is riding");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.run();  // inherited from Car
        b.ride(); // own method
    }
}