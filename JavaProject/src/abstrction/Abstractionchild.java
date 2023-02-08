package abstrction;

public  class  Abstractionchild extends AbstrctionParent{

	@Override
	void m2() {
		// TODO Auto-generated method stub
		System.out.println("print implimentation");
	}
	public static void main(String[] args) {
		
	
	Abstractionchild obj= new Abstractionchild();
	obj.m2();
	obj.m1();
	}
	
}
		

	

