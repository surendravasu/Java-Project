abstract class FactoryDemo extends Smartphone
{
boolean originalpiece = false;
static int price = 0;
public abstract void verifyFingerprint();
public abstract void providePattern();
public void browse()
{
System.out.println("Factory Demo browsing");
}
}
	