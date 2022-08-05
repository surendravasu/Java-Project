class Barbar
{
	int discount = 2;
public static void main(String args[])   //contructor and super keyword and super() using program
{
Barbar akbar = new Barbar();
}
public Barbar()
{
System.out.println("welcome cooldrinks"); 
}
	public Barbar(int discount)
	{
		this.discount = 2;
		System.out.println(this.discount);
	}
	public void purchase()
	{
		System.out.println("chennai purchase   "+discount);
	}
}