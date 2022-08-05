import java.util.ArrayList;   // --> javala ArrayList nu oru class file iruku
public class ArrayListDemo 
{
	public static void main(String[] args)
	{ 
		ArrayList al = new ArrayList(); // --> ArrayList class filea al object vachu add() call panrom
		al.add(10); // Integer
		al.add(20); 
		al.add(20); // allow the duplicate al.add(20)
		al.add(true); 
		al.add("vasu"); 
		al.add(5.2f); 
		System.out.println(al);
		
		// --> add() index method mulama work panlam
		
		al.add(2, "pqr");         // --> add() index method mulama work panlam
		System.out.println(al); 
	   
		//ArrayList addAll method iruku
		ArrayList al2 = new ArrayList(); 
		al2.addAll(al); 
		System.out.println(al2);
		
		// clear method kudutha all valueum clear airum.
		al.clear();
		System.out.println(al);
		
		//contains() 
		System.out.println(al2.contains("vasu")); 
		
		//al2() get 4th index ena value irukunu pathukalam
	    System.out.println(al2.get(4));
	    
	    //sublist () method
		System.out.println(al2.subList(2, 5));
		
        //arrayla length iruku but inga lengthku pathil size() method use panvom total length value kodukum
		System.out.println(al2.size()); 
		
	//	System.out.println(al2.lastIndexOf("5.2f"));
		
		System.out.println(al2.indexOf("vasu"));
		
		//remove the object 
		al2.remove("vasu");
		System.out.println(al2);
		
	}

}
