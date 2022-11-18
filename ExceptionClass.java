package assignment;


public class ExceptionClass {
	public static void addTwoPositive(int a,int b) {
		try {
		if (a < 0 || b < 0) {

			throw new ArithmeticException("Non positive integer sent");}
			else {
				System.out.println(a+b);
		}
	} catch (ArithmeticException e) {
		System.out.println(e);

	}
	
}

public static void main(String[] args) {
	addTwoPositive(6, -9);
}
}

	


