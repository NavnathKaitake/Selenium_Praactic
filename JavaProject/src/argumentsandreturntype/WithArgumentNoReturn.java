package argumentsandreturntype;

public class WithArgumentNoReturn {
public void m1(int a) {
System.out.println(a);	
}
public static void m2(String b) {
	System.out.println(b);
}
public static void main(String[] args) {
	WithArgumentNoReturn aa = new WithArgumentNoReturn();
	aa.m1(20);
	m2("Abhimanyu");
}
}
