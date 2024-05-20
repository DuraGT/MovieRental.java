//Filename: KeyInput.java
//Authors: Dursen Tulema, Hegni Yonis, Nolan Thompson
//Date: May 5, 2022

import java.io.*;

/** KeyInput is a new class that requires user to enter relevant infotmation and returns string suitable insertion into an existing external file. 
* @author Dursen Tulema, Hegni Yonis, Nolan Thompson*/

class KeyInput 
   {
   
   /** Construct a new KeyInput.*/

 
      static String txt, input;
      static String items[] = new String[6];
      public static String entries(){
             DataInput keyboard = new DataInputStream(System.in);
      try
          {
             System.out.println("Enter Movie Name:");
             input= keyboard.readLine( );
             txt= input; 
             items[0] = input;
             int index = 1;
             while( (input != null) && index < 6)
              {
                switch (index) 
                {
                   case 1: System.out.println("Enter rating (##%):");
                            break;
                   case 2: System.out.println("Enter year released(####):");
                            break;
                   case 3: System.out.println("Enter length(##:##):");
                            break;
                   case 4: System.out.println("Enter Cost (##.##$):");
                            break;
                   case 5: System.out.println("Press Enter to confirm the information");

                 }
        input = keyboard.readLine();
        txt += "#" + input;
        items[index] = input;
        index++;
      }
      System.out.println("\nNew record complete.");
      System.out.println(txt);
      
   } catch(Exception e) {}
   return txt;
 }
}