class Emp implements Rules  // class Emp extends Parent1 implements Rules
{
public static void main(String args[])
{
Emp em = new Emp();
em.work();
em.promote();
em.salary();



}
public void work()
{
System.out.println("working");
}
public void promote ()
{
System.out.println("promotion");
}
public void salary()
{
System.out.println("salary");
}
}
