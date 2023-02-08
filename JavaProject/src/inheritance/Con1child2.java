package inheritance;

public class Con1child2 extends Con1child1{
	
	public void m3() {
		System.out.println("print m3");
	}
	public static void main(String[] args) {
		Con1child2 ob = new Con1child2();
		//jvm serach first constructore when u create object if u have not create constructore then compilar create
		//defualt con. and call parech con.when u use inheritance
		
		ob.m1();
		ob.m2();
		ob.m3();
	}

}
