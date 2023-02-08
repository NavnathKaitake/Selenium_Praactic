//inheritance child class
package PracticeAll;

public class Childclass1 extends Parentclass1{
	
	public static void m3() {
		System.out.println("this is a chaild class static method");
	}
	public void m4()
	{
		System.out.println("this is a child class non static method");
	}
	public static void main(String[] args) {
		Childclass1 ob	= new Childclass1();
		ob.m1();
		m2();
		m3();
		ob.m4();
		
			}

}
