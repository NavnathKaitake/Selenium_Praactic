package accessspecifer1;

public class FinalveriableandMethodParent {
	final int a=20;
     //     int a=20;
	final void m1() {
		System.out.println("Print final m1 method");
		System.out.println(a);
	}
public static void main(String[] args) {
	FinalveriableandMethodParent ob = new FinalveriableandMethodParent();
	ob.m1();
	 int a=20;
	System.out.println(a);
}
}
