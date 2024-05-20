//Filename: Sorter.java
//Authors: Dursen Tulema, Hegni Yonis, Nolan Thompson
//Date: May 5, 2022

import java.io.*;

/** Sorter is a new class that sorts all records by names(0), IDs(1), homeforms(2), and periods(5).
* @author Dursen Tulema, Hegni Yonis, Nolan Thomson*/


class Sorter 
{
     /** Construct a new Sorter.
   	* @param list refers to the to be sorted array of the external file.
  	   * @param item refers to Name (0), Rating (2), Year Released (3), Length (4) or Cost (5) of a movie.
	   */

   public static String[][]sort(String list[][], int item) 
   { 
      String temp;
       int len = list.length - 1;
      for (int i = len; i > 1; i--)
         for (int j = 0; j < i; j++)
            if (list[j][item].compareTo(list[j+1][item]) > 0)
            {
               for (int k = 0; k < 6; k++)
                  swap(list, j, k); 
            }
       return list; 
     }
     
   static void swap(String list[][], int index, int item) 
   {
      String temp;
      temp = list[index][item];
      list[index][item] = list[index + 1][item];
      list[index + 1][item] = temp;
   }
}
