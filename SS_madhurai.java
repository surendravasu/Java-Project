public class SS_madhurai extends SS_chennai
{
int discount =5;
public SS_madhurai(int discount)  //contructor and super keyword and super() using program
{
super(discount);
this.discount = discount;
}
public SS_madhurai()
{


}
public static void main(String[] args)
{
SS_madhurai ring = new SS_madhurai(4);
SS_madhurai dring = new SS_madhurai();
ring.purchase();
}
public void purchase()
{
System.out.println("purchase" +discount);
System.out.println(super.discount);
super.purchase();

}
}