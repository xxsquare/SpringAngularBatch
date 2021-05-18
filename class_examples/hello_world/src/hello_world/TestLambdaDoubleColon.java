package hello_world;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class EvenOdd{
	
	public static boolean isEven(int i) {
		return i%2==0;
	}
	
	public static boolean isOdd(int i) {
		return !isEven(i);
	}
}

public class TestLambdaDoubleColon {

	public static void main(String[] args) {
		List<Integer> numbers = new LinkedList(Arrays.asList(1,2,3,4,53,4,55,77));
		
		System.out.println(numbers);
		
		//numbers.removeIf(i -> i%2==0);
		//numbers.removeIf(i -> { return i%2==0;});
		
		numbers.removeIf(EvenOdd::isEven);
		
		System.out.println(numbers);
	}

}
