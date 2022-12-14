package assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

	public class Collection{
		List<Integer> a1=new ArrayList<Integer>(); //creating array list
		public 	void storeEvenNumbers(int N) {
				for(int i =2; i<=N ; i+=2) {
					a1.add(i);}
					System.out.println(a1);
			}
		
		List<Integer> a2=new ArrayList<Integer>(); 
			void printEvenNumbers() {
				Iterator <Integer>itr =a1.iterator();
				while(itr.hasNext()) {
					a2.add(itr.next()*2);}
				System.out.println(a2);
				
			}
			int retrieveEvenNumber(int N) {
				if(a1.contains(N)) {
					return N; } 
				else
					return 0;}
				
			
			public static void main(String[] args) {
				Collection c= new Collection();
				
				System.out.println("Printing Even Numbers : ");
				c.storeEvenNumbers(50);
				System.out.println("Printing even numbers multiplied by 2");
				c.printEvenNumbers();
				System.out.println("Checking if the number is present or not,if present,return the number,else 0");
				System.out.println(c.retrieveEvenNumber(2));
			}}
	
