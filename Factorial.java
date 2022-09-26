package demo;

import java.util.Scanner;

//Factorial of numbers
public class Factorial {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a no ");
		int a = sc.nextInt();
		int i = 1, f = 1;
		while (i <= a) {
			f = f * i;
			i++;
		}
		System.out.println("The factorial of the number is " + f);
	}

}
