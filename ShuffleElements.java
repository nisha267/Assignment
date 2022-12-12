/*Question no 3:WJP to shuffle the elements in a 
   linked list.*/
package assignment;
import java.util.Collections;
import java.util.LinkedList;

	public class ShuffleElements {
		public static void main(String[] args) {
			LinkedList<String>l=new LinkedList<String>();
			l.add("Nisha");
			l.add("Baisali");
			l.add("Shreya");
			l.add("Pramita");
			l.add("Madhu");
			l.add("Sankho");
			System.out.println(l);
			Collections.swap(l,0,1);
			Collections.swap(l,2,3);
			Collections.swap(l,4,5);
			System.err.println("After shuffling the elements in linklist "+l);
	}}

