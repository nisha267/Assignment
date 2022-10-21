package assignment;

import java.util.Scanner;

public class Investment {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the investment amount");
		double inv=sc.nextDouble();
		System.out.println("Input the rate of interest");
		double rate=sc.nextDouble();
		System.out.println("Input number of years");
		int y=sc.nextInt();
		double SI;
		SI=(inv*rate*y)/100;
		System.out.println("The simple interest is"+SI);
	}
}
