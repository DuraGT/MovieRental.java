import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Frame;
import java.awt.Button;


public class rRTAALaunchPage extends Frame implements ActionListener

{
     Button btnExit;
	  public rRTAALaunchPage()
      {
         
         super("My Window"); 
         resize(1000,650);
         show();
         setBackground(Color.white);
         
         btnExit = new Button("EXIT");
         btnExit.addActionListener(this);
         setLayout(null);
         btnExit.setBounds(480, 550, 120, 30);
         btnExit.setBackground(Color.white);
         
         add(btnExit);
         setVisible(true);
         setBounds(50,30,1200,675); 
			
		}

 public void paint(Graphics g)
        { 
        
		  // Creating a background image on "My Window".
		   Toolkit tk=Toolkit.getDefaultToolkit();
         Image img1 = tk.getImage("RTAArcpt.png");
         g.drawImage(img1, 80, 50, 850, 500, this);  
       }

       
    public void actionPerformed(ActionEvent ae)
	  {
		if(ae.getActionCommand().equals("EXIT"))
		{
        System.exit(0);     
	   }
     }
}
