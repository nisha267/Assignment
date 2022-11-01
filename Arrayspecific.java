//write a java program to test if an array contains a specific value.
package assignment;

import java.util.Scanner;

public class Arrayspecific 

{public static void main(String[] args)//main method
{
	Scanner sc=new Scanner(System.in);//scanner class for user input
	int[]arr= {23,56,87,76,56};//taking the array
	int a;
	boolean n=false;//taking a boolean variable and making it false
	System.out.println("Type a number");//user input for the specific number
	a=sc.nextInt();
	for(int i=0;i<arr.length;i++) { //for loop
		if(arr[i]==a) //checking if the number is found or not
		{
			n=true;//if found,then make the boolean variable true and break the loop
			break;
		}
	}
	if(n)//if n=true or the number is found
			System.out.println("The number is found");
		else
			System.out.println("The number is not found");
		
	}
}	




