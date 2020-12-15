package javalearning.java8;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MethodReference {

    public static void main(String[] args) {
        List<String> colorList = new ArrayList();

        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Yellow");
        colorList.add("Black");

        //Println is called by reference
        colorList.forEach(System.out::println);

        // anonymous class
        List<String> lowerCaseColors = colorList.stream()
                .map(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.toLowerCase();
                    }
                })
                .collect(Collectors.toList());

        lowerCaseColors.forEach(System.out::println);

        // lambda expression
        List<String> lowerCaseColorsByLambda = colorList.stream()
                .map(s -> s.toLowerCase())
                .collect(Collectors.toList());

        lowerCaseColorsByLambda.forEach(System.out::println);

        // method reference
        List<String> lowerCaseColorsByReference = colorList.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        lowerCaseColorsByReference.forEach(System.out::println);

    }
}
