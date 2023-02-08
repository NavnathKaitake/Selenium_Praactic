package PracticeAll;

public class PracticeMethod {
	public static void m1() {
		System.out.println("Non Static method");
	}
	public  void m2() {
		
	//	PracticeMethod aa = new PracticeMethod();
		m1();
	
		
	System.out.println("Static method");
	}
	public static void main(String[] args) {
		
		PracticeMethod aa = new PracticeMethod();
		aa.m2();
		
		
	}
}
