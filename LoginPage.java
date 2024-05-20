import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.awt.TextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.image.*;


import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class LoginPage extends JFrame implements ActionListener 
{
	
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel("userID:");
	JLabel userPasswordLabel = new JLabel("password:");
	JLabel messageLabel = new JLabel();
   JLabel imgLabel = new JLabel();
	HashMap<String,String> logininfo = new HashMap<String,String>();
   
   ImageIcon icon = new ImageIcon();
	


   
	LoginPage(HashMap<String,String> loginInfoOriginal)
   
   {
		
		logininfo = loginInfoOriginal;
      
             
      
            
		userIDLabel.setBounds(50,100,75,25);
		userPasswordLabel.setBounds(50,150,75,25);
		
		messageLabel.setBounds(125,250,250,35);
		messageLabel.setFont(new Font(null,Font.ITALIC,25));
		
		userIDField.setBounds(125,100,200,25);
		userPasswordField.setBounds(125,150,200,25);
		
		loginButton.setBounds(125,200,100,25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		resetButton.setBounds(225,200,100,25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
     

		frame.add(userIDLabel);
		frame.add(userPasswordLabel);
		frame.add(messageLabel);
      frame.add(imgLabel);
      
		frame.add(userIDField);
		frame.add(userPasswordField);
		frame.add(loginButton);
		frame.add(resetButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(600,400);
		frame.setBackground(Color.red);
      frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setVisible(true);
      

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==resetButton) {
			userIDField.setText("");
			userPasswordField.setText("");
		}
		
		if(e.getSource()==loginButton) {
			
			String userID = userIDField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			
			if(logininfo.containsKey(userID)) {
				if(logininfo.get(userID).equals(password)) {
					messageLabel.setForeground(Color.green);
					messageLabel.setText("Login successful");
					frame.dispose();
					MovieRental DHNmovierental = new MovieRental();
				}
				else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Wrong password");
               messageLabel.setText("Reset and try again.");
				}

			}
			else {
				messageLabel.setForeground(Color.red);
				messageLabel.setText("Username not found");
            messageLabel.setText("Reset and try again.");
			}
		}
	}
   
  
   	
}
