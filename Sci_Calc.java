class Sci_Calc
{
public static void main(String[] args)
{
Sci_Calc sc1 = new Sci_Calc();
sc1.add(50,55);
//sc1.add(35,7.5f);
//sc1.add(10,20,30);
}
	/*int add (int no1, int no2, int no3)
	{
	return no1+no2+no3;                         //error Method
	}*/
	void add(int no1, int no2, int no3)
	{
		System.out.println(no1+no2+no3);
	}
	 void add(int no1,float no2)
	{
		System.out.println(no1+no2);
	}
void add(int no1,int no2)
{
System.out.println(no1+no2);
}
}