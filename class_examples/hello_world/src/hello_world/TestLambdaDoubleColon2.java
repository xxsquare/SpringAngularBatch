package hello_world;

import java.util.Arrays;
import java.util.List;

public class TestLambdaDoubleColon2 {

	public static void main(String[] args) {
		List<String> mylist = Arrays.asList("raj","john","Tom");
		
		mylist.forEach(System.out::println);
	}

}
