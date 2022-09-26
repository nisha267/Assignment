package demo;

public class Armstrong {
	public static void main(String args[]) {

		// WAP program to check a year is leap year or not
		int a = 370, r = 0;
		int c = a;

		while (a != 0) {
			int b = a % 10;
			r = r + b * b * b;
			a /= 10;
		}

		if (r == c)// checking if the no is leap or not
		{
			System.out.println(c + " is a armstrong number");
		} else {
			System.out.println(c + "is not a armstrong number");
		}

	}

}
