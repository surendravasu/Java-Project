class Child3 extends Parent3             //inheritance  //Abstract program
{
static public void main(String args[])
{
	Parent3 pa = new Child3();          //dynamic binding
	pa.grow();
	pa.work();
	pa.study();
Child3 ch = new Child3();
ch.study();
}
public void study()                    //method overriding
{
System.out.println("studying");
}
}