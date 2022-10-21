package assignment;

import java.util.Scanner;

public class CubeNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number(Two and more digits will be preferable)");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			System.out.println("The cube of"+i+" is "+(i*i*i));
		}
		
	}

}
