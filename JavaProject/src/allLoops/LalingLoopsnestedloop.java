package allLoops;

public class LalingLoopsnestedloop {
	public static void main(String[] args) {
		OuterLoop:for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++)
			{
				
			if(j==4)
				break OuterLoop;
			
			System.out.println(j);
			
			}
			}
	}

}
