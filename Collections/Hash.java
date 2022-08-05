
import java.util.HashSet;
public class Hash
{
	public static void main(String[] args) 
	{
		
		// no duplicate
		//no order maintain
		
        HashSet hs = new HashSet();
        hs.add(10); // Integer
		hs.add(20); 
		hs.add(20); // not allow the duplicate hs.add(20)
		hs.add(true); 
		hs.add("vasu"); 
		hs.add(5.2f); 
		System.out.println(hs);
	}
}
