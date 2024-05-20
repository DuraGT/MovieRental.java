//Filename: NewRecords.java
//Authors: Dursen Tulema, Hegni Yonis, Nolan Thompson
//Date: May 5, 2022


import java.io.*;

/** NewRecords is a new class that  will read data from "records.txt" and write it back to the file with the new record. 
* @author Dursen Tulema, Hegni Yonis, Nolan Thompson*/


class NewRecord    {

	 /** Construct a new NewRecord.
     * @param movies is the name of the external file
	  * @param newRec is the information of the new record to be added.*/

	
	      public static void addRecord(String movies, String newRec)
         {
            String txt [] = new String [50];
            int count= 0;
            try
            {
               DataInput f1 = new DataInputStream(new
                              FileInputStream(movies));
               txt[count] = f1.readLine();
               while(txt[count] != null) 
               {     
                  ++count;
                  txt[count] = f1.readLine();
               }
               DataOutput f2 = new DataOutputStream(new
                               FileOutputStream(movies));
               for (int i = 0; i< count; i++)
                     f2.writeBytes(txt[i] + "\r\n"); 
                f2.writeBytes(newRec); 
                
             } catch (Exception e) {}
             
        }
  }

