import java.util.Scanner;

public class Calculator 
{
	static float no1,no2;
	static int operationName;
	float result;
	static Calculator calc = new Calculator();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("CALCULATOR");
		System.out.println();
		System.out.println("What are you going to do?");
		System.out.println();
		calc.getInfo();
	}

	public void getInfo() 
	{
		System.out.println("1.Addition (+)");
		System.out.println("2.Subtraction (-)");
		System.out.println("3.Multiplication (*)");
		System.out.println("4.Division (/)");
		System.out.println();
		System.out.println("Select the opertion");
		operationName = sc.nextInt();
		System.out.println();
		System.out.println("Enter the No1");
		no1 = sc.nextFloat();
		System.out.println("Enter the No2");
		no2 = sc.nextFloat();
		System.out.println();
		calc.calculate();
		System.out.println();
		calc.processContinue();
	}
	public void add()
	{
		result = no1+no2;
		System.out.println("Addition =  " + result);
	}
	public void sub()
	{
		result = no1-no2;
		System.out.println("Subtraction =  " + result);
	}
	public void mul()
	{
		result = no1*no2;
		System.out.println("Multiplication =  " + result);
	}
	public void div()
	{
		result = no1/no2;
		System.out.println("Division =  " + result);
	}
	public void calculate()
	{
		switch(operationName)
		{
		case 1:
			calc.add();
			break;
		case 2:
			calc.sub();
			break;
		case 3:
			calc.mul();
			break;
		case 4:
			calc.div();
			break;
		default:
			System.out.println("Please Select valid Operation");
			break;
		}
	}

	public void processContinue()
	{
		System.out.println("Do you want to continue?");
		System.out.println();
		System.out.println("1.yes");
		System.out.println("2.no");
		String cont = sc.next();
		System.out.println();
		if(cont.equals("yes"))
		{
			calc.getInfo();
		}
		else
		{
			System.out.println("Thank You");
		}
	}
}
