package chennai; //encapulation  protected program
import hometown.Parent;
public class Children extends Parent //multi lelel inheritance
{
public static void main(String[] args)
{
Children child= new Children();
child.work();
child.chat();
child.do_welfare();
child.maintain_properties();
}
public void do_welfare()
{
System.out.println("consumer awerness");
}
public void work()
{
System.out.println("IT Professinoal");
}
public void chat()
{
System.out.println("chatting");
}
}