package Serialization;

import java.io.Serializable;

public class party implements Serializable {
    public static String name;
    int age;

    public void welcome(){
        System.out.println("Welcome to didy's party "+ name);
    }

}
