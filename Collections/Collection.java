import java.util.ArrayList;
import java.util.LinkedList;

public class Collection 
{
	public static void main(String[] args) 
	{
        ArrayList al = new ArrayList();
        al.add(5);
        al.add(10);
        al.add(20);
        ArrayList al2 = new ArrayList();
        al2.add(333);
        al2.add(444);
        System.out.println(al2);
        
        //al2() method oda al() method valueum serthu varum
        al2.addAll(al);
        System.out.println(al2);
        
        //al() method matum venum al2 () value venam
        al2.retainAll(al);
        System.out.println(al2);
        
        //remove() remove the al2() method kula al() valueva remove panrom.
        al2.removeAll(al);
        System.out.println(al2);
        
	}
}
