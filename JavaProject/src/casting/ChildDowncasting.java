package casting;

public class ChildDowncasting extends  ParentDownCasting {
public void m3() {
	System.out.println("m3 child method ");
}
public static void main(String[] args) {
	//ChildDowncasting ob  = new ParentDownCasting();//compiler does not allowed
	ParentDownCasting obj= new ChildDowncasting();
	ChildDowncasting Cob=(ChildDowncasting)obj;//Programer way
	Cob.m1();
	Cob.m2();
	Cob.m3();
	
}
}
