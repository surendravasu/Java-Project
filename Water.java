class Water
{
String name;
int amt;
Bell1 bell = new Bell1();

public static void main(String args[])
{
Water wat = new Water();
}

public Water()
{
this.name = "bislery";
this.amt = 20;
Bell1 obj1 = bell.print(this);
System.out.println("a value = " +obj1.a);
System.out.println("b value = " +obj1.b);
System.out.println("name = " +obj1.name);	
}
}

