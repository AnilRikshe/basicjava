package StringProgram;

public class RemoveJunk {

	public static void main(String[] args) 
	{
		String s="^%$#@$% anil 01254864";
		//regular expression[^a-zA-Z0-9]
		s=s.replaceAll("[^a-zA-Z0-9]", "");
System.out.println(s);
	}

}
