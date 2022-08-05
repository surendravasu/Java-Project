
public class Reverse1 {
	
	public static void main(String[] args) {
		Reverse1 re = new Reverse1();
		re.rev();
		
	}

	public void rev() {
		// TODO Auto-generated method stub
		int no = 121;
		int rev = 0;
		int rem;
		while (no > 0) {
			rem = no % 10;
			rev = (rev * 10) + rem;
			no = no/10;
			
		}
		System.out.println("Reverse a number   " + rev);
		
	}
	

}
