package assignment;

import java.util.Scanner;

// 1.write a java program to print sum of odd numbers upto N
public class N_odd {
	public static void main(String[] args) {
		int i,n,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number upto which you want to get the sum");
		n=sc.nextInt();
		for(i=1;i<=n;i++) {
			if(i%2==1)
				s+=i;
	}
	System.out.println("Sum of odd numbers upto "+n+" = "+s);
		
	}

}
