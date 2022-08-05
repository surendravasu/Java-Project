class Hair1
{
int val,amt;
String name;
public static void main(String args[])
{
Hair1 ha = new Hair1();
}
public Hair1(int val, String name)
{
	this(20,30,"mugan");
	this.val = val;
	this.name = name;
	System.out.println("hello");
	System.out.println(this.val);
	System.out.println(this.name);
}
	public Hair1()
	{
		this(40,"vasu");
		System.out.println("welcome");
	}
	public Hair1(int val,int amt,String name)
	{
	this.val = val;
	this.amt = amt;
	this.name = name;
	System.out.println(" total value "  +this.val);
	System.out.println(" total amount "  +this.amt);
	System.out.println("  name "  +this.name);
	}
}
	
	
		
	
	

