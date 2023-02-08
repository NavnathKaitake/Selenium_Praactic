package accessspecifer1;

public class FinalveriableandmethodChild extends FinalveriableandMethodParent {
 int a=200;
	//public void m1() {
		//System.out.println("print m1 child method");
	//}
	public static void main(String[] args) {
		FinalveriableandmethodChild ob	= new FinalveriableandmethodChild();
		ob.m1();
		System.out.println(ob.a);
	
	}
	

}
