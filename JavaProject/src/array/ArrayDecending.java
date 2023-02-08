package array;

public class ArrayDecending {
	public static void main(String[] args) {
		int[] a= {12,3,16,85,75,65,82,2,56,4,46 };
		int empty;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;i<a.length;j++) {
				if(a[i]<a[j])
				{
					empty=a[i];
					a[i]=a[j];
					a[j]=empty;		
					}
			}
			System.out.println(a[i]+" ");
		}
		
	}

}
