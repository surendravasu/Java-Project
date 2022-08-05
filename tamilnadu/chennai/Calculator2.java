package tamilnadu.chennai;

import java.util.Scanner;

public class Calculator2 
{

	//@Override // Annotation means meta data
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no");
		try
		{
		int no = scanner.nextInt();
		System.out.println(no+10);
		}
		catch(Exception e)
		{
			System.out.println("please Enter the number properly");
		}
	}
}