package hello_world;

@FunctionalInterface
interface Printer {
	void print(Object o);
	
	//void prntme();

}

public class TestLambda2 {
	
	public static void add(int n1,int n2, Printer printer) {
		int result  = n1 + n2;
		printer.print(result);
	}

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		
		//add(num1,num2, printer);
		
		Printer printer  = (Object o) -> {
			System.out.printf("Objs are %d & %d result is %d ", num1,num2,o);
		};
		
		add(num1,num2, printer);
		
		

	}

}
