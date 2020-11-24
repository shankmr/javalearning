package javalearning.java8.functiionalinterface;


@FunctionalInterface
interface FunctionalInterfaceExample {
    int multipleBy3(int a);
}

public class CustomFunctionalInterface {
    public static void main(String[] args) {
        FunctionalInterfaceExample function = a -> a * 3;//Providing implementations
        System.out.println(function.multipleBy3(2));
    }
}