package assignment;
class Numbercheckexception extends Exception {// creating custom exception
	public Numbercheckexception(String s) {// creating exception method
		super(s);
	}
}

public class Exceptionclass2 {
	public long power(int n,int p)throws  Numbercheckexception {
		if(n<0 || p<0) {
			throw new Numbercheckexception("n and p should not be negative");
		}
		else if (n==0 || p==0) {
			throw new Numbercheckexception("n and p should not be Zero");
		}
		else
			return (n^p);
		
	}


	public static void main(String[] args)throws Numbercheckexception{
		Exceptionclass2 n=new Exceptionclass2();
		System.out.println(n.power(0,8));
	}

}
