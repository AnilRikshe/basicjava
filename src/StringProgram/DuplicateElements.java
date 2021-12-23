package StringProgram;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) 
	{
		//2.using hashset or collection
		
		String names[]={"java","javascript","python","ruby","java","ruby"};
		
		Set<String> store=new HashSet<String>();
		for(String name:names)
		{
			if(store.add(name)==false) 
			{
				System.out.println("duplicate element: " +name);
			}
		}
		
		
		/*
		 * //1.compare each element O(n*n)----worst solution String names[]=
		 * {"java","javascript","python","ruby","java","ruby"}; for(int
		 * i=0;i<names.length;i++) { for(int j=i+1;j<names.length;j++) {
		 * if(names[i].equals(names[j])) {
		 * System.out.println("Duplicate string: "+names[i]); } } }
		 */
		

	}

}
