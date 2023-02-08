package allLoops;

public class Evennousingwhileanddowhile {
	public static void main(String[] args) {
		System.out.println("Using  while Loops");
		
		int a=0;
		while(a<=100)
		{
			if(a%2==0) {
				System.out.print(a+"\t");
			}
			a++;
		}
		System.out.println("");
		System.out.println("Using do while Loops");
		int b=0;
		do
		{
        if(b%2==0)
        	
        	System.out.print(b+"\t");
       b++;
		}
		while(b<=100);
		
	}

}
