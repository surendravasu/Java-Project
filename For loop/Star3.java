
public class Star3 {
	public static void main(String[] args) {
		Star3 st = new Star3();
		st.star();
	}

	private void star() 
	{
	     for(int row=1;row<=6;row++)
	     {
	    	 for(int col =1;col<=5;col++)
	    	 {
	    		 if(row==2 && (col==2  || col==3 || col==4))
	    		 {
	    			 System.out.print("  ");
	    		 }
	    		 else if((row==4 || row==5 || row==6) && col!=1)
	    		 {
	    			 System.out.print("  ");
	    		 }
	    		 else
	    		 {
	    			 System.out.print("* ");
	    		 }
	    	 }
	    	 System.out.println();
	 
	     }
	}

}
