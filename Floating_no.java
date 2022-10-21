package assignment;

import java.util.Scanner;

public class Floating_no {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Type two floating point number");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		a=Math.round(a*1000);
		a=a/1000;
		b=Math.round(b*1000);
		b=b/1000;

		if(a==b)
		{
			System.out.println("They are same upto three decimal number");
		}
		else
	System.out.println("They are not same upto three decimal number");
	}
}
