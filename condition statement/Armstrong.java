
public class Armstrong {
	public static void main(String[] args) {
		Armstrong ar= new Armstrong();
		ar.arm();
	}
public void arm() {
		
		int a = 1634;
		int no = a;
		double b = 0;
		int arms;
		int c = 0;
		while(a > 0)
		{
			a = a / 10;
			c++;
		}
		a = no;
		while(a > 0)
		{
			arms = a % 10;
			a = a / 10;
			b = b + (Math.pow(arms, c));
		}
		if(b == no)
		{
			System.out.println(no + " is Armstrong number");
		}
		else
		{
			System.out.println(no + " is not Armstrong number");
		}
	}
}
