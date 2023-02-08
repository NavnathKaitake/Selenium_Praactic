package opretors;

public class OpretorPractice {
	public static void main(String[] args) {
		
		int a=20;
		int b=30;
		if(a==b)
			System.out.println("Condition is eqal");
		else
			System.out.println("condition is not eqal");
		System.out.println("");
		//if(!(a==b))
			if(a!=b)
			System.out.println("Condition is true");
		else
			System.out.println("condition is false");
			System.out.println("");

			if(a>b)
				System.out.println("Condition is true1");
			else
				System.out.println("condition is false1");
			System.out.println("");

			if(a>b)//if condition is false then gose next else if condtion
				System.out.println("Condition is true1");
			else if(a<b)
				System.out.println("Condition is else if true2");
			else
				System.out.println("condition is false2");
			System.out.println("");

			if((a==b)&&(b==a)&&(a>b))//bhoth condition r true then print if condition
			System.out.println("Condition is && true");
			else
				System.out.println("condition is && false");
			System.out.println("");
			
			if((a==b)||(a!=b)||(a>b))//one cndition must br ture then jvm print if stmt
				//all condition is false then print else part
			System.out.println("Condition is || true");
			else
				System.out.println("condition is || false");
			System.out.println("");
			
			
			
			

			
			
			
	
	}

}
