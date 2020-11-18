package javalearning.java8.functiionalinterface;

import java.util.function.Function;

public class UnderstandingFunction {

    public static void main(String[] args) {
      executeFunction();
      executeFunctionChain();
    }

    public static void executeFunction() {
        //Function is a FUnctional Interface with method apply.
        Function<String, String> function  = x->x.toLowerCase(); //Providing implementation for apply method.

        String transformedString = function.apply("JAVA LEARNING");
        System.out.println(transformedString);
    }

    public static void executeFunctionChain() {
        //Function is a FUnctional Interface with method apply.
        Function<String, String> function  = x-> "Hello "+x; //Providing implementation for apply method.
        Function<String, Integer> lengthFUnction = x-> x.length();

        Integer lenght = function.andThen(lengthFUnction).apply("JAVA LEARNING");
        System.out.println(lenght);
    }

}
