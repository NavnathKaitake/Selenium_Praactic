package string;

public class StringMethod {
	public static void main(String[] args) {
		String a="Navnath";
		char b=a.charAt(2);//using this method display indexing char
		System.out.println(b);
		System.out.println();

		//o\p-v
		String a1="Navnath";
		String b1="Kaitake";
		String var=b1.concat(a1);
		System.out.println(var);
		
		System.out.println();
		//o\p-KaitakeNavnath
		System.out.println();
		String a2="Pawer";
		String b2= new String("Pawer");
		System.out.println(a2==b2);
		System.out.println(a2.equals(b2));
		//false
		//true
		System.out.println();
		String a3="navnath";
		String b3="NAVNATH";
		boolean var1=a3.equalsIgnoreCase(b3);
		System.out.println(var1);
       //true
		System.out.println();
		String a4="Navnath";
		String b4="Kaitake";
boolean var2=a4.equalsIgnoreCase(b4);
System.out.println(var2);
//false
System.out.println();
String a5="Navnath";
String var3=a5.substring(4);
System.out.println(var3);
//ath
	System.out.println();
	String a6="Navnath";
	String var4=a6.substring(1,3);//hear print indexing 1 to 3
	System.out.println(var4);
	//o\p-av
	System.out.println();
	String a7="Navnath";
	String var5=a7.replace('a','A');//using this method replace a on A
	System.out.println(var5);
	//o\p-NAvnAth
	System.out.println();
//var5=a7.replace(var3, a7);
	//System.out.println(var5);	
	String a8="NAVNATH";
	String var6=a8.toLowerCase();
	System.out.println(var6);//o\p-navnath
	System.out.println();
	
	String var7=a7.toUpperCase();
	System.out.println(var7);//o\p-NAVNATH
	System.out.println();
	
	a8="NAVNATH";
	int var8=a8.indexOf("T");
	System.out.println(var8);//o\p-5
	
	String a9="aaabccdee";
			int var9=a9.lastIndexOf("c");
	System.out.println(var9);
	//o\p-5
		
	}

}
