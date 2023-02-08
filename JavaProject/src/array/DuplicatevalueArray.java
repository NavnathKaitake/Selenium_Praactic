package array;

public class DuplicatevalueArray {
	public static void main(String[] args) {
		int[] a= {1,25,1,25,85,25,78,1,96,96,78};
		for(int i=0;i<=a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j])
				System.out.println(a[j]);	
		
			}
			}
		
	}

}
