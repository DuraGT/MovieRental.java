//Filename: Search.java
//Authors: Dursen Tulema, Hegni Yonis, Nolan Thompson
//Date: May 5, 2022

import java.io.*;

/** Search is a new class that searches for a data given in a two-dimentional array, the item and value to be searches. 
* @authors Dursen Tulema, Hegni Yonis, Nolan Thomson*/

class Search
 {
    /** Construct a new Search.
     * @param records is the name of the external file.
	  * @param data refers to the two dimentional array version of the records in the external file, "movies.txt".
	  * @param item refers to Name (0), Rating (2), Year Released (3), Length (4) or Cost (5) of a movie.
	  * @param input refers to the typed  Name, Rating, Year Released, Length and Cost of a movie that are to be searched.
	  */
 
 	void searching (String records, String data[][], int item, String input) 
	{
	 boolean found = false;
    for (int i = 0; i < data.length; i++) 
	 {
     if (data[i][item].equals(input))
	  {
      found = true;
      for (int k = 0; k < 6; k++)
				System.out.print(data[i][k]+ "\t\t");
		System.out.println( );
     }
	 }
    if (!found)
		System.out.println("No record found!");
   }
}
