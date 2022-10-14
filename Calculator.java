package assignment;

import java.util.Scanner;

/*.Write a java program to illustrate Calculator class with addition, subtraction,
multiplication methods that can take any number of parameters to perform the operation, without using method/constructor overloading*/
public class Calculator {
	public static void main(String[] args) {
		int a,b,d;
		char c;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers(only natural numbers)");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter which operation you want to do,+/-/* or /");
		c=sc.next().charAt(0);
		switch(c) {
		case '+':
		{  d=a+b;
		System.out.println("The sum of two numbers is "+d);
		break;
		}
		case '-':
		{  d=a-b;
		System.out.println("The subtraction of two numbers is "+d);
		break;
		}
		case '*':
		{  d=a*b;
		System.out.println("The Multiplication of two numbers is "+d);
		break;
		}
		case '/':
			
		{ if(a>b) {
			d=a/b;}
		else {
			 d=b/a;}
		System.out.println("The division of two numbers is "+d);
		break;
		}
		
		
	}

	}}
