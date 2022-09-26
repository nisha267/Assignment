package demo;
//WAP to know a no is prime or not
public class Prime_no {

	public static void main(String args[]) {
		int n = 7;
		int count = 0;
		int i = 2;
		while (i <= n / 2) {
			if (n % i == 0) {
				count++;
			}
			i++;
		}
		if (count > 0)
			System.out.println("The no is not a prime no");
		else
			System.out.println("The no is  a prime no");
	}
}
