//Write a java program to find the duplicate numbers in an array
package assignment;

public class ArrayDuplicate {//main class
	public static void main(String[] args) //main method
	{
		int arr[]= {45,45,78,67,78,89};//taking the array
		
		for (int i=0;i<arr.length;i++) {//loop for initializing the array elements
		for(int j=i+1;j<arr.length;j++) {//loop to compare the other elements of the array
			if(arr[i]==arr[j]) //if the same element is found
			
				System.out.println("The duplicate number is "+arr[i]);
			
			
		}
	}
}}
