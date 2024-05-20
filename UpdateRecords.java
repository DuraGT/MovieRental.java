//Filename: UpdateRecords.java
//Authors: Dursen Tulema, Hegni Yonis, Nolan Thompson
//Date: May 5, 2022

import java.io.*;

/** Updaterecords is a new class that is used to read all records and write them back to external file, records.txt. 
* @author Dursen Tulema*/

class UpdateRecords
{

    /** Construct a new UpdateRecords.
     * @param records is the name of the external file
	  * @param data refers to the two dimentional array version of the records in the external file, "records.txt".
	  */  

   public static void updateFile(String records, String data[][])
   {
      try
         {
            File in = new File(records);
            FileOutputStream myout = new FileOutputStream(in);
            DataOutputStream myData = new DataOutputStream(myout);
            for(int i = 0; i < data.length; i++) 
               {            
                  String txt = "";
                  if (data[i][0].equals("")) continue; 
                  for(int j = 0; j < 6; j++)
                     txt += data[i][j]+"#";
                  myData.writeBytes(txt + "\r");
               }
               myout.close();
           } catch(Exception e) {}

      }
}