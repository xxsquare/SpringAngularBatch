package hello_world;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestStream1 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,53,4,55,77);
		
		numbers.stream().map(x -> x*x).forEach(i -> System.out.println(i));
		
		int result = numbers.stream().reduce((x, y) -> x+y).get();
		System.out.println(result);
		
		numbers.stream().filter(x -> x%2==0).forEach(i -> System.out.println(i));

	}

}
