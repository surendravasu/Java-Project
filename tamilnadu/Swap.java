import java.util.Scanner;

public class Swap {
	static int a;
	static int b;
	static int temp;
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the  A value  "  );
			a = sc.nextInt();
			System.out.println("Enter the  B value  "  );
			b = sc.nextInt();
			Swap sw = new Swap();
			sw.swap();
			
			
			
			
		}
		public void swap() {
			// TODO Auto-generated method stub
	         a = a - b;
	         b = a + b;
	         a = b - a;
	         
	         
	         System.out.println("A value  "  + a);
	        // System.out.println("B value  "  + a);
	         System.out.println("B value  "  + b);
				
			}
			
			
		
	}


