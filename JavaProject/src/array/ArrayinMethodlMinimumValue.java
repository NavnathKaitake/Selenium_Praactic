package array;

public class ArrayinMethodlMinimumValue {
	public void m1(int[] a) {
		int b=a[0];
		for(int i=0;i<a.length;i++)
			if(b>a[i])
				b=a[i];
		System.out.println("print minimum value = "+b);
	}
	public static void main(String[] args) {
		int a[]= {12,5,869,78,236,5,76,2};
		ArrayinMethodlMinimumValue obj= new ArrayinMethodlMinimumValue();
		obj.m1(a);		
	}

}
