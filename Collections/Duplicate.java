import java.util.DuplicateFormatFlagsException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicate // interview program collections and String add panra program.
{
	public static void main(String[] args) 
	{
		Duplicate dup = new Duplicate();
		dup.find_duplicate("surendravasu");
	}

	public void find_duplicate(String word ) 
	{
      HashMap<Character,Integer> hs = new HashMap<Character,Integer>();
      char[] ch = word .toCharArray();
      for(char letter: ch )
      {
    	  if(!hs.containsKey(letter))
    	  {
    		  hs.put(letter,1);
    	  }
    	  else
    	  {
    		  int v = hs.get(letter);
    		  hs.put(letter, v + 1);
    	  }
      }
      System.out.println(hs);
      Set s = hs.entrySet();
      for(Object ob:s)
      {
    	  Map.Entry me = (Map.Entry) ob;
    	  int val = (int)me.getValue();
    	  if(val>1)
    	  //if(val==1)
    	  {
    		  System.out.println(me.getValue());
    	  }
    		  
      }

	}

}
