package GuviMaintask5;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question5_2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> nonEmptyStrings = strings.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
        System.out.println(nonEmptyStrings);
    }
}


