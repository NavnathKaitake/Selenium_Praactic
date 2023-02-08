package accessspecifer1;

public class Private {
	private int a=20;
	private void m1() {
		System.out.println("print m1");
	}
public static void main(String[] args) {
	
	Private obj = new Private();
	obj.m1();
	System.out.println(obj.a);
}
}
