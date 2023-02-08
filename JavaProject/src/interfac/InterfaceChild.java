package interfac;

public abstract class InterfaceChild implements InterfaceParent{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Print m1");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("print m2");
	}

	@Override
	public abstract void m3(); 

	@Override
	abstract public void m4();
	

}