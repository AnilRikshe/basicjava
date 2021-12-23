package javap1;

public class ArrayIndex {

	public static void main(String[] args) 
	{
		System.out.println("Index\tvalue");    //creating header
		int a[]= {11,23,35,42,51,65};         //array intialization
		
		for(int i=0; i<a.length; i++)        //for loop
		{
			System.out.println(i + "\t" + a[i]);
		}

	}

}
