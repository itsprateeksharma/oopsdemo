package oopddemo2;

public class Account {
	
	int accNo;
	String name;
	
	public Account(int accNo,String name)
	{
		this.accNo=accNo;
		this.name= name;
	}
	void display()
	{
		System.out.println("------account details------");
		System.out.println("Account Number: "+accNo);
		System.out.println("Customer Name: "+name);
	}

}
