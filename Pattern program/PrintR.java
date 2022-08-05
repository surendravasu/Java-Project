
public class PrintR 
{
     public static void main(String[] args) 
     {
		PrintR pri = new PrintR();
		pri.print();
	 }
     public void print()
     {
    	 for(int row=1; row<=5; row++)
    	 {
    		 for(int col=1; col<=5; col++)
    		 {
    			 if((row==1 || row==3) && (col==1 || col==2 || col==3 || col==4))
    			 {
    				 System.out.print("* ");
    			 }
    			 else if((row==2 || row==4 || row==5) && (col==1 || col==5))
    			 {
    				 System.out.print("* ");
    			 }
    			 else
    			 {
    				 System.out.print("  ");
    			 }
    		 }
    		 System.out.println();
    	 }
     }
}
