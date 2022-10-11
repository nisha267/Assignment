/*Problem 2 :


Class A serves as a base class for the derived class B, 
which in turn serves as a base class for the derived class C.
(Which type Of Inheritance explain with an example)*/
//multilevel inheritance
package assignment;
class C
{
	 public void show() {
	System.out.println("This is class Teacher");}}
class B extends C
{
	 public void display() {

	System.out.println("This is class Student");}}
	
 class Parents  extends B{
	 public void print() {
		 System.out.println("This is class parents");
	 }
 }
  public class College{
 public static void main(String[] args) {
	 
	 C c=new C();
	 B s=new B();
	 Parents p=new Parents();
	 
	 c.show();
	 s.display();
	 p.print();
 }}
		


