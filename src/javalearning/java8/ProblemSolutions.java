package javalearning.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProblemSolutions {
    public static void main(String[] args) {
        List<Student> students = getStudentData();

        // 1.  Get student with exact match name "jayesh"

        Optional<Student> jayesh = students.stream()
                .filter(x->x.getName().equalsIgnoreCase("jayesh"))
                .findFirst();
        jayesh.ifPresent(System.out::println);

        //3.Get all student having mobile numbers 3333.
        List<Student>studentsList = students.stream().filter(x->x.getMobileNumbers()
                .stream().anyMatch(y-> y.getNumber().equals("3333")))
                .collect(Collectors.toList());
        System.out.println(studentsList);




    }

    public static List<Student> getStudentData() {
        Student student1 = new Student(
                "Jayesh",
                20,
                new Address("1234"),
                Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

        Student student2 = new Student(
                "Khyati",
                20,
                new Address("1235"),
                Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

        Student student3 = new Student(
                "Jason",
                20,
                new Address("1236"),
                Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));

        return Arrays.asList(student1, student2, student3);
    }

}
