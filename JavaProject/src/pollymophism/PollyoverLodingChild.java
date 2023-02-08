package pollymophism;

public class PollyoverLodingChild extends PollyoverlodingParent {
	int a=20;
	public void m1(int a,boolean c) {
		System.out.println("Print child method m1");
	}
	public static void main(String[] args) {
		PollyoverLodingChild ob = new PollyoverLodingChild();
		ob.m1();
		ob.m1(false);
		ob.m1(52);
		ob.m1(526, false);
		PollyoverlodingParent ob1 =new PollyoverlodingParent();
		ob1.m1();//call only parent
		ob1.m1(false);//call only parent
		ob1.m1(10);//call only parent
		
		
		PollyoverlodingParent ob2= new PollyoverLodingChild();
		ob2.m1();//call only parent
		ob2.m1(true);//call only parent
		ob2.m1(50);//call only parent
		//ob2.m1(20,true);//it cannot call child bcz here only give referance of parent 
		
		//
	}
	

}
