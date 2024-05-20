//Filename: Reciept
import java.io.*;

class Receipt 
   {
	
      public static void printReceipt(String fileName[][], String input)
         {
            boolean found = false;
            String movieName = "";
            String rating = "";
            String yearReleased = "";
            String length = "";
            String cost ="";
            
            for (int i = 0; i < fileName.length; i++) 
               {         
                  if (fileName[i][0].equals(input)) 
                     {
                        found= true; // Check for name
                        for (int k = 0; k < 6; k++)
                           {
                              switch(k)
                              {  
                                 case 1: movieName = fileName[i][k]; break;
                                 case 2: rating = fileName[i][k]; break;
                                 case 3: yearReleased= fileName[i][k]; break;
                                 case 4: length = fileName[i][k]; break;
                                 case 5: cost = fileName[i][k]; break;
                                 
                              }
                           }
                      }
               }

               if (!found) 
                  {
                      System.out.println("No record found!\n\n");
                  }


               else
                  {
                        System.out.println(" ________________________________________________");
                        System.out.println("|                                                |");
                        System.out.println("|            DHN MOVIE RENTAL SERVICES           |");             
                        System.out.println("|------------------------------------------------|");
                        System.out.println("|    Rented Movie: " +movieName+ "               |");
                        System.out.println("|    Amount Paid: " +cost+ "                     |");
                        System.out.println("|------------------------------------------------|");
                        System.out.println("|Date Rented: "+yearReleased+"                   |");
                        System.out.println("|------------------------------------------------|");
                        System.out.println("|Customer Name: "+length+"                       |");
                        System.out.println("|Customer Phone Number: "+rating+"               |"); 
                        System.out.println("|________________________________________________|");
                  }
         }
  }


