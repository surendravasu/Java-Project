class Samsung extends FactoryDemo 
{
static int price = 5000;
public static void main(String args[])
{
	Samsung sam = new Samsung();
	System.out.println(sam.price);
	sam.browse();
	System.out.println(sam.call(50));
}
public void verifyFingerprint()
{
System.out.println("Verified");
}
public void providePattern()
{
System.out.println("provided");
}
public void sendmessage()
{
System.out.println("send the message");
}
public void receivecall() 
{
System.out.println("provided");
}
 public int call(int seconds)
 {
 return seconds;
 }
}