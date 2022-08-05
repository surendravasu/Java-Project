public class Child2 extends Parent2      //dynamic binding program
{
public static void main(String args[])
{
//Child2 ch = new Child2();         //child class object iruku so childla irukura methoda call pani smarttv print panum
//ch.watchtv();
//Parent2 pa = new Parent2();       //parent class object iruku so parent class memorila irukura methoda call pani cable tv print panum.
//pa.watchtv();
Parent2 pa = new Child2();       //parent vanthu child class kula vararu so child methodla irukura smart tv tha paparu and print panum.
pa.watchtv();                       // memory childla iruku so parent childla class la ena tv iruko atha paparu and print panum.        
}
public void watchtv()
{
System.out.println("smart tv");
}

}
  

//Parent2 pa = new Child2();  //dynamic binding or late binding

//Child2 ch = new Child2();   //static binding or early binding