package array;

public class ArrayAcending {
	public static void main(String[] args) {
		
int [] a= {1,23,14,456,88,47,3,5,5,6,7,89,45,123,45,68,78,12,32,10};
int empty;
for (int i=0;i<a.length;i++) {

for(int j=i+1;j<a.length;j++) {
	if(a[i]>a[j])
{
	empty=a[i];
	a[i]=a[j];
    a[j]=empty;
}
}
System.out.print(a[i]+" ");
}
	
}
}
