package GuviMaintask5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question5_3 {
	


    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Ramesh");
        students.add("Amit");
        students.add("Ankur");
        students.add("Suresh");
        students.add("Amar");
        students.add("Rajesh");
        students.add("Kumar");
        students.add("Ajay");
        students.add("Akash");
        students.add("Ravi");

        List<String> studentsWithA = students.stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Students with names starting with 'A': ");
        System.out.println(studentsWithA);
    }
}


