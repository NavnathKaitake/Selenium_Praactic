//•	Calling Non static method inside another static method
package method;

public class NonSataic1 {
public void m11() {//non static method
	System.out.println("this non ststic method calling in ststic method");
}
public static void m() {//static method
System.out.println("this is ststic method");
NonSataic1 aa = new NonSataic1();
	aa.m11();
}
public static void main(String[] args) {
	m();//calling ststic method
} 
}
