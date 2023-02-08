package allLoops;

public class LabelingLoopsusebreak {
	public static void main(String[] args) {
		int k=5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=k;j++) {
				System.out.print(" ");
		}
		k--;
		for(int a=1;a<=i;a++) {
			System.out.print("*");
		}
		
		System.out.println(" ");
	}

}
}
