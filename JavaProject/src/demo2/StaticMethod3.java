//•	Calling static method inside another Non static method 
package demo2;

public class StaticMethod3 {
	public static void m1() {
		System.out.println("Static method1");
	}
	
	public void m2()
	{
		System.out.println("Non Static Methos2");
		m1();
	}
public static void main(String[] args) {
	StaticMethod3 aa = new StaticMethod3();
	aa.m2();
}
}
