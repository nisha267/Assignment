package assignment;

//2. Write a Java program to copy an array by iterating the array.

public class CopyArray //main class
{
	public static void main(String[] args) //main method
	{
		int[]arr= {23,78,56,76,90};//taking an array
		int[]copy=arr;//taking another array to copy
		System.out.println("The original array is");
		//printing original array
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
			
		}
		//printing copied array
		System.out.println("The copied array is");
		for(int i=0;i<copy.length;i++) //printing the elements of original array into copied array
		{
			System.out.println(arr[i]+" ");
			
	}

}}
