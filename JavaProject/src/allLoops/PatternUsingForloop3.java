package allLoops;

public class PatternUsingForloop3 {

	public static void main(String[] args) {
		for(int i=0;i<=8-1;i++) {
			for(int j=0;j<=i;j++) {
				
				System.out.print(" ");
			}
			for(int k=0;k<=8-1-i;k++){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
