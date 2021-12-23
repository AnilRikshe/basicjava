package javap1;

public class ArrayCreation {

	public static void main(String[] args) {
		int a[]=new int[10];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[9]=90;
		System.out.println(a[0]);
		System.out.println(a[1]);
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		int b[]= {5,10,15,20,25};
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
	}

}
