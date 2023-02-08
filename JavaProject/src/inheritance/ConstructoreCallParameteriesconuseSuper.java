package inheritance;

public class ConstructoreCallParameteriesconuseSuper extends ConstructoreParentParameteried {
	
	public ConstructoreCallParameteriesconuseSuper() {
		super(50,true);
		//super(50);
	//	super(true);
		
		System.out.println("call Parent con");
		
	}
public static void main(String[] args) {
	new ConstructoreCallParameteriesconuseSuper();
}
}
