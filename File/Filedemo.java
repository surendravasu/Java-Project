package learnings;

import java.io.File;
import java.io.IOException;

public class Filedemo
{
	public static void main(String[] args) throws IOException 
	{
		//Folder creation
		//File file = new File("/home/surendar/Videos");
		//file.mkdir();
		//if(file.exists())
		//file.mkdirs(); // boolean true or false only file iruntha true llena false
		//System.out.println(file.createNewFile()); //create a new file but static main methodla IO exception kudukanum
		//file.delete(); // file delete method.
		//System.out.println(file.getAbsolutePath());  //full address kudukum
		//System.out.println(file.getCanonicalPath());

		//listing files and folders
		//		File file = new File("/home/surendar/Videos");
		//		String[] li =  file.list();
		//		for(String item : li)
		//		{
		//			System.out.println(item);
		//		}


		//listing files
		//		File file = new File("/home/surendar/Videos");
		//	    File[] li =file.listFiles();
		//	    for(File item : li)
		//	    {
		//	    	System.out.println(item);
		//	    }

		//Listing file only
		//	    File file = new File("/home/surendar/Videos");
		//	    File[] li =file.listFiles();
		//	    for(File item : li)
		//	    {
		//	    	if(item.isFile())
		//	    	System.out.println(item);
		//	    }

		//listing folder only
		//	    File file = new File("/home/surendar/Videos");
		//	    File[] li =file.listFiles();
		//	    for(File item : li)
		//	    {
		//	    	if(item.isDirectory())
		//	    	System.out.println(item);
		//	    }

		
		//Documents kula irukura html file matum print panrom  //html file list panrom
		File file = new File("/home/surendar/Documents");
		File[] li =file.listFiles();
		for(File item : li)
		{
			if(item.isFile())
			{
				String s = item.getName();
				if(s.endsWith("html"))
				System.out.println(s);
			}
		}





	}

}
