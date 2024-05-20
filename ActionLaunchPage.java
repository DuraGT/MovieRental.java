import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Frame;
import java.awt.Button;

/** ActionLaunchPage is a new class that displayes a new window with a collection of movies. 
* @authors Dursen Tulema, Hegni Yonis, Nolan Thomson*/

public class ActionLaunchPage extends Frame implements ActionListener
{

/** Construct a new ActionLaunchPage. */


	Button btnAAIW, btnATSS, btnABP, btnAWW, btnARPO, btnASMHC;
	String nameArray[]=new String[10];
   
   // Delaration statments.
      final int MAX = 30;
		static String fileName = "movies.txt";
		String rows [] = new String[MAX];
		String info[][] = new String[MAX][6];
	
	  public ActionLaunchPage()
      {
         
         super("Action Movies Window"); 
         resize(1000,650);
         setBackground(Color.white);
         setLayout(null);
         makeMenus();
         setBackground(Color.black);
         show();
         
			
			btnAAIW = new Button("Avengers: Infinity War");
         btnATSS = new Button("The Suicide Squad");
         btnABP = new Button("Black Panther");
         btnAWW = new Button("Wonder Woman");
         btnARPO = new Button("Ready Player One");
         btnASMHC = new Button("Spider-Man: Homecoming");
			
			btnAAIW.addActionListener(this);
         btnATSS.addActionListener(this);
         btnABP.addActionListener(this);
         btnAWW.addActionListener(this);
         btnARPO.addActionListener(this);
         btnASMHC.addActionListener(this);
         
         
         btnAAIW.setBounds(240, 355, 120, 30);
         btnATSS.setBounds(540, 355, 120, 30);
         btnABP.setBounds(840, 355, 120, 30);
         btnAWW.setBounds(240, 555, 120, 30);
         btnARPO.setBounds(540, 555, 120, 30);
         btnASMHC.setBounds(830, 555, 150, 30);
         
         btnAAIW.setBackground(Color.white);
         btnATSS.setBackground(Color.white);
         btnABP.setBackground(Color.white);
         btnAWW.setBackground(Color.white);
         btnARPO.setBackground(Color.white);
         btnASMHC.setBackground(Color.white);


         add(btnAAIW);
         add(btnATSS);
         add(btnABP);
			add(btnAWW);
         add(btnARPO);
         add(btnASMHC); 
			
			setVisible(true);
			setBounds(50,30,1200,675);
  	
		}
    
      
   /*** @param g refers to the painting tool used to add background and text to the frame.
	 */


  public void paint(Graphics g)
        { 
		  // Creating a background image on "My Window".
		   Toolkit tk=Toolkit.getDefaultToolkit();
         Image img1 = tk.getImage("DHNActionwindow.png");
         g.drawImage(img1, 0, 30, 1200, 675, this);
         
         // Creating an image above the Avengers movie button.
         Image img2 = tk.getImage("aiwaction.jpg");
         g.drawImage(img2, 240, 195, 120, 160, this);
         
         // Creating an image above the Suicide Squad movie button.
         Image img3 = tk.getImage("ssaction.png");
         g.drawImage(img3, 540, 195, 120, 160, this);
         
         // Creating an image above the Black Panther movie button.
         Image img4 = tk.getImage("bpaction.jpg");
         g.drawImage(img4, 840, 195, 120, 160, this);
         
          // Creating an image above the Wonder Woman movie button.
         Image img5 = tk.getImage("wwaction.jpg");
         g.drawImage(img5, 240, 395, 120, 160, this);
         
         // Creating an image above the Ready Player One movie button.
         Image img6 = tk.getImage("rpoaction.jpg");
         g.drawImage(img6, 540, 395, 120, 160, this);
         
         // Creating an image above the Spiderman movie button.
         Image img7 = tk.getImage("smhcaction.jpg");
         g.drawImage(img7, 840, 395, 120, 160, this);
         
        
        }
        
     // Creating an Exit and Back menus.    
     private void makeMenus()
     {
       MenuBar mb = new MenuBar();
       
       Menu m2 = new Menu ("Back");
		 m2.add(new MenuItem( "Go to Main Window"));

       Menu m1 = new Menu ("Exit");
       Menu m5 = new Menu ("Are you sure?");
       m5.add(new MenuItem( "Yes"));
       m5.add(new MenuItem( "No"));
       m1.add(m5);
		 
		 


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
		if(ae.getActionCommand().equals("Avengers: Infinity War"))
		{
		System.out.println("Avengers: Infinity War Coming Up");
      AAIWLaunchPage launchAvengersInfinityWar = new AAIWLaunchPage();
		setVisible(false);   
	   }
      
      if(ae.getActionCommand().equals("The Suicide Squad"))
	   {
		System.out.println("The Suicide Squad Comming Up");
		ATSSLaunchPage launchTheSuicideSquad = new ATSSLaunchPage();
		setVisible(false);
	   }
      
      if(ae.getActionCommand().equals("Black Panther"))
		{
		System.out.println("Black Panther Coming Up");
		ABPLaunchPage launchBlackPanther = new ABPLaunchPage();
		setVisible(false);
      }
		
     	if(ae.getActionCommand().equals("Wonder Woman"))
		{
		System.out.println("Wonder Woman Coming Up");
      AWWLaunchPage launchWonderWoman = new AWWLaunchPage();
		setVisible(false);    
	   }
      
      if(ae.getActionCommand().equals("Ready Player One"))
	   {
		System.out.println("Ready Player One Coming Up");
      ARPOLaunchPage launchReadyPlayerOne = new ARPOLaunchPage();
      setVisible(false);
	   }
      
      if(ae.getActionCommand().equals("Spider-Man: Homecoming"))
		{
		System.out.println("Spider-Man: Homecoming Coming Up");
      ASMHCLaunchPage launchSpiderMan = new ASMHCLaunchPage();
		setVisible(false);
      }
     

      
   }
}
