/*Question no 1: WJP to insert the specified element 
   at the specified position in the linked list.*/

package assignment;

import java.util.LinkedList;

public class LinklistInsertElement {
	public static void main(String[] args) {
		LinkedList<String>l=new LinkedList<String>();
		l.add("Nisha");
		l.add("Baisali");
		l.add("Shreya");
		l.add("Pramita");
		l.add("Madhu");
		l.add("Sankho");
		System.out.println(l);
		l.add(5,"Sucheta");
		System.err.println("After add element at 5th position: "+" "+l);
		
}}
