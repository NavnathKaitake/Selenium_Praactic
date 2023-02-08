package array;

public class MultidimentionalArray {

	public static void main(String[] args) {
		int [] a= {10,11,12,13};//Single dimentional array
for(int i=0;i<a.length;i++)
	System.out.println(a[i]);

int b[][]= {{10,11,12},{20,21,22},{30,31,32}};
	for(int i=0;i<b.length;i++) {
		for(int j=0;j<b.length;j++) {
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	}
	}
}
