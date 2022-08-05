class Bus
{
int amount = 300000;
int ticket;
static String name = "VPA";
	private int bus_no = 23456;
public static void main(String args[])
{
	Bus bu = new Bus();
	bu.ticket = 30;
	System.out.println(bu.ticket);
    System.out.println(bu.amount);
	System.out.println(Bus.name);
	System.out.println(bu.bus_no);
	bu.rate();
	
}
void rate()
{
System.out.println("500000");
	Bus bu1 = new Bus();
	bu1.discount();
}
static void discount()
{
	System.out.println("discount  "  +5);
}
}