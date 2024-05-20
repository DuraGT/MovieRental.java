//Filename: SearchInput2.java
//Authors: Dursen Tulema, Hegni Yonis, Nolan Thompson
//Date: May 5, 2022


import java.io.*;

/** SearchInput is a new class that gets the keyboard input of the value to be searched and deleted. 
It calls the searching method from the Search2.class. 
* @author Dursen Tulema, Hegni Yonis, Nolan Thomson*/

class SearchInput2 
   {
   
    /** Construct a new SearchInput2.
     * @param records is the name of the external file.
	  * @param data refers to the two dimentional array version of the records in the external file, "movies.txt".
	  * @param item refers to Name (0), Rating (2), Year Released (3), Length (4) or Cost (5) of a movie.
	  * @param input refers to the typed  Name, Rating, Year Released, Length and Cost of a movie that are to be searched.
	  */

   
	
   	void keyInput (String records, String data[][], int item)
         {
		   	DataInput d= new DataInputStream (System.in);
		   	String input;
		   	Search2 s = new Search2();
		   	try
               {
				      while ((input = d.readLine( )) != null) 
                     {
				            System.out.println("Searching...\n");
				            s.searching(records, data, item, input);}
			      }catch (IOException ignored) {}
	      } 
   }
