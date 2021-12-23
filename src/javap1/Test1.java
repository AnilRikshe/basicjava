package javap1;
class Test1
{
	//instance variable
		int x=100;
		int y=200;
		 static void add(int x, int y)   // local var
		{
		System.out.println(x+y);
		//System.out.println(this.x+this.y);
		}
		 
		public static void main(String[] args) {
		  
			int a=10;  
			int b=-2;  
			boolean c=true;  
			boolean d=false;  
			System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
			System.out.println(~b);//9 (positive of total minus, positive starts from 0)  
			System.out.println(!c);//false (opposite of boolean value)  
			System.out.println(!d);//true  
			}
	}
