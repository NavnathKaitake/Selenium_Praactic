package PracticeAll;

public class Usingconstructoreiniliseveriable {
	int a=20;
	int b=25;
	boolean c=false;
	public Usingconstructoreiniliseveriable(int  a,int b,boolean c)
	{
		this.a=a;

		System.out.println("print a" +a +"print b "+ b + "print c"+c);
		System.out.println(a);
		System.out.println(c);
	}
	public static void main(String[] args) {
		new Usingconstructoreiniliseveriable(30,35,true);
		
	}

	
}
