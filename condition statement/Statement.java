import java.util.Scanner;

public class Statement {
	static int insentive ;
	static int sales;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		sales = sc.nextInt();
		insentive = 0;
		if (sales >= 10000)
			insentive = sales * (10/1000);
		{
			System.out.println("Enter the sales amount %i");
		}
		
		
	}

}
