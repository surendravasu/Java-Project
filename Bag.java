class Bag
{
public static void main(String args[])
{
Bag book = new Bag();
}
	public Bag()
	{
		//this(50,"vasu");
		System.out.println("welcome");
	}
	public Bag(int bag,String name)
	{
		this(50,3,"vasu");
		System.out.println("Bag  "   +bag);
		System.out.println("name  "  +name);
	}
	public Bag(int book,int discount,String name)
	{
		System.out.println("book   " +book);
		System.out.println("discount  "+discount);
		System.out.println("name    "+name);
		
	}
	
		
}