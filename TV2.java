class TV2 extends TV1
{
int amount = 50000;
public static void main(String args[])
{
TV2 tv = new TV2();
tv.brand();
}
public TV2(int amount)
{
this.amount = amount;
System.out.println(super.amount);
System.out.println("philps   "  +50000);
}
}