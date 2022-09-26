package demo;

import java.util.Scanner;

public class Input {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// Get input from user
		System.out.println("Enter two number");
		int i = sc.nextInt();
		int j = sc.nextInt();

		System.out.println("The multiplication of two number " + (i * j));
	}
}
