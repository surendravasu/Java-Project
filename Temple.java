class Temple
{
	static int doorno=1234;//static variable
	static String name="murugan temple";//static variable
int bell,amount;//non static variable//declaration
public static void main(String[] args)
{
	Temple people1=new Temple();
	people1.bell=100;
	people1.amount=50;
	System.out.println(Temple.doorno);
	System.out.println(Temple.name);
	System.out.println(doorno);
	System.out.println(name);
	System.out.println(people1.doorno);
	System.out.println(people1.name);
	Temple people2=new Temple();
	people2.bell=50;
	people2.amount=10;
	Temple people3=new Temple();
	people3.bell=30;
	people3.amount=50;
	System.out.println(people1.bell);
	System.out.println(people1.amount);


}
}