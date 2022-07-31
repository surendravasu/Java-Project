class Calculator
{
public static void main(String args[])
{
	
	Calculator calc= new Calculator();
	double result = calc.add();
	System.out.println(result);
	calc.subtract(result,10);
	char result2 = calc.check();
	System.out.println(result2);
	//byte result3 = calc.display();
	System.out.println(calc.display());
}
	void subtract(double no1,int no2)
	{
		System.out.println(no1-no2);
	}
		byte display()
	{
		return 125;
	}
	char check()
	{
	return 'v';
	
	}
	double add()//void empty artham
{
return 10.5+20;
}
}
