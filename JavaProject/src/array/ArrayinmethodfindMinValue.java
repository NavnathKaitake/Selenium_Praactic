package array;
public class ArrayinmethodfindMinValue {
	public static void m1(int[] a) {
		int b=a[0];
		for(int i=0;i<a.length;i++)
			if(b<a[i])
				b=a[i];
	System.out.println("print highest value"+b);

	}
	public static void main(String[] args) {
		int[] a= {20,10,13,9,8,6,25,89,45,789,255,150};
		m1(a);
		
	}

}
