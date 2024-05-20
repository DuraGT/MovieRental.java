import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Frame;
import java.awt.Button;

/** RomanceLaunchPage is a new class that displayes a new window with a collection of movies. 
* @authors Dursen Tulema, Hegni Yonis, Nolan Thomson*/


public class RLaunchPage extends Frame implements ActionListener
{

/** Construct a new RomanceLaunchPage. */

	Button btnRAWC, btnRDOS, btnRATU, btnRAAR, btnRTAA, btnRTAI;
	String nameArray[]=new String[10];
   
	// Delaration statments.
      final int MAX = 30;
		static String fileName = "movies.txt";
		String rows [] = new String[MAX];
		String info[][] = new String[MAX][6];

	
	  public RLaunchPage()
      {
         
         super("Romance Movies Window"); 
         resize(1000,650);
         makeMenus();
         setBackground(Color.white);
         setLayout(null);
         show();
         
			
			btnRAWC = new Button("After We Collided");
         btnRDOS = new Button("500 Days of Summer");
         btnRATU = new Button("Across the Universe");
         btnRAAR = new Button("Titanic");
         btnRTAA = new Button("The Age of Adeline");
         btnRTAI = new Button("The Age of Innocence");
			
			btnRAWC.addActionListener(this);
         btnRDOS.addActionListener(this);
         btnRATU.addActionListener(this);
         btnRAAR.addActionListener(this);
         btnRTAA.addActionListener(this);
         btnRTAI.addActionListener(this);
         
         
         btnRAWC.setBounds(240, 355, 120, 30);
         btnRDOS.setBounds(540, 355, 120, 30);
         btnRATU.setBounds(840, 355, 120, 30);
         btnRAAR.setBounds(240, 555, 120, 30);
         btnRTAA.setBounds(540, 555, 120, 30);
         btnRTAI.setBounds(840, 555, 120, 30);
         
         btnRAWC.setBackground(Color.white);
         btnRDOS.setBackground(Color.white);
         btnRATU.setBackground(Color.white);
         btnRAAR.setBackground(Color.white);
         btnRTAA.setBackground(Color.white);
         btnRTAI.setBackground(Color.white);


         add(btnRAWC);
         add(btnRDOS);
         add(btnRATU);
			add(btnRAAR);
         add(btnRTAA);
         add(btnRTAI); 
         
         setVisible(true);
			setBounds(50,30,1200,675);

  	
		}
      
      /*** @param g refers to the painting tool used to add background and text to the frame.
	    */
       
  public void paint(Graphics g)
        { 
		  // Creating a background image on "My Window".
		   Toolkit tk=Toolkit.getDefaultToolkit();
         Image img1 = tk.getImage("DHNRomancewindow.png");
         g.drawImage(img1, 0, 10, 1200, 675, this);
         
         // Creating an image above the After we Collided movie button.
         Image img2 = tk.getImage("awcromance.jpg");
         g.drawImage(img2, 240, 195, 120, 160, this);
         
         // Creating an image above the Days of summer movie button.
         Image img3 = tk.getImage("dosromance.jpg");
         g.drawImage(img3, 540, 195, 120, 160, this);
         
         // Creating an image above the Across the universe movie button.
         Image img4 = tk.getImage("aturomance.jpg");
         g.drawImage(img4, 840, 195, 120, 160, this);
         
          // Creating an image above the Titanic movie button.
         Image img5 = tk.getImage("ttcromance.png");
         g.drawImage(img5, 240, 395, 120, 160, this);
         
         // Creating an image above the Age of adeline movie button.
         Image img6 = tk.getImage("taaromance.jpg");
         g.drawImage(img6, 540, 395, 120, 160, this);
         
         // Creating an image above the Age of innocnece movie button.
         Image img7 = tk.getImage("tairomance.jpg");
         g.drawImage(img7, 840, 395, 120, 160, this);
        
        }
        
        
        
        // Creating an Exit and Back menus.    
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
		 


       mb.add(m2);
		 mb.add(m1);
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
		 MRLaunchPage DHN2 = new MRLaunchPage();
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
		if(ae.getActionCommand().equals("After We Collided"))
		{
		System.out.println("After We Collided Coming Up");
      RAWCLaunchPage launchAfterWeCollided = new RAWCLaunchPage();
      setVisible(false);      
	   }
      
      if(ae.getActionCommand().equals("500 Days of Summer"))
	   {
		System.out.println("(500) Days of Summer Comming Up");
		RDOSLaunchPage launchDaysofSummer = new RDOSLaunchPage();
		setVisible(false);       
	   }
      
      if(ae.getActionCommand().equals("Across the Universe"))
		{
		System.out.println("Across the Universe Coming Up");
		RATULaunchPage launchAcrosstheUniverse = new RATULaunchPage();
		setVisible(false);
      }
		
     	if(ae.getActionCommand().equals("Titanic"))
		{
		System.out.println("Titanic Coming Up");
		RTTCLaunchPage launchTitanic = new RTTCLaunchPage();
      setVisible(false);      
	   }
      
      if(ae.getActionCommand().equals("The Age of Adeline"))
	   {
		System.out.println("The Age of Adeline Coming Up");
      RTAALaunchPage launchTheAgeofAdeline = new RTAALaunchPage();
      setVisible(false);
	   }
      
      if(ae.getActionCommand().equals("The Age of Innocence"))
		{
		System.out.println("The Age of Innocence Coming Up");
      RTAILaunchPage launchTheAgeofInnocence = new RTAILaunchPage();
      setVisible(false);
      }
     

      
   }
}
