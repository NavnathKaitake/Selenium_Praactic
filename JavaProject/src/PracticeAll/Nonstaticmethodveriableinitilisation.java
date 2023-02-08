package PracticeAll;

public class Nonstaticmethodveriableinitilisation {
	int a=20;
	int b;
	boolean c;
	public void m1(int a,int b,boolean c)
	{
		System.out.println("print a " +a +" Print b"+ b +"  Print c"+c);
		System.out.println(a);
		
	}
//	public Nonstaticmethodveriableinitilisation(int a,int b,boolean c)
	//{
		//System.out.println("print a " +a +"Print b " +b +"print c" +c);
		//System.out.println(a);
	//}
	public static void main(String[] args) {
	Nonstaticmethodveriableinitilisation ob=new Nonstaticmethodveriableinitilisation();
		ob.m1(50,60,false);
		//new Nonstaticmethodveriableinitilisation(70,80,true);
	
	}
}
