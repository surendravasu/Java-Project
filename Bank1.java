class Bank1
{
String customer;
int accno;
static String branch = "chennai";
	Bank1 (String customer, int accno)
	{
		this.customer = customer;
		this.accno = accno;
		
	}
public static void main (String[] args)
{
  Bank1 customer1 = new Bank1("vasu",456);
  Bank1 customer2 = new Bank1("karthi",345);
  System.out.println("Name of customer1  " +customer1.customer);
  System.out.println("Name of customer2  " +customer2.accno);
  System.out.println(branch);
			
}
		
}
			