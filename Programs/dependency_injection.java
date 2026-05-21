public class dependency_injection{
    public static void main(String[] args){
        // here we do "constructor injection" manually due to this main get's clutered instead we can -
        Engine engine = new Engine();
        Car car = new Car(engine);
        car.drive();
        // if we use dependancy injection then we would write this - 
        // @Autowired
        // Car car = new Car(engine); -> this automatically detects engine and injects it no need to make an obj first 
    }
}

// @Component 
class Engine {
    public void start() {
        System.out.println("Engine Started!");
    }
}

class Car{
    private Engine engine;
    // constructor
    public Car(Engine engine_obj){
        // this is reference to the current object whoose method or constructor is running 
        // this assigns the 'variable' engine declared above to the argument recieved 
        this.engine = engine_obj;
    }

    public void drive(){
        engine.start();
        System.out.println("Car Started!");
    }
}