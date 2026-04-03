// functions that take other functions as arguments and can return funcitons as result
package DesignPatterns.FunctionalProgramming;

import java.util.List;
import java.util.function.Function;

public class HigherOrderFunctionsClass {
    public static void HigherOrderFun(List<Integer> numbers, Function<Integer, Integer> lambda) {
        for (Integer number : numbers) {
            Integer result = lambda.apply(number);
            System.out.println(result);
        }
    }

    public static void main(String args[]) {
        List<Integer> numbers = List.of(1, 2, 3);
        HigherOrderFun(numbers, x -> (x*x));
    }
}