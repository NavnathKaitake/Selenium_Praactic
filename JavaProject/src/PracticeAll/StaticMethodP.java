package PracticeAll;

public class StaticMethodP {
	static int a=20;//static veriable it define only class
	int b=10;//non static veriable it define only class
	public static void main(String[] args) {
		StaticMethodP aa= new StaticMethodP();
		int c = a + aa.b;//Local veriable it allow in inside both of method
		System.out.println( c);
	}

}
