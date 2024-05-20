import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Frame;
import java.awt.Button;

/** ComedyLaunchPage is a new class that displayes a new window with a collection of movies. 
* @authors Dursen Tulema, Hegni Yonis, Nolan Thomson*/


public class ComedyLaunchPage extends Frame implements ActionListener
{

/** Construct a new ComedyLaunchPage. */


	Button btnCID, btnCMB, btnCZL, btnCPBMC, btnCPX, btnCTKSI;
	String nameArray[]=new String[10];
   
	// Delaration statments.
      final int MAX = 30;
		static String fileName = "movies.txt";
		String rows [] = new String[MAX];
		String info[][] = new String[MAX][6];

	
	  public ComedyLaunchPage()
      {
         
         super("Comedy Movies Window"); 
         resize(1200,650);
         setBackground(Color.white);
         setLayout(null);
         makeMenus();
         setBackground(Color.black);
         show();
         
			
			btnCID = new Button("Idiocracy");
         btnCMB = new Button("Mr Bean");
         btnCZL = new Button("Zombieland");
         btnCPBMC = new Button("Paul Bart Mall Cop");
         btnCPX = new Button("Pixels");
         btnCTKSI = new Button("The King of Staten Island");
			
			btnCID.addActionListener(this);
         btnCMB.addActionListener(this);
         btnCZL.addActionListener(this);
         btnCPBMC.addActionListener(this);
         btnCPX.addActionListener(this);
         btnCTKSI.addActionListener(this);
         
         
        	btnCID.setBounds(240, 355, 120, 30);
         btnCMB.setBounds(540, 355, 120, 30);
         btnCZL.setBounds(840, 355, 120, 30);
         btnCPBMC.setBounds(240, 555, 120, 30);
         btnCPX.setBounds(540, 555, 120, 30);
         btnCTKSI.setBounds(840, 555, 120, 30);
         
        	btnCID.setBackground(Color.white);
         btnCMB.setBackground(Color.white);
         btnCZL.setBackground(Color.white);
         btnCPBMC.setBackground(Color.white);
         btnCPX.setBackground(Color.white);
         btnCTKSI.setBackground(Color.white);


         add(btnCID);
         add(btnCMB);
         add(btnCZL);
			add(btnCPBMC);
         add(btnCPX);
         add(btnCTKSI); 
         
         setVisible(true);
			setBounds(50,30,1200,675);
  	
		}
      
      
      /*** @param g refers to the painting tool used to add background and text to the frame.
	    */

  public void paint(Graphics g)
        { 
		  // Creating a background image on "My Window".
		   Toolkit tk=Toolkit.getDefaultToolkit();
         Image img1 = tk.getImage("DHNComedywindow.png");
         g.drawImage(img1, 0, 30, 1200, 675, this);
         
         // Creating an image above the Avengers movie button.
         Image img2 = tk.getImage("idcomedy.jpg");
         g.drawImage(img2, 240, 195, 120, 160, this);
         
         // Creating an image above the Suicide Squad movie button.
         Image img3 = tk.getImage("mbcomedy.jpg");
         g.drawImage(img3, 540, 195, 120, 160, this);
         
         // Creating an image above the Black Panther movie button.
         Image img4 = tk.getImage("zlcomedy.jpg");
         g.drawImage(img4, 840, 195, 120, 160, this);
         
          // Creating an image above the Wonder Woman movie button.
         Image img5 = tk.getImage("pbmccomedy.jpg");
         g.drawImage(img5, 240, 395, 120, 160, this);
         
         // Creating an image above the Ready Player One movie button.
         Image img6 = tk.getImage("pxcomedy.jpg");
         g.drawImage(img6, 540, 395, 120, 160, this);
         
         // Creating an image above the Spiderman movie button.
         Image img7 = tk.getImage("tksicomedy.jpg");
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
		if(ae.getActionCommand().equals("Idiocracy"))
		{
		System.out.println("Idiocracy Coming Up");
		CIDLaunchPage launchIdiocracy = new CIDLaunchPage();
      setVisible(false);         
	   }
      
      if(ae.getActionCommand().equals("Mr Bean"))
	   {
		System.out.println("Deadpool Comming Up");
		CMBLaunchPage launchMrbean = new CMBLaunchPage();
      setVisible(false); 
	   }
      
      if(ae.getActionCommand().equals("Zombieland"))
		{
		System.out.println("Zombieland Coming Up");
		CZLLaunchPage launchZombieland = new CZLLaunchPage();
      setVisible(false);
      }
		
     	if(ae.getActionCommand().equals("Paul Bart Mall Cop"))
		{
		System.out.println("Paul Bart Mall Cop Coming Up");
      CPBMCLaunchPage launchMallCop = new CPBMCLaunchPage();
      setVisible(false);
	   }
      
      if(ae.getActionCommand().equals("Pixels"))
	   {
		System.out.println("Pixels Coming Up");
      CPXLaunchPage launchPixels = new CPXLaunchPage();
      setVisible(false);
	   }
      
      if(ae.getActionCommand().equals("The King of Staten Island"))
		{
		System.out.println("The King of Staten Island Coming Up");
      CTKSILaunchPage launchKing = new CTKSILaunchPage();
      setVisible(false);
      }
     

      
   }
}
