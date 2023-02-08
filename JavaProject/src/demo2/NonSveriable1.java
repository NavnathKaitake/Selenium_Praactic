//-	Non static variable values can be changed from object to object 
package demo2;

public class NonSveriable1 {
int a;//jvm will assign value
public static void main(String[] args)
{
	NonSveriable1 kk = new NonSveriable1();
	NonSveriable1 kk1 = new NonSveriable1();
	NonSveriable1 kk2 = new NonSveriable1();
	NonSveriable1 kk3 = new NonSveriable1();

	
	kk.a=10;
	kk1.a=12;
	kk2.a=20;
	kk3.a=56;
	System.out.println(kk1.a);
}
}
