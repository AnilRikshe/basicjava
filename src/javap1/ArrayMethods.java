package javap1;

public class ArrayMethods {

	public static void main(String[] args) {
		int b[]= {10,20,30,40,50};
	
		change(b);  //changed arrays value
		
		for(int x:b)  
		    System.out.println(x);
	}
static void change(int y[])
{
	for(int i=0;i<y.length;i++)
		y[i]+=5;
		}
	

}
