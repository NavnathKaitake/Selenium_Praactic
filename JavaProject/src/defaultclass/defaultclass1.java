package defaultclass;

class defaultclass1 {

	 void  m1() {
		System.out.println("print default method m1 ");
		
	}
	public void n1() {
		System.out.println("print public method");
	}
	public static void main(String[] args) {

		defaultclass1 obj=new defaultclass1();
		obj.m1();
		obj.n1();
	}

}
