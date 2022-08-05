class Schl
{
int fees;
private int roomno;
static String name = "vasu";
public static void main(String args[])
{
Schl sl = new Schl();
sl.display();
int val=sl.add(70);        //syntex correct but (70) wrong passed value so return value matum outputla varum
System.out.println(val);
sl.sub(5,7);
	int val2 = sl.add(40, 50);
	System.out.println(val2);
	

}
void display()
{
System.out.println("welocome");
	Schl s2 = new Schl();                 //global non static variable not used to static mathod
	System.out.println(s2.room(roomno)); //private variable used to non static method only not static method
}
	int add(int fees)
	{
      return 50;
}
	void sub(int no1, int no2)
	{
		System.out.println(no1 + no2);
	}
	private int room(int roomno)
	{
		System.out.println(name);  //private method kula static varibale use panlam
	   
	   return	345;
	}
	int add(int fees, int amt)   // method overloading
	{
		int res = fees + amt;
		
		return res;
	}
		
}

