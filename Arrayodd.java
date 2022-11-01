//Write a java program to print the elements of the array which are present in odd positions
package assignment;

public class Arrayodd //main class
{
public static void main(String[] args)//main method
{
	int arr[]= {2,5,6,7,8,9,20,76};//taking the array
	System.out.println("The numbers in odd position are");
	for(int i=0;i<arr.length;i+=2) //loop to print the odd position's numbers
	{
		System.out.println(arr[i]);
		
	}
}
}
