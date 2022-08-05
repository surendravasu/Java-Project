class Showroom1
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
	Showroom1 showroom = new Showroom1();
	//String str = (showroom.Name_tv);
	//System.out.println(str);
	showroom.str();
	
}
	void str()
	{
		//Showroom1 showroom = new Showroom1();Global non static variable to non static method kula object vachu print panlam
		//System.out.println(showroom.Name_tv); yes
		System.out.println(Name_tv); // Global non static vaiable to non static method kula directave variable name kuduthu print panlam
		System.out.println(amount);
		System.out.println(discount);
		System.out.println(value);
		System.out.println(bo);
		System.out.println(single);
		System.out.println(by);
		System.out.println(val);
		System.out.println(sig);
		System.out.println(bye);
		System.out.println(bool);
		System.out.println(name_tv);
		
	
	}
}