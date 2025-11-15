public class Main {

    
    public sealed class Vehicle permits Car, Bike {
        public void start() {
            System.out.println("Vehicle is starting...");
        }
    }

    
    public final class Car extends Vehicle {
        @Override
        public void start() {
            System.out.println("Car starts with a key.");
        }
    }

    
    public non-sealed class Bike extends Vehicle {
        @Override
        public void start() {
            System.out.println("Bike starts with self-start.");
        }
    }

    
    public class SportsBike extends Bike {
        @Override
        public void start() {
            System.out.println("SportsBike starts with a loud roar!");
        }
    }

    
    public static void main(String[] args) {
        Main outer = new Main();   // For accessing inner classes

        Vehicle v1 = outer.new Car();
        Vehicle v2 = outer.new Bike();
        Vehicle v3 = outer.new SportsBike();

        v1.start();
        v2.start();
        v3.start();
    }
}
