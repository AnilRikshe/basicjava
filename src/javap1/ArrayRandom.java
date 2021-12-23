package javap1;

import java.util.Random;

public class ArrayRandom {

	public static void main(String[] args) {
		Random rand=new Random();
		int a[]=new int[7];

		for(int i=0; i<100; i++)      
		{
			++a[1+rand.nextInt(6)];
			
		}
		System.out.println("a\tb");

		for(int b=1; b<a.length; b++)      
		{
			System.out.println(b+"\t"+a[b]);
		}

	}

}
