package string;

public class StringMethod1 {
	public static void main(String[] args) {
		String a="Ramkrushnahari";
		boolean ver=a.contains("krushna");
		System.out.println(ver);
		System.out.println();
		
	 String b="Velocity";
	 System.out.println(b);
	 char[] var=b.toCharArray();
	 for(int i=0;i<b.length();i++)
		 System.out.println(var[i]);
	 System.out.println();
	 
	 String c="aa2dd2ff5";
	 char var1=c.charAt(3);
	 System.out.println(var1);
	 boolean ch=Character.isDigit(var1);//range 3in posisition 4 are d thats why give false 
	 System.out.println(ch);
	 System.out.println();
	 
	 String d="Automation manual selenium testing";
	 String[] output=d.split("\\s");
	 for(String i:output)
		 System.out.println(i);
	 System.out.println();
	 
	 String aa="  ";
	 boolean aaa=aa.isBlank();
	System.out.println(aaa);//Spece allowed
	boolean aaaa=aa.isEmpty();//Sting store spce thats why given false
System.out.println(aaaa);
	}

}
