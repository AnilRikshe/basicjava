package StringProgram;

import java.util.HashMap;

public class stringDuplicate 
{
static void duplicateString(String str)
  {
	
	HashMap<String,Integer> hm=new HashMap<>();
    String[] s=str.split(" ");
    
  for(String temp:s) 
    {
	   if(hm.get(temp)!=null) 
	  {
		hm.put(temp, hm.get(temp)+1);
	  }
	   
	  else 
	  {
		hm.put(temp,1);
	  }
	   
    }
       System.out.println(hm);
  }
	public static void main(String[] args) 
	{
		duplicateString("hello anil anil gm gm") ;
	}

}
