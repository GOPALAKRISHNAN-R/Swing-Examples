package sample;
import javax.swing.*;

/**
 * Simple Java program for Swing 
 * @author R.GOPALAKRISHNAN
 * @author gopalakrishnanr94@gmail.com
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

class ScrollBarExample  
{
	
	ScrollBarExample()
	{  
	
		JFrame f= new JFrame("Scrollbar Example");  
		JScrollBar s=new JScrollBar();  
		s.setBounds(100,100, 50,100);  
		
		f.add(s);  
		f.setSize(400,400);  
		f.setLayout(null);  
		f.setVisible(true);  
	}  
	public static void main(String args[])  
	{  
		new ScrollBarExample();  
	}
}  
