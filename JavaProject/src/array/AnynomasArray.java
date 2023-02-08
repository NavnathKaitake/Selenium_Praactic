package array;

public class AnynomasArray {
	
public static void m1(int[] a) 
{
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	System.out.println(" ");
}
public void m2(int[] b)
{
	for(int i=0;i<b.length;i++)
		System.out.print(b[i]+" ");
}
public static void main(String[] args) {
	m1(new int[]{10,11,12,13,14});
	AnynomasArray obj= new AnynomasArray();
	obj.m2(new int [] {20,21,22,23,24});
}
}
