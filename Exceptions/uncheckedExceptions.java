package Exceptions;

public class uncheckedExceptions {
    private static int printLength(String str){
        return str.length();
    }

    public static void main(String[] args){
        /*
            here the current program will cause a NullPointerException but java let's us run it, 
            it is only raised while running 
            java exception hirearchy 
            all RuntimeExceptions are unchecked exceptions 
        */
        // throw Exception();
        // throw RuntimeException();
        String str = null;
        printLength(str);
    }
    
}   