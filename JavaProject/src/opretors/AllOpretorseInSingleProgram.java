package opretors;

public class AllOpretorseInSingleProgram {
	public static void main(String[] args) {
		int a=20;
		int b=25;
		int c=a+b;
		System.out.println("Print Two noAddition: "+c);
		System.out.println();
		int d=a-b;
		System.out.println("Print Two no Subtrction: "+d);
		System.out.println();
		int e=a*b;
		System.out.println("Print Two No Multipliction: "+e);
		System.out.println();
		int f=a/b;
		System.out.println("Print two no Division: "+f);
		System.out.println();
		
		System.out.println("Increment & Decrement Opreters");
		int x=30;
		int y=++x;//Pre-increment opreter
		System.out.println(x);
		System.out.println(y);
		System.out.println();
		
		int m=30;
		int n=m++;//Post-inccrement opreter
		System.out.println(m);
		System.out.println(n);
		System.out.println();
		
		int o=10;
		int p=--o;
		System.out.println(o);
		System.out.println(p);
		System.out.println();
		
		int q=10;
		int r=q--;
		System.out.println(q);
		System.out.println(r);
		System.out.println();
		
		System.out.println("Condition Statment All");
		int A=20;
		int B=25;
		if(A>B)
	    System.out.println("Greter than");
		else
			System.out.println("less then");
		int A1=25;
		int B1=20;
		if (A<B)
			System.out.println("greter than");
		else
			System.out.println("less then");
		System.out.println();
		
		int A2=20;
		int B2=20;
		if(A2==B2){//in if else stmt if condition shuid 2 line& more then use { }breces if cndition is single then no need of {} breces
			System.out.println("Condition is true");
		System.out.println("Condition is true1");
		}
		else
		System.out.println("Condition is false");
		System.out.println();

		System.out.println("Not Eqal to Opretore:");
		//if(A2!=B2)
		if(!(A2==B2))//this writing in this 2 way
			System.out.println("Condition is true");
		else
			System.out.println("Condition is false");
		System.out.println();
		
		if(!(A1<B1))	
			System.out.println("Condition is true11");
		else
			System.out.println("Condition is false11");
		
			System.out.println();
			System.out.println("if,else if then else Stmt");
			if(A1<B1)
				System.out.println("if Stmt  ");
		//	else if(A1>B1)
			else if(!(A1>B1))
			System.out.println("else if stmt  ");
			else 
				System.out.println("else stmt ");
                System.out.println();
                if(!(A1==25))
    				System.out.println("if Stmt  ");
                else if(B1==20)
        			System.out.println("else if stmt  ");
                else 
    				System.out.println("else stmt ");
                    System.out.println();
                    System.out.println("Logical Opretorse: &&");
                  
                    if((A1>B1)&&(B1<A1))//Both condition are true then print if codition
                    System.out.println("Print Logical opretorse1");
                    else
          			System.out.println("else stmt ");
          			System.out.println();

                    if((A1==25)&&(B1==55))//one condition are true anther are false then print else stmt
                        System.out.println("Print Logical opretorse2");
                        else
              			System.out.println("else stmt ");
                    System.out.println();
                    System.out.println("Logical Opretorse:or i.e ||");
                   if((A1==25)||(B1==25))//any one condition should be true
                   System.out.println("Logical Opretore or||");
                   else
             			System.out.println("else stmt ");
                   System.out.println();

                   if((A1==20)||(B1==25))//all condition are false then
                       System.out.println("Logical Opretore or||");
                       else
                 			System.out.println("else stmt ");
      


		
		
	
		}
}
