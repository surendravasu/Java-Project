class Prabu extends Sivaji
{
public static void main(String[] args)   // single inheritance
{
Prabu act = new Prabu();
act.actor();
act.dance();
act.comedy();
System.out.println(act.bike_no);
//System.out.println(act.doorno);
Sivaji act1 = new Sivaji();
act1.dance();
}
public void comedy()
{
System.out.println("Good comedian");
}
public void dance()
{
System.out.println("Good dancer");// method overridding used to inheritance only.//within class kula overriding used pana mudiathu
}
}
