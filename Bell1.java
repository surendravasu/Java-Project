class Bell1
{
int a,b;
String name;
public static void main (String args[])
{
Bell1 bell = new Bell1(30,20,"vasu");
	
}
	public Bell1()
	{
		System.out.println("welcome   ****  ");
	}
	public Bell1(int a, int b)
	{
		this();
		this.a = a;
		this.b = b;
		System.out.println("value   "+this.a);
		System.out.println("value   "+this.b);
	}
	public Bell1(int a, int b, String name)
	{
		this(50, 40);
		this.a = a;
		this.b = b;
		this.name = name;
		System.out.println("value a = " +this.a);
		System.out.println("value b = " +this.b);
		System.out.println("value name = " +this.name);
		this.display();
	}
	
	static void display()
	{
		System.out.println("hello");
	}
		
}