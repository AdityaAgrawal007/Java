import java.util.ArrayList;
import java.util.function.Consumer;

public class lambdas {
    public static void main(String args[]) {
        ArrayList<String> name_stash = new ArrayList<>();
        name_stash.add("Epistien files");
        name_stash.add("nhilist penguine");
        name_stash.add("metamorphosis");

        // lambda function  in simplest  form -> (parameter1, parameter2, ...) -> {expression}
        name_stash.forEach((name) -> {
            System.out.println(name);
        });

        Consumer<String> functional_interface = (n) -> {System.out.println("check");};
        name_stash.forEach(functional_interface);
    }
}
