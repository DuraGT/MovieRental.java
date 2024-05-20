//Filename: SearchInput.java
//Authors: Dursen Tulema, Hegni Yonis, Nolan Thompson
//Date: May 5, 2022

import java.io.*;

/** SearchInput is a new class that gets the keyboard input for the item to be searched.
* @author Dursen Tulema, Hegni Yonis, Nolan Thomson*/

class SearchInput
{
    /** Construct a new SearchInput.
     * @param records is the name of the external file.
	  * @param data refers to the two dimentional array version of the records in the external file, "movies.txt".
	  * @param item refers to Name (0), Rating (2), Year Released (3), Length (4) or Cost (5) of a movie.
	  * @param input refers to the typed  Name, Rating, Year Released, Length and Cost of a movie that are to be searched.
	  */

 public void keyInput (String records, String data[][], int item)
 {
  DataInput d = new DataInputStream(System.in) ;
  String input;
  Search s = new Search();
  System.out.println("\nEnter: ");
  try
  {
    input = d.readLine();
    if (input!=null)
	 {
	  System. out.println ("Searching... \n") ;
     s.searching ("records.txt",data,item,input);
    }
  }catch (IOException ignored){}
 }
}
  
  
 
