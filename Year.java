package demo;

public class Year {
	public static void main(String args[]) {

		// WAP program to check a year is leap year or not
		int y = 2013;
		if (y % 4 == 0)// checking if the no is leap or not
		{
			System.out.println(y + " is a leap year");
		} else {
			System.out.println(y + "is not a leap year");
		}
	}
}
