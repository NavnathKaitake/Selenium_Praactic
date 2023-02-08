
//•	Write a program to display marks of 3 Student appearing for the following subject Maths, Physics, Chemistry


package combineclass;

public class MarksB {
	int Math;
    int Phy;
    int Chem;
    
    public static void main(String[] args) {
    	MarksB Navnath	= new MarksB();
    		MarksB Shubham	= new MarksB();
    			MarksB Mukund	= new MarksB();
    			
    			Navnath.Math=90;Navnath.Phy=45;Navnath.Chem=78;
    			Shubham.Math=60;Shubham.Phy=35;Shubham.Chem=55;
    			Mukund.Math=85;Mukund.Phy=45;Mukund.Chem=88;
    				
    	System.out.println("Marks of Navnath i :"+ " M " + Navnath.Math + " P " +Navnath.Phy + " C "+ Navnath.Chem);	
    	
    	System.out.println(Navnath.Math+Navnath.Phy+Navnath.Chem);
    	
    	System.out.println("Mark of Shubham is:" +" M " + Shubham.Math + " P " +Shubham.Phy + " C "+ Shubham.Chem);	
    	System.out.println(Shubham.Math+Shubham.Phy+Shubham.Chem);
    	
    	System.out.println("Mark of Mukund is:" +" M " + Mukund.Math + " P " +Mukund.Phy + " C "+ Mukund.Chem);	
    	System.out.println(Mukund.Math+Mukund.Phy+Mukund.Chem);
    	
    	
    }
    
}
