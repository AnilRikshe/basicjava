package javap1;

public class synchronization extends Thread 
{  
	static BookTicket b;
	int seats;
	public void run() 
	{
		b.bookseats(seats);
	}
	
	public static void main(String[] args) 
	{
	 //b=new synchronization();
		BookTicket s1=new BookTicket();
	s1.bookseats(4);
	//s1.start();
	BookTicket s2=new BookTicket();
	s2.bookseats(5);
	}
}

class BookTicket
{
	int totalseats=14;
	
synchronized void bookseats(int seats) 
{
if(totalseats>=seats)
	{
System.out.println("Ticket Booked successfully..");
totalseats=totalseats-seats;
System.out.printf("you booked %d seats \n ",seats);
System.out.printf("remaining seats %d \n ",totalseats);
	}
else 
	{
		System.out.printf("sorry seats can't booked",seats);
		System.out.println("seat left "+totalseats);
}
}}