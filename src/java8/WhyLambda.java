package java8;

import java.util.ArrayList;
import java.util.List;

public class WhyLambda {
    public static void main(String[] args) {

        List<String> colorList = new ArrayList();

        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Yellow");
        colorList.add("Black");

       //Without lambda expression
       for(String color : colorList){
           System.out.println(color);
       }

       //Using lambdas
       colorList.forEach( color -> System.out.println(color));
    }
}
