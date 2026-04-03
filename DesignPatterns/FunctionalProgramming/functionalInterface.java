// an interface that implements only one abstract method
// an abstract method is a method declared without implementation, defines only method signature

@FunctionalInterface // ensures class cannot have  more than one abstract class
interface washingMachine {
    void washMyCrimes(String crime);
}

public class functionalInterface {
    public static void main(String args[]){
        String my_crime = "epstine files";
        washingMachine wm = (String my_crime) -> (System.out.println("go to war :)"));
        wm.washingMachine(crime);
    }
}