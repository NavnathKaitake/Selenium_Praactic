package defaultclass;

class Defaultclass2 extends defaultclass1  {
	
	void m2() {
		System.out.println("Print Defaultclass2 m2 ");
	}
	public static void main(String[] args) {
		Defaultclass2 obj=new Defaultclass2();
		obj.m1();
		obj.m2();
		obj.n1();
	}

}
