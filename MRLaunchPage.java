//Filename: MovieRental.java
//Authors: Dursen Tulema, Hegni Yonis, Nolan Thompson
//Date: May 5, 2022

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Frame;
import java.awt.Button;

/**  MovieRental is a multi-class program designed to help users rent movies. To facilitate it's service, 
     the program is equiped with graphical user interface that  displayes several windows.
     In Addition, this program can; load, list, sort and search movies in an external text file. 
     This program can also recieve infomrmation and print a reciept that confirms the rent.
     
     * @authors Dursen Tulema, Hegni Yonis, Nolan Thompson*/

public class MRLaunchPage extends JFrame implements ActionListener
     {
     
     /** Construct a new MovieRental. */
	   
      // Delaration statments.
      final int MAX = 30;
		static String fileName = "movies.txt";
		String rows [] = new String[MAX];
		String info[][] = new String[MAX][6];
		ReadData rd= new ReadData();
		Records re = new Records();
      Sorter s = new Sorter();
		SearchInput si = new SearchInput();
      SearchInput2 si2 = new SearchInput2();
      Output ou = new Output();
      NewRecord nr = new NewRecord();
		KeyInput ki = new KeyInput();
 
     // Variables for Buttons
      Button btnAction, btnComedy, btnRomance;

      String nameArray[]=new String[30];
      
     public MRLaunchPage()
      {
         
         super("My Window"); 
         resize(1200,675);
         makeMenus();
         show();
         setBackground(Color.black);
         
         btnAction = new Button("Action Movies");
         btnComedy = new Button("Comedy Movies");
         btnRomance = new Button("Romance Movies");
         
         btnAction.addActionListener(this);
	    	btnComedy.addActionListener(this);
		   btnRomance.addActionListener(this);
         
         setLayout(null);
         btnAction.setBounds(100, 500, 120, 30);
         btnComedy.setBounds(550, 500, 120, 30);
         btnRomance.setBounds(950, 500, 120, 30);
         
         btnAction.setBackground(Color.white);
         btnComedy.setBackground(Color.white);
         btnRomance.setBackground(Color.white);

         add(btnAction);
         add(btnComedy);
         add(btnRomance); 
         
         setVisible(true); 
         
         
      }
      
			
    // Graphics and Texts for the Homewindow.
  public void paint(Graphics g)
        { 
        

		  // Creating a background image on "My Window".
		   Toolkit tk=Toolkit.getDefaultToolkit();
         Image img1 = tk.getImage("DHN main background.gif");
         g.drawImage(img1, 9, 50, 1182, 616, this);
         
         // Creating a gif file above the action button.
         Image img2 = tk.getImage("actionmain.gif");
         g.drawImage(img2, 108, 350, 120, 200, this);
         
			// Creating a gif file above the comedy button.
         Image img3 = tk.getImage("comedymain.gif");
         g.drawImage(img3, 558, 350, 120, 200, this);

         // Creating a gif file above the romance button.
         Image img4 = tk.getImage("romancemain.gif");
         g.drawImage(img4, 958, 350, 120, 200, this);
         
       }
		 
    		 


	 
  // Creating menus.    
  private void makeMenus()
  {
   MenuBar mb = new MenuBar();
	
   // "Data" menu and submenus.
   Menu m1 = new Menu ("Data");
   m1.add(new MenuItem("Load"));
   m1.add(new MenuItem("List"));
   m1.add(new MenuItem("Add"));
   
		// Sub-submenus unsder the Delete submenu
   Menu m5 = new Menu ("Delete");
   m5.add(new MenuItem( "by Names"));
   m5.add(new MenuItem( "by Rating"));
   m5.add(new MenuItem( "by Year Released"));
	m5.add(new MenuItem("by Length"));
   m5.add(new MenuItem("by Cost"));
   m1.add(m5);
   

   m1.addSeparator();
   m1.add(new MenuItem ("Exit"));
	   
 

	
   // "Sort" menu and submenus.  
   Menu m2 = new Menu("Sort");
   m2.add(new MenuItem("Names"));
   m2.add(new MenuItem("Rating"));
   m2.add(new MenuItem("Year Released"));
   m2.add(new MenuItem("Length"));
   m2.add(new MenuItem("Cost"));

	
	
   // "Find" menu and submenus.  
   Menu m3 = new Menu("Search");
   m3.add(new MenuItem( "By Names"));
   m3.add(new MenuItem( "By Ratings"));
   m3.add(new MenuItem( "By Year Released"));
   m3.add(new MenuItem( "By Length"));
   m3.add(new MenuItem( "By Cost"));

   
	// "Info" menu and submenus.
   Menu m4 = new Menu("Info");
   m4.add(new MenuItem( "Help"));
   m4.add(new MenuItem( "About DHN"));
   
	// Displaying the menu's in the menubar.
   mb.add(m1);
   mb.add(m2);
   mb.add(m3);
   mb.add(m4);
   
   setMenuBar(mb);
  }

 // Printed text and action when a menu is selected.
public boolean action(Event evt, Object obj) 
   {
    if(evt.target instanceof MenuItem) 
    {
      String label = (String) obj;
    
		
	// Submenus under the "Data" menu.
		
	//Quit if "Exit" submenu is selected.
    if (label.equals("Exit"))
    {
      System.exit(0);
      
	// Display the existing records if "Load" submenu is selected.
    } else if (label.equals("Load"))
    {
      System.out.println( "Load coming up!");
		rows = rd.readFile("movies.txt", 30);
		info =re.getRecords(rows);
		
	//	Display the movies after excecuting a cretain class if "List" submenu is selected.
    } else if (label.equals("List"))
    { 
		for (int i = 0; i < 30; i++)
		{
			for(int j = 0; j < 6; j++)
			{
				System.out.print(info[i][j]+"\t\t");
			}
			System.out.println();
		}
	 
		
	// Add a new record to the external (movies.txt) file if "Add" is selected.
   } else if (label.equals("Add"))
    {                                                                                                                       
      System.out.println("Add coming up !");
		nr.addRecord("movies.txt",ki.entries());
      
		
  // Sub-submenus under the "Delete" Submenu.
  
  // Search and delete record by names if "by Names" submenu is selected.
    } else if (label.equals ("by Names"))
    {
      System.out.println("Deleting by Names coming up !");
      System.out.println("Type the Movie name you want to delete:");
		
      si2.keyInput("records.txt",info,0);
		
		
		// Search and delete a record by homeforms if "by Homeforms" submenu is selected.
    } else if (label.equals ("by Rating "))
    {
      System.out.println("Deleting by Rating coming up !");
      System.out.println("Type the Rating of the movie you want to delete:");
      si2.keyInput("records.txt",info,2);

		
	// Search and delete a record by ID's if "By Id's" submenu is selected.
    } else if (label.equals ("by Year Released"))
    {
      System.out.println("Deleting by Year Released coming up !");
      System.out.println("Type the Year the movie you want to delete was released:");
      si2.keyInput("records.txt",info,3);
		
	// Search and delete a record by homeforms if "by Homeforms" submenu is selected.
    } else if (label.equals ("by Length"))
    {
      System.out.println("Deleting by Length coming up !");
      System.out.println("Type the Length of the movie you want to delete:");
      si2.keyInput("records.txt",info,4);
            
	// Search the delete a record by periods if "by Periods" submenu is selected.
    } else if (label.equals ("by Cost"))
    {
      System.out.println("Deleting by Cost coming up !");
      System.out.println("Type the cost of the movie you want to delete:");

      si2.keyInput("records.txt",info,5);
		
	// Submenus under the "Sort" menu.
   
	//	Sort the data by name if "Names" submenu is selected.
    } else if (label.equals ("Names"))
    {
      System.out.println("Sorting by Names...");
      info = s.sort(info, 0);
		
	//Sort the data by rates if "Rates" submenu is selected.
    } else if (label.equals ("Rating"))
    {
      System.out.println("Sorting by Rating...");
		info = s.sort(info, 2);
		
	//Sort the data by year released of  "Year Released" submenu is selected.
    } else if (label.equals ("Year Released"))
    {
      System.out.println("Sorting by Year Released...");
		info = s.sort(info, 3);
		
	//Sort the data by length if "Length" submenu is selected.
    } else if (label.equals ("Length"))
    {
      System.out.println("Sorting by Length...");
		 info = s.sort(info, 4);
		 
   //Sort the data by cost if "Cost" submenu is selected.
	 } else if (label.equals ("Cost"))
    {
      System.out.println("Sorting by Cost...");
		 info = s.sort(info, 5);

		 
	// Submenus under the "Search" menu.
   
	// Search the record by names if "By Names" submenu is selected.
    } else if (label.equals ("By Names"))
    {
      System.out.println("   ");
      System.out.println("Searching by Names...");
      System.out.println("   ");
      System.out.println("Write the Name of the movie to be searched (Abc...):");
		si.keyInput("movies.txt",info,0);
		
	// Search the record By Year Release if "By Year Released" submenu is selected.
    } else if (label.equals ("By Year Released"))
    {
      System.out.println("   ");
      System.out.println("Searching by Year Released...");
      System.out.println("   ");
      System.out.println("Write the Release Year of the movie to be searched (####):");
      si.keyInput("movies.txt",info,3);
		
	// Search the record By Length if "By Length" submenu is selected.
    } else if (label.equals ("By Length"))
    {
      System.out.println("   ");
      System.out.println("Searching by Length...");
      System.out.println("   ");
      System.out.println("Write the Length of the movie to be searched (#:##):");
		si.keyInput("movies.txt",info,4);

		
	// Search the record By Rates if "By Rates" submenu is selected.
    } else if (label.equals ("By Ratings"))
    {
      System.out.println("   ");
      System.out.println("Searching by Ratings...");
      System.out.println("   ");
      System.out.println("Write the Rating of the movie to be searched (##%):");
      si.keyInput("movies.txt",info,2);
		
   // Search the record By Cost if "By Cost" submenu is selected.
	 } else if (label.equals ("By Cost"))
    {
      System.out.println("   ");
      System.out.println("Searching by Cost...");
      System.out.println("   ");
		System.out.println("Write the Cost of the movie to be searched (##.##$):");
      si.keyInput("movies.txt",info,5);

		
	// Submenus under the "Info" menu.
   
   // Print the following instructions if "Help" submenu is selected.
    } else if (label.equals ("Help"))
    {
      System.out.println("Help coming up !");
      System.out.println("   ");
      System.out.println("\n(1) Select Load from Data menu first.");
      System.out.println("(2) Select any menu item.");
      System.out.println("(3) Select List from Data to view results.\n.");
		
   // Print the following text if "About LTS" submenu is selected.
	 } else if (label.equals ("About DHN"))
    {
      System.out.println("About DHN coming up!");
      System.out.println("DHN is a multi-class program designed to help users rent movies. To facilitate it's service, the program is equiped with graphical user interface with several windows.");
      System.out.println("In Addition, this program can; load, list, sort and search movies in an external text file. This program can also recieve infomrmation and print a reciept that confirms the rent"); 
    }
    }
    
    return true;
  }
  
  // Printed Text and action when a Button is clicked
  
  public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("Action Movies"))
		{
		System.out.println("Action Movies Comming Up");
      ALaunchPage launchCatagory1 = new ALaunchPage();
		setVisible(false);
	   }
      
      if(ae.getActionCommand().equals("Comedy Movies"))
	   {
		System.out.println("Commedy Movies Comming Up");
      ComedyLaunchPage launchCatagory2 = new ComedyLaunchPage();
		setVisible(false); 
	   }
      
      if(ae.getActionCommand().equals("Romance Movies"))
		{
		System.out.println("Romance Movies Comming Up");
      RomanceLaunchPage launchCatagory2 = new RomanceLaunchPage();
		setVisible(false);
      }
     
      
   }
      
	

         
  public static void main(String args[])  {
		       	
  MRLaunchPage DHN = new MRLaunchPage();
  }
  
}

