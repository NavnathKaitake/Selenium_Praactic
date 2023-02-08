package allLoops;

public class SquarePaternusingFor {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++) {//call nested loop//inner loop
				System.out.print("*");
		}
		System.out.println(" ");
		}
	}

}
