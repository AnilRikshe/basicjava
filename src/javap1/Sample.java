package javap1;

public class Sample 
{
	static 
	{
		System.out.println("Sib started");
		Sample s=new Sample();
		s.m2();
	//s.m1();
		System.out.println("Sib ended");
	}
	
	//iib
	{
		System.out.println("iib block");
		
	}
	//cons
	Sample()
	{
		this(20);
		System.out.println("0-arg cons");
		m1();
	}
	
	Sample(int a)
	{
		this(10,20);
		System.out.println("1-arg cons");
		m1();
	}
	Sample(int a,int b)
	{
		System.out.println("2-arg cons");
		m1();
	}
	public void m1()
	{
			System.out.println("ins method");
	}
	public static void m2()
	{
			System.out.println("static method");
	}
	public static void main(String[] args) 
	{
		

	}

}
