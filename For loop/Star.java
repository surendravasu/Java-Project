
public class Star {
	static int n = 5;
	public static void main(String[] args)
	{
		Star st= new Star();
		st.star();
	}

	public void star()
	{
		int size = 5;
	    for (int i = 0; i < size; i++) {
	      // print spaces
	      for (int j = 0; j < size - i - 1; j++) {
	        System.out.print(" ");
	      }
	      // print stars
	      for (int k = 0; k < 2 * i + 1; k++) {
	        System.out.print("*");
	      }
	      System.out.println();
	    }
	}
}

