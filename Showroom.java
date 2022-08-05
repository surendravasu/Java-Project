class Showroom
{
String Name_tv = "BPL";
int amount = 20000;
int discount = 5;
float value = 20.5f;
boolean bo = true;
char single = 'v';
byte by = 100;
static String name_tv = "philps";
static int amt = 30000;
static float val = 10.55f;
static char sig = 'c';
static byte bye = 80;
static boolean bool = false;
public static void main(String[] args)
{
	Showroom showroom = new Showroom();
	System.out.println(showroom.Name_tv);//Global non static vaiable to static method kula object name mulama matum than variable name kuduthu print panlam
	System.out.println(showroom.amount);
	System.out.println(showroom.discount);
	System.out.println(showroom.value);
	System.out.println(showroom.bo);
	System.out.println(showroom.single);
	System.out.println(showroom.by);
	System.out.println(name_tv); //Global static vaiable to static method kula directave variable name kuduthu print panlam
	System.out.println(amt);
	System.out.println(Showroom.val);//Global static vaiable to static method kula class name mulama variable name kuduthu print panlam
	System.out.println(Showroom.sig);
	System.out.println(Showroom.bye);
	System.out.println(showroom.bool);////Global static vaiable to static method kula object name mulama variable name kuduthu print panlam
}
}