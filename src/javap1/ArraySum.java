package javap1;
public class ArraySum {

	public static void main(String[] args) {
	
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;

		for(int i=0; i<a.length; i++)      
		{
			sum+=i;
		}
		System.out.println("Sum of the array is "+sum);
		
		int b[]= {10,20,30,40,50};
		int total=0;
		for(int x:b)    //enhanced loop--type identifier variable --int x --array-b
		{
		    total+=x;  //total=total+x;
			
		}
		System.out.println("Enhanced loop sum of array "+total);
		
	}

}
