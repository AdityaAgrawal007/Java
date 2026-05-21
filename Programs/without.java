public class without {
    static class Engine {
        void start() {
            System.out.println("Engine started");
        }
    }

    static class Car {
        private Engine engine;

        public Car() {
            this.engine = new Engine();
        }

        public void drive() {
            engine.start();
            System.out.println("Car is driving");
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Car car = new Car(); 
            car.drive();
        }
    }

}
