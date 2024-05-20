import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Frame;
import java.awt.Button;

/** CPXLaunchPage is a new class that displayes a new window for a specific movie. 
  * @authors Dursen Tulema, Hegni Yonis, Nolan Thomson*/


public class CPXLaunchPage extends Frame implements ActionListener
{

  /** Construct a new CPXLaunchPage. */
      
      final int MAX = 30;
      Output ou = new Output();
      String info[][] = new String[MAX][6];
      


      Button btnRent;
      public CPXLaunchPage()
      
      {
         
         super("Pixels"); 
         resize(1200,675);
         show();
			makeMenus();
         setBackground(Color.white);
         btnRent = new Button("RENT");
         
         btnRent.addActionListener(this);
         setLayout(null);
         btnRent.setBounds(540, 600, 120, 30);
         btnRent.setBackground(Color.white);
         
         add(btnRent);
         
         setVisible(true);
			setBounds(50,30,1200,675); 
			
		}
      
      /*** @param g refers to the painting tool used to add background and text to the frame.
	    */

  public void paint(Graphics g)
        { 
        
		  // Creating a background image on "My Window".
		   Toolkit tk=Toolkit.getDefaultToolkit();
         Image img1 = tk.getImage("CPXwindow.png");
         g.drawImage(img1, 0, 50, 1200, 675, this);   
       }
       
       private void makeMenus()
     {
       MenuBar mb = new MenuBar();
       Menu m1 = new Menu ("Exit");
       Menu m5 = new Menu ("Are you sure?");
       m5.add(new MenuItem( "Yes"));
       m5.add(new MenuItem( "No"));
       m1.add(m5);
		 
		 Menu m2 = new Menu ("Back");
		 m2.add(new MenuItem( "Go to Main Window"));
		 m2.add(new MenuItem( "Go to Comedy Window"));
		 

       mb.add(m1);
		 mb.add(m2);
       setMenuBar(mb);
  }
  
    /** 
   	* @param evt refers to the action performed by a user.
  	   * @param obj refers to the item the user performed action on.
	   */

  
   public boolean action(Event evt, Object obj) 
     {
      if(evt.target instanceof MenuItem) 
        {
          String label = (String) obj;
		
       if (label.equals("Yes"))
      {
      System.exit(0);
      } else if (label.equals("No"))
      {
      } else if (label.equals("Go to Main Window"))    
      {
		 MRLaunchPage DHN3 = new MRLaunchPage();
		 setVisible(false);
		} else if (label.equals("Go to Comedy Window"))
		{  CLaunchPage DHNAction = new CLaunchPage();
	   	setVisible(false);
		}
		
	}
      return true;

    }


    /** 
   	* @param ae refers to the action performed by a user.
      */

   public void actionPerformed(ActionEvent ae)
	  {
		if(ae.getActionCommand().equals("RENT"))
		{
		System.out.println("You Are Renting 'Pixels' Movie...");
      	System.out.println("... Printing Reciept ...");
      System.out.println("   ");
                        System.out.println(" ________________________________________________");
                        System.out.println("|                                                |");
                        System.out.println("|            DHN MOVIE RENTAL SERVICES           |");             
                        System.out.println("|------------------------------------------------|");
                        System.out.println("|    Rented Movie: Pixels                        |");
                        System.out.println("|    Amount Paid: $14.99                         |");
                        System.out.println("|------------------------------------------------|");
                        System.out.println("|    Release Year: 2015                          |");
                        System.out.println("|------------------------------------------------|");
                        System.out.println("|    Movie Lenght: 1:46                          |");
                        System.out.println("|    Movie Rating: 18%                           |"); 
                        System.out.println("|________________________________________________|");
                        
      System.out.println("   ");
      System.out.println("You have Successfully rented 'Pixels' Movie.");
      System.out.println("   ");
      System.out.println("Please make sure to return the movie within 30 days or we will pursue legal charges.");




		

	     
	   }
     }

 
}