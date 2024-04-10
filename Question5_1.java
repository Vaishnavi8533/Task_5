package GuviMaintask5;

	import java.util.List;
	import java.util.stream.Collectors;

public class Question5_1 {

	public class UppercaseStrings {
	    public static void main(String[] args) {
	        List<String> names = List.of("aBc", "d", "ef");
	        List<String> uppercaseNames = names.stream()
	                .map(String::toUpperCase)
	                .collect(Collectors.toList());
	        System.out.println(uppercaseNames);
	    }
	}
}
