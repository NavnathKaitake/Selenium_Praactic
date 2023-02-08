package casting;

public class ExplicitCasting {
	public static void main(String[] args) {	
int a=20;
//short b=a;//this we r not convert value into small data type
short b=(short)a;//we r use programer way
byte c=(byte)b;
System.out.println(c);//o\p-20

int  aa=200;
byte bb=(byte)aa;//range of byte is positive side is 127 thats why result id diffrent
System.out.println(bb);//o\p=-56
}
}