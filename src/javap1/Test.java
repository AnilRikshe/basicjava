package javap1;
public class Test 
{
class Employee
{
private int id;
private String name;
public int getId() {
	return id;
}
public void setId(int i) {
	this.id = i;
}
public String getName() {
	return name;
}
public void setName(String n) {
	this.name = n;
}
}
	public static void main(String[] args) 
	{
		Test k=new Test();
		Employee e=k.new Employee();
		e.setId(123);
		e.setName("anil");
		System.out.println(e.getId());
		System.out.println(e.getName());
	}
}
