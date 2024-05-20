import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("dhn","1234");
		logininfo.put("dursen","1234");
		logininfo.put("nolan","1234");
      logininfo.put("hegni","1234");
      
	}
	
	   public HashMap getLoginInfo(){
		return logininfo;
	}
}
