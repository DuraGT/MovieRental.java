//Filename: ReadData.java
//Authors: Dursen Tulema, Hegni Yonis, Nolan Thompson
//Date: May 5, 2022


import java.io.*;

/** ReadData is a new class that gets records from an external file "records.txt" and stores them in a one dimentional array, data. 
* @authors Dursen Tulema, Hegni Yonis, Nolan Thompson*/


class ReadData 
	{
   /** Construct a new ReadData.
     * @param fileName refrers the name of the external file, "movies.txt".
	  * @param max is the maximum number of records that can be stored in the file*/


	 public String[] readFile(String fileName, int max)
	 {
	  String data[] = new String[max];
	  for(int k = 0; k < max; k++)
	  		data[k]="";
			
	  int i=0;
     try 
	  {	  
		DataInput in = new DataInputStream(new FileInputStream(fileName));
		String txt= in.readLine( );
		while (txt != null)
	   {
       data[i++]= txt;
		 txt = in.readLine();
		}
     }	
	  catch (Exception e) {};
     return data;
	 }
}

