package tamilnadu.chennai;

public class Hcf {
	public static void main(String[] args) {
		Hcf hc = new Hcf();
		hc.findCommonDivisors(120,100);
	}
	private void findCommonDivisors(int no1, int no2) {
		// TODO Auto-generated method stub
		// no1 = 120 , no2 =100;
	// Ternary Operator
	int small = no1<no2? no1: no2; 
	int gcd = -1; 
		int div = 2; 
		while(div<small)
			{
			if(no1%div==0 && no2%div==0)
				{
			//	System.out.println(div); 
				gcd = div; //20
				}
			div = div+1; 
		}
		if(gcd>0)
		System.out.println(gcd);
		else
			System.out.println("No Common Divisors");
		
	} 

}
