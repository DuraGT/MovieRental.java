//Filename: Output.java

import java.io.*;

/** Output is a new class that  will display the Receipt. 
* @author Dursen Tulema*/

class Output 
   {
   /** Construct a new Output.*/
   
    static String fileName = "movies.txt";

      void keyln (String fileName[][])
         {
         
            int item = 0;
            DataInput d = new DataInputStream (System.in);
            String input;
            Receipt r = new Receipt();
            try
               {
                  System.out.println("Retype the movie name to confirm:");
						System.out.println(fileName[0][0]);
                  while ((input = d.readLine()) != null)
                     {
                        System.out.println("Printing...\n");
                        r.printReceipt(fileName, input);
                     }
               } catch (IOException ignore){}
         }
   }

