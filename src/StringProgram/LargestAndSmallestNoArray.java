package StringProgram;

import java.util.Arrays;

public class LargestAndSmallestNoArray {

	public static void main(String[] args) 
	{
	int num[]= {-10,20,50,-88,54886};
	int smallno=num[0];
	int largeno=num[0];
	
	for(int i=1;i<num.length;i++) 
	{
		if(num[i]>largeno) 
		{
			largeno=num[i];
		} 
		else if(num[i]<smallno) 
		{
			smallno=num[i];
		}
	}
System.out.println("\n array is: " +Arrays.toString(num));
System.out.println("largest no: "+largeno);
System.out.println("smallest no: "+smallno);
	}

}
