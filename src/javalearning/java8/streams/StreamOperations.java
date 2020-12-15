package javalearning.java8.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,2,3,4,5,6,7,8,9,0);
        streamOperations(intList);
    }


   static void streamOperations(List<Integer> datalist) {
       //Prints even numbers
       Predicate<Integer> evenNumbers = i -> i%2 == 0;
       List<Integer> evenList = datalist.stream().filter(evenNumbers).collect(toList());
       System.out.println(evenList);

       //Finding and matching
       boolean allMatch =
               datalist.stream()
                       .allMatch(i -> i > 3);
       System.out.println(allMatch);

       boolean anyMatch =
               datalist.stream()
                       .anyMatch(i -> i > 3);
       System.out.println(anyMatch);

       //Map operations
       List<Double> doubledList =
               datalist.stream()
                       .map(i -> Math.pow(i,2))
                       .collect(toList());
       System.out.println(doubledList);

       //Reduce
       int sum = datalist.stream().reduce(0, Integer::sum);
       System.out.println(sum);

       //Grouping By
       Map<Integer, Long> elementToCountMap =
               datalist.stream().collect(groupingBy(Function.identity() , counting()));
       System.out.println(elementToCountMap);

       Stream<String> words = Stream.of("Java", "Magazine", "is",
               "the", "best");

       Map<String, Long> letterToCount =
               words.map(w -> w.split(""))
                       .flatMap(Arrays::stream)
                       .collect(groupingBy(Function.identity(), counting()));

       System.out.println(letterToCount);

       Map<Boolean, List<Integer>> partitionedMap =
               datalist.stream().collect(partitioningBy(
                       t -> t > 3));
       System.out.println(partitionedMap);


   }

}
