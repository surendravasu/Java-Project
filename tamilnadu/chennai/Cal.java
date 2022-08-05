
package tamilnadu.chennai;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cal 
{
	String str;
	int no1, no2;
	static Scanner sc=new Scanner(System.in);
	static Cal cc=new Cal();
	public static void main(String args[])throws ArithmeticException
	{
		System.out.println("****** MINI CALCULATOR******");
		System.out.println("what are you going to do");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		cc.operation();
		//cc.addtion(no1,no2);
		//cc.subtraction(no1,no2);
		//cc.multiplication(no1,no2);
		//cc.division(no1,no2);	

	}
	private void operation()
	{
		try
		{      cc.getOption();
		cc.calculate();
		cc.oneMore();
		}
		catch(InputMismatchException|ArithmeticException ime) 
		{
			System.out.println("please enter the valid inputs");
			cc.oneMore();
		}
	}
	private void division(int no1,int no2)
	{
		int result;
		// TODO Auto-generated method stub
		result=no1/no2;
		System.out.println("The resut=lt is:"+result);
	}
	private void multiplication(int no1,int no2) 
	{
		// TODO Auto-generated method stub
		int result;
		result=no1*no2;
		System.out.println("THE Multiplication result is"+result);
	}
	private void subtraction(int no1,int no2) 
	{
		int result;
		result=no1-no2;
		System.out.println("Result is:"+result);
		// TODO Auto-generated method stub
	}

	public void addition() 
	{
		// TODO Auto-generated method stub
		int result;
		result=no1+no2;
		System.out.println("Result is:"+result);
	}

	public void getOption() {
		System.out.println("enter the operation name:");
		str=sc.next();
		System.out.println("enter the number first number");
		no1=sc.nextInt();
		System.out.println("enter the Second number");
		no2=sc.nextInt();
	}

	public void calculate() 
	{
		System.out.println("operation name = " +str);
		switch(str)
		{
		case "Addition":
			cc.addition();
			break;
		case "Subtraction":
			cc.subtraction(no1,no2);
			break;
		case " Multiplication":
			cc.multiplication(no1,no2);
			break;
		case "Division":
			cc.division(no1,no2);
		}
	}

	public void oneMore() 
	{
		System.out.println("Do you want to continue");
		String y=sc.next();
		if(y.equals("yes"))
		{
			System.out.println("please select one  or more  option");
			cc.operation();
		}
		else
		{
			System.out.println("Thankyou for ur presence");
		}
	}

}