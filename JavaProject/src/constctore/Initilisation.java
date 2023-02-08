package constctore;

public class Initilisation {
static int a;// static veriable 
int b;
int c;
public Initilisation(int a,int b,int c) {
	this.a=a;
	this.b=b;
	this.c=c;
}
public static void main(String[] args) {
	//Initilisation ob
	new Initilisation(25,30,35);
	System.out.println(a);
	//Initilisation ob
	Initilisation ob = new Initilisation(25,35,45);
	
	System.out.println(ob.b);
	System.out.println(ob.c);
}
}
