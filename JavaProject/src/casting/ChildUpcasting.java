package casting;

public class ChildUpcasting extends ParentUpcasting {
	public void m3() {
		System.out.println("m3 method");
	}
	public static void main(String[] args) {
		ParentUpcasting ob = new ChildUpcasting();//Compiler allow  this
		ob.m1();
		ob.m2();
		ParentUpcasting Pobj=(ParentUpcasting)ob;//Programer way
		Pobj.m1();
		Pobj.m2();
		
		
	}

}
