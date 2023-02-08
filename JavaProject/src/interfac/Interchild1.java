package interfac;

public class Interchild1 extends InterChid {

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("m4");
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("m5");
	}
public static void main(String[] args) {
	Interchild1 ob = new Interchild1();
	ob.m1();
	ob.m2();
	ob.m3();
	ob.m4();
	ob.n1();
	ob.n2();
}
}
