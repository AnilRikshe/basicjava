package StringProgram;

public class stringManupulation 
{
public static void main(String[] args) 
{
String s="never lose hope";
String s1="never lose Hope";

System.out.println(s.length());          //15
System.out.println(s.charAt(4));        //r
System.out.println(s.indexOf('e'));     // first position of e is 1
System.out.println(s.indexOf('e',s.indexOf('e')+1));  // 2nd e posotion is 3

System.out.println(s.indexOf('e',s.indexOf('e',s.indexOf('e')+1)+1));  //9
System.out.println(s.indexOf("hello"));            //-1  not present then 

//string comparison
System.out.println(s.equals(s1));   //false

System.out.println(s.equalsIgnoreCase(s1));   //true

//substring
System.out.println(s.substring(0,8));


//trim
String s2="   core java   ";
System.out.println(s2.trim());

//replace with
String s3="I_am_Tester";
System.out.println(s3.replace("_", " "));

String date="1-1-2022";
System.out.println(date.replace("-", "/"));

//Split
String str="Welcome_to_India";
String array[]=str.split("_");

String arrList="";

for(int i=0;i<array.length;i++) 
{
	System.out.println(array[i]);
	}

//concat
String test="program";
System.out.println(test.concat("java"));
}
}
