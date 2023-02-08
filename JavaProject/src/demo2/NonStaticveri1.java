//-	To call non static variable inside non static method creation of object inside non static method is not required 


package demo2;

public class NonStaticveri1 {
	int a=10;
	int b=12;
	public void m1() {
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		NonStaticveri1	aa = new NonStaticveri1();
		aa.m1();
	}

}
