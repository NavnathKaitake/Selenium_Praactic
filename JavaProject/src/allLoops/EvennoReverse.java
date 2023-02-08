package allLoops;

public class EvennoReverse {
	public static void main(String[] args) {
		System.out.println("Even no using do while ");
		int a=100;
		do
		{
			//if(a%2==1)
				if(a%2!=0)
				System.out.print(a+"\t");
			a--;
		}
		while(a>0);
		System.out.println("");
		System.out.println("Even no using do while ");
		int b=100;
		while(b>0) {
			if(!(b%2==0))//if(a%2!=0) 
				{
				System.out.print(b+"\t");
		}
		b--;
	}

}
}
