package overriding;

public class OverChild extends OverParent{
	public void m1() {
		System.out.println("print child overriding method m1");
	}
public static void main(String[] args) {
	OverChild ob= new OverChild();
	ob.m1();//jiska object hai uska method chalega hear print only child method
	OverParent ob1 = new OverChild(); 
	ob.m1();//jiska object hai uska method chalega hear print only child method
	// hear i use ref of parent but not call perent method call only child bcz depend on object
  OverChild ob2 = new OverParent();//
	ob2.m1();
	OverParent ob3 = new OverParent();
	ob3.m1();
	// hear call using object parent call parent overriding method

	}

}
