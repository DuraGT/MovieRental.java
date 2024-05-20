//Filename: Records.java
//Authors: Dursen Tulema, Hegni Yonis, Nolan Thompson
//Date: May 5, 2022

import java.util.StringTokenizer;

/** Records is a new class that separates each line of record into 6 component parts. Each item is stored separately in a two dimentional array, records. 
* @author Dursen Tulema*/

class Records 
	{
   
    /** Construct a new Record.
     * @param data refers to the two dimentional aray version of the records in the external file, "records.txt".
	  */

	public String[][] getRecords(String data[])
	{
	 int n = data.length;
	 String records[][] = new String[n][6];
	 for(int p=0; p < n; p++)
	 	for (int q = 0; q < 6; q++)
			records[p][q]="";
    for (int line = 0; line < n; line++) 
	 {
	  if (data[line].equals("")) break;
	 StringTokenizer st = new StringTokenizer(data[line], "#");
	 int i = 0;
    while (st.hasMoreTokens() && i<6)
	 {
	  records[line][i] = st.nextToken();
	  System.out.print(records[line][i]+ "\t\t");
	  i++;
    }
    System.out.println( );	 
    }
    return records;
	}
}
