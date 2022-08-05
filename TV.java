class TV
{
int amount;
String Tv_Name;
public static void main(String args[])
{
TV cable = new TV();
}
public TV()
{
	this(30000,3,"BPL");
	//this(40000,"Sony");
	System.out.println("welcome");
}
	public TV(int tv,int discount,String Tv_Name)
	{
		this(40000,"Sony");
		int dis;
		amount = tv;
		dis = discount;
		this.Tv_Name = Tv_Name;
		System.out.println(amount);
		System.out.println(dis);
		System.out.println(this.Tv_Name);
	}
	public TV(int tv,String Tv_Name)
	{
		amount = tv;
		this.Tv_Name = Tv_Name;
		System.out.println(amount);
		System.out.println(Tv_Name);
	}
}
