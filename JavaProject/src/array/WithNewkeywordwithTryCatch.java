package array;

public class WithNewkeywordwithTryCatch {public static void main(String[] args) {
	int [] a = new int[5];
	a[0]=11;
	a[1]=22;
	a[2]=33;
	a[3]=44;
	a[4]=55;
	try {
	a[5]=66;
	}
	catch(ArrayIndexOutOfBoundsException ref)
	{
		System.out.println("this is arry index out of bound exception");
	}
	for(int i=0;i<5;i++)
		System.out.println(a[i]);
}


}
