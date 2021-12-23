package StringProgram;

public class Palindrome {

	public static void main(String[] args) {
	String s="abcab";
	String rev="";
	int len=s.length();

	for(int i=len-1;i>=0;i--)
	{
	    rev=rev+i;
	}

	if(s.equals(rev))
	{
	    System.out.println("palintrom string");
	}
	else{System.out.println("not palintrom string");}
	}

	}
