package abstrction;

public class Child2Abs extends Child1abs {

	@Override
	void m2() {
		// TODO Auto-generated method stub
		System.out.println("print implimentation");
	}
public static void main(String[] args) {
	Child2Abs obj = new Child2Abs();
	obj.m2();
	obj.m1();
}
}
