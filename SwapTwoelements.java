/* Question no 2:WJP of swap two elements in a 
  linked list.*/
package assignment;
import java.util.Collections;
import java.util.LinkedList;
public class SwapTwoelements {
	public static void main(String[] args) {
		LinkedList<String>l=new LinkedList<String>();
		l.add("Nisha");
		l.add("Baisali");
		l.add("Shreya");
		l.add("Pramita");
		l.add("Madhu");
		l.add("Sankho");
		System.out.println(l);
		Collections.swap(l,2,4);
		System.out.println("After swaping third position with fifth position: "+l);
}}
