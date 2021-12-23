package javap1;

public class Student 
{  int x=50;
	
void m1()   //instance method
{
//instance area	
	int a=10;
	System.out.println(a);
}

static void m2()  //static method
{ 
	
	//static area
char c='a';
System.out.println(c);
}
	public static void main(String[] args) {
		
      Student s= new Student();
      s.m1();
      s.m2();
      System.out.println(s.x);
	}

}
