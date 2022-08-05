import java.util.Scanner;

public class School
{
	static int total;
	static int mark1,mark2,mark3,mark4,mark5;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the subject");
		System.out.print("Mark 1 Tamil   =  ");
		mark1 =sc.nextInt();
		System.out.print("Mark 2 English =  ");
		mark2 =sc.nextInt();
		System.out.print("Mark 3 Maths   =  ");
		mark3 =sc.nextInt();
		System.out.print("Mark 4 Science =  ");
		mark4 =sc.nextInt();
		System.out.print("Mark 5 Social  =  ");
		mark5 =sc.nextInt();
		System.out.println();
		sc.close();
		School mark = new School();
		mark.calculate();
	}
	public void calculate()
	{
		School mark = new School();
		total = mark1+mark2+mark3+mark4+mark5;
		System.out.println("total = " + School.total);
		float avg;
		avg = total / 5;
		System.out.println("average = " + avg);
		mark.subject(avg);
		
	}
	public void subject(float avg)
	{
		if(mark1>=35 && mark2>=35 && mark3>=35 && mark4>=4 && mark5>=35) 
		{
			if(avg>=35 && avg<=50)
			{
				System.out.println(" D Grade"); 
			}
			else if(avg>=51 && avg<=70)
			{
				System.out.println(" C Grade");
			}
			else if(avg>=71 && avg<=90)
			{
				System.out.println(" B Grade");
			}
			else if(avg>=91 || avg==100)
			{
				System.out.println(" A Grade");
			}
		}
		else 
		{
			System.out.println("Fail");
		}
	}
}
