package Exceptions;

import java.io.FileReader;

public class checkedExceptions {
    private static void readFile(String fileName){
        /* CHECKED EXCEPTIONS 
        here java even befoure compiling
        flags the possiblity of FileNotFoundException, so it doesn't compile unless the 
        exception is handeled. Handling can be done either here itself in the method or the 
        method can just throw the exception and the caller will have to write a try catch on his part
        if the main method also just declares that it throws the exception like this - 
        public static void main throws xyzExceptino (String[] args){} then if that excption ouccurs
        we will get an error and the stack trace */
        FileReader file = new FileReader(fileName); 
    }

    public static void main(String[] args){
        readFile("test.txt");
    }
}