class ActorSivakumar implements Actor
{
	static String address = "coimbatore";
	public static void main(String args[])
	{
		ActorSivakumar as = new ActorSivakumar(65, "Audi Car");
		as.act();
		as.dance();
		as.sing();
		as.speaking();
		System.out.println(address);
		Actor ac = new ActorSivakumar();
		ac.act();
		ac.dance();
		ac.sing();
		System.out.println(ac.address);
	}
	public void act() 
	{
		System.out.println("This is act method");
	}
	public void dance() 
	{
		System.out.println("This is dance method");
	}
	public void sing() 
	{
		System.out.println("This is sing method");
	}
	public void speaking()
	{
		System.out.println("This is speaking method");
	}
	public ActorSivakumar(int a,String car)
	{
		System.out.println("a value = " +a);
		System.out.println("car = " +car);
	}
	public ActorSivakumar() {
		System.out.println("This is default constructor of ActorSivakumar");
	}
}