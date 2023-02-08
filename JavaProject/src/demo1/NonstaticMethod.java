package demo1;

public class NonstaticMethod {
	public void  a2()
	{
		System.out.println("non ststic method 1");
		
	}
  public static void main(String [] args) {
	  
	  System.out.println(" This is main method 2");
	  
	  NonstaticMethod nonS = new NonstaticMethod();//this is object 
	  nonS.a2();
  }
}
