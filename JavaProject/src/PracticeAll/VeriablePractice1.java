package PracticeAll;

public class VeriablePractice1 {
int a=20;
static int b=25;
public void m1() {
	int a=31;
	System.out.println(a);
}
public static void m2() {
	int a=30;
	int b=35;
	System.out.println(VeriablePractice1.b);
	// call static variable in static method local veriable as same then use classname.veriable
}
public static void main(String[] args) {
	m2();
	VeriablePractice1 aa = new VeriablePractice1();
	aa.m1();
}
	
}
