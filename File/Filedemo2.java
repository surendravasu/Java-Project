package learnings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;



//oro document kula irukura image path yeduthu athe documentkula athe image vera path name potu save pani vaikarathu

//apa antha document kula ore image two times irukum.

public class Filedemo2 
{
	public static void main(String[] args) throws IOException 
	{
		InputStream is = new FileInputStream("/home/surendar/Documents/pexels-photo-12641743.jpeg");
		OutputStream os = new FileOutputStream("/home/surendar/Documents/vs.jpeg");
		int r = is.read();
		while(r!= -1)
		{
			os.write(r);
			r = is.read();
		}
		os.flush();
		os.close();
		
	}

}
