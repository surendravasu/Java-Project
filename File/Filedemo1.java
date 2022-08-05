package learnings;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class Filedemo1
{
	public static void main(String[] args) throws IOException 
	{
		//file writing //flush meaning pen vai mudi vachutan artham

		//		File file = new File("/home/surendar/Videos/vsv.txt");
		//		System.out.println(file.createNewFile());
		//		FileWriter fw = new FileWriter(file);
		//		fw.write("surender");
		//		fw.write("\n");
		//		fw.write("vasu");
		//		fw.flush();     //flush kandipa kudukanum 
		//		fw.close();

		//ithuku munadi kudutha nameum serthu varanum (file,true) kudukanum
//				File file = new File("/home/surendar/Videos/vsv.txt");
//				System.out.println(file.createNewFile());
//				FileWriter fw = new FileWriter(file,true);
//				fw.write("surender");
//				fw.write("\n");
//				fw.write("789");
//				fw.flush();
//				fw.close();

		//		File file = new File("/home/surendar/Videos/vsv.txt");
		//		System.out.println(file.createNewFile());
		//		FileWriter fw = new FileWriter(file,true);
		//		BufferedWriter bw = new BufferedWriter(fw);
		//		bw.write("456");
		//		bw.newLine();
		//		fw.write("234");
		//		fw.write("\n");
		//		fw.write("789");
		//		fw.flush();
		//		fw.close();


		//file reading
		//		File file = new File("/home/surendar/Videos/vsv.txt");
		//		//System.out.println(file.createNewFile());
		//		FileReader fr = new FileReader(file);  //file kula surender name iruku
		//		int r = fr.read();
		//		//System.out.println(r);  //ascii value o/p varthu s value 115 varthu
		//	    r = fr.read();
		//		System.out.println((char) r);  //char kudutha u nu o/p varthu
		//		r = fr.read();
		//		System.out.println((char) r);  //char kudutha r nu o/p varthu
		//		


		//file reading ovaru lettera pathu read panum//

		//		File file = new File("/home/surendar/Videos/vsv.txt");
		//		//System.out.println(file.createNewFile());
		//		FileReader fr = new FileReader(file);  //file kula surender name iruku
		//		int r = fr.read();
		//		while(r!=-1)
		//		{
		//			System.out.print((char) r);  //char kudutha u nu o/p varthu
		//			r = fr.read();
		//		}


		//file reading bufferreader mulama read panrthu overu worda read panum//

//		File file = new File("/home/surendar/Videos/vsv.txt");
//		//System.out.println(file.createNewFile());
//		FileReader fr = new FileReader(file);    //file kula surender name iruku
//		BufferedReader br = new BufferedReader(fr);
//		String st = br.readLine();
//		System.out.println(st);


		//file reading bufferreader mulama read panrthu overu worda read panum//

//		File file = new File("/home/surendar/Videos/vsv.txt");
//		//System.out.println(file.createNewFile());
//		FileReader fr = new FileReader(file);    //file kula surender name iruku
//		BufferedReader br = new BufferedReader(fr);
//		String st = br.readLine();
//		while(st!= null)
//		{
//			System.out.println(st);
//			st = br .readLine();
//		}
		
		
		// space,., word print panra program
		
		File file = new File("/home/surendar/Videos/vsv.txt");
		//System.out.println(file.createNewFile());
		int Sentencecount  = 0;
		FileReader fr = new FileReader(file);  
		int r = fr.read();
		while(r!= -1)
		{
			char c = (char) r;
			if(c==' ')
			{
				Sentencecount++;
			}
			r = fr.read();
		}
		System.out.println(Sentencecount);


	}

}

