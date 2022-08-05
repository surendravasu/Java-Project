public class Shajahan extends Barbar
{
int discount = 5;
public static void main(String args[]) //contructor and super keyword and super() using program
{
Shajahan shaj = new Shajahan();//constructor yentha parameterum vachu define panatha po default construtor call pana work agum
Shajahan shaj1 = new Shajahan(5);//oru parameter construtora define pana pinadi default constructora call pana default constructraium define pananum
shaj.purchase();
}
public Shajahan(int dis)
{
super(dis);
this.discount = dis;
}
public Shajahan()
{

}
public void purchase()
{
System.out.println("purchase   "+discount);
System.out.println(super.discount);
super.purchase();
}

}