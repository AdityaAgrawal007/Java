public class testing {

    interface Engine {
        void start();
    }

    static class PetrolEngine implements Engine {
        public void start() {
            System.out.println("Petrol engine started 🚗💨");
        }
    }

    static class DieselEngine implements Engine {
        public void start() {
            System.out.println("Diesel engine started 🚚💨");
        }
    }

    static class MockEngine implements Engine {
        public void start() {
            System.out.println("[TEST] Mock engine started (no real engine).");
        }
    }

    static class Car {
        private Engine engine;

        public Car(Engine engine) { 
            this.engine = engine;
        }

        public void drive() {
            engine.start();
            System.out.println("Car is driving smoothly...");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Production run ===");
        Engine petrol = new PetrolEngine();
        Engine diesel = new DieselEngine();

        Car car1 = new Car(petrol);
        Car car2 = new Car(diesel);

        car1.drive();
        car2.drive();

        System.out.println("\n=== Test run ===");
        Engine mock = new MockEngine(); 
        Car testCar = new Car(mock);
        testCar.drive();
    }

}
