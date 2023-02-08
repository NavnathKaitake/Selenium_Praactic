package allLoops;

public class OddNousingReverse {
	public static void main(String[] args) {
	System.out.println("Reverse order using while even no");	
	
	int a=100;
	while(a>0) {
		if(a%2==0) {
			System.out.print(a+"\t");
		}
		a--;
	}
		
	System.out.println("");
	
		System.out.println("Reverse order using do whlie odd no");	
		int b=100;
		do {
			if(b%2==0)
				System.out.print(b+"\t");
			--b;
		}
		while(b>0);
		
	
	}

}
