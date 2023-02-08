package demo2;

public class SataicMethod2 {
	public void aa2() {
		System.out.println("this is non static method");
	}
	public void aa3() {
		System.out.println("this is anyather non static metho");
		aa2();
	}
	public static void aa1() {
		System.out.println("this is a static method");
		SataicMethod2	aaa= new SataicMethod2();
		aaa.aa3();
	}
public static void main (String[] args) {
	aa1();
	System.out.println("this is main method");
}

}
