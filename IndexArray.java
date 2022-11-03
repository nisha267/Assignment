package assignment;

// 1. Write a Java program to find the index of an array element.


import java.util.Scanner;

public class IndexArray//main class
{
public static void main(String[] args)//main method
{
	Scanner sc=new Scanner(System.in);//scanner object for input
int	arr[]= {23,56,45,87,98};//taking an array
System.out.println("Type the element which index you want to search");
int a=sc.nextInt();//getting the element which user want to search
int index=0;//initializing index variable with 0
for(int i=0;i<arr.length;i++) //loop
{
if(a==arr[i]) {//logic to find index
	index=i;
}
}
System.out.println("The index of the array is "+index);//printing the index
}
}

