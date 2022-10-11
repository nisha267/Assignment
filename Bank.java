/*Consider a scenario where Bank is a class that provides 
functionality to get the rate of interest. 
However, the rate of interest varies according to banks. 
For example, SBI, ICICI and AXIS banks could 
provide 8%, 7%, and 9% rate of interest.*/
package assignment;



 class Bank2{
	int getInterest() {
		return 0;
		
	}}
	 class SBI extends Bank{
		int getInterest() {
			return 8;
		}
	}
	 class ICICI extends Bank{
		int getInterest() {
			return 7;
		}
	}
	 class AXIS extends Bank{
		int getInterest() {
			return 9;
		}
	}

 public class Bank{
		public static void main(String[] args) {
			SBI s=new SBI();
			ICICI i=new ICICI();
			AXIS a=new AXIS();
			System.out.println("The rate of interest of SBI is "+s.getInterest()+"%");
			System.out.println("The rate of interest of ICICI is "+i.getInterest()+"%");
			System.out.println("The rate of interest of AXIS is "+a.getInterest()+"%");
			
		}
	}
