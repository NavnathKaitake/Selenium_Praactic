package interfac;

public class InterfaceChild1 extends InterfaceChild {

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("print m3");
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("print m4");
		
	}
	public static void main(String[] args) {
		InterfaceChild1 obj = new InterfaceChild1();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
		InterfaceParent.m5();
	}

}
