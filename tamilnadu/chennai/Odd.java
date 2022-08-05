package tamilnadu.chennai;

import java.util.Scanner;

public class Odd {
	static int a;

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		Odd od = new Odd();
		od.odd();
	}
		
	public void odd()
	{
		if(a%2==0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}
	}
}
	


