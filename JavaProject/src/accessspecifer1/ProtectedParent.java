package accessspecifer1;

public class ProtectedParent {
	
	protected int a =20;
	protected static int b=30;
protected void m1() {
	System.out.println("print m1");
}
public static void main(String[] args) {
	ProtectedParent ob = new ProtectedParent();
	ob.m1();
	System.out.println(ob.a);
	System.out.println(b);
}
}
