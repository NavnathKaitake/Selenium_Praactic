
//•	Write a program to display marks of 3 Student appearing
//for the following subject Maths, Physics, Chemistry
package combineclass;

public class MarksA {
	

public  void m1() {
    int Maths = 78;
  int Physics = 85;
int Chemistry = 45;
 System.out.println("Mark of Navnath is: "+"Math:"+Maths+   "  Phy:"+Physics+ "  Chem:"+Chemistry);
 System.out.println("Navnath Total Marks is:" +( Maths+Physics+Chemistry));
 System.out.println("");
}

public  void m2() {
	
    int Maths = 70;
  int Physics = 46;
int Chemistry = 65;
 System.out.println("Mark of Shriram is: "+"Math:"+Maths   +"  Phy:"+Physics+ "  Chem:"+Chemistry);
 System.out.println("Navnath Total Marks is:" +( Maths+Physics+Chemistry));
 System.out.println("");
}

public  void m3() {
	m1();
	m2();
    int Maths = 90;
  int Physics = 65;
int Chemistry = 82;
 System.out.println("Mark of Krushna is: "+"Math:"+Maths   +"  Phy:"+Physics+ "  Chem:"+Chemistry);
 System.out.println("Navnath Total Marks is:" +( Maths+Physics+Chemistry));
 System.out.println("");
}


public static void main(String[] args) {
MarksA	abj = new MarksA();
	abj.m3();
}
}
