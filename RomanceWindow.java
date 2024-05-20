import java.awt.*;
import javax.swing.*;
public class RomanceWindow {

 JFrame frame = new JFrame();
 JLabel label = new JLabel("Romance Movie Catagory");
 
 RomanceWindow(){
  
  label.setBounds(30,0,100,50);
  label.setFont(new Font(null,Font.PLAIN,25));
  
  frame.add(label);
  
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(800,450);
  frame.setLayout(null);
  frame.setVisible(true);
 }
}