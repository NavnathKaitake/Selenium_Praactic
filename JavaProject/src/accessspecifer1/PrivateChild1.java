package accessspecifer1;

public class PrivateChild1 extends Private {
	
	public static void main(String[] args) {
		PrivateChild1 obj = new PrivateChild1();
		obj.m1();//m1 declare private thats why show the error
		System.out.println(obj.a);//a declare private thats why show the error
		//using asociation 
		Private obj1 =new Private();
		obj1.m1();//cant asociate
		System.out.println(obj1.a)//cant asociate
	}

}
