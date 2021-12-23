package javap1;

public class Array2D {

	public static void main(String[] args) {
		
			int a[][]= {{2,4,6},{3,6,9},{4,8,12}}; 
			int i, j;
			for(i=0; i<a.length; i++) {
			for(j=0; j<a.length; j++)
			System.out.print(a[i][j] + " ");
			System.out.println();
			}
	}

}



/*int a[][]= {{5,10,15,20,25},{6,12,18,24,30}};
for(int i=0; i<a.length; i++)

	for(int j=0; j<a.length; j++) 
	{
		int k=a[i][j];
		k++;
	}
	
	for(int i=0; i<a.length; i++)
	{
		for(int j=0; j<a.length; j++) 
		{
			System.out.println(a[i][j]+" ");
			System.out.println();
		}
}*/
