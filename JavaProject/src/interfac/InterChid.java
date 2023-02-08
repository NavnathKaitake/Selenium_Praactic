package interfac;

public abstract class InterChid implements IntrParent,InterParent1{

	@Override
	public void n1() {
		// TODO Auto-generated method stub
		System.out.println("n1");
	}

	@Override
	public void n2() {
		// TODO Auto-generated method stub
		System.out.println("n2");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2");
	}

	@Override
	public abstract void m3();
	public abstract void m4(); 
	//hear we can create object but when all method it should implements

}
