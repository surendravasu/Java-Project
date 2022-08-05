class Vijay extends SAC
{
public static void main(String[] args)
{
Vijay act = new Vijay();
act.direct();
act.act();
act.dance();
System.out.println(act.car);
//System.out.println(act.mobile_pwd);
SAC sac = new SAC();
sac.direct();
}
public void direct()// method overridding
{
System.out.println(" feel good movies");
}
public void dance()
{
System.out.println("dancer");
}
}