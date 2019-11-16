package sample;

import javax.swing.*;

/**
 * Simple Java program for Swing 
 * @author R.GOPALAKRISHNAN
 * @author gopalakrishnanr94@gmail.com
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

@SuppressWarnings("serial")
public class MenuEx extends JFrame 
{
	JFrame f;
	
	JMenuBar mb;
	
	JMenu m1,m2;
	
	JMenuItem l1,l2,l3,l4,l5,l6; 
	
	
	MenuEx()
	{
		
		mb=new JMenuBar();
		
		m1=new JMenu("File");
		
		m2=new JMenu("Edit");
		
		l1=new JMenuItem("New");
		l2=new JMenuItem("Open");
		l3=new JMenuItem("Close");
		
		l4=new JMenuItem("Cut");
		l5=new JMenuItem("Copy");
		l6=new JMenuItem("Paste");
		
		
		
		m1.add(l1);
		m1.add(l2);
		m1.add(l3);
		
		m2.add(l4);
		m2.add(l5);
		m2.add(l6);
		
		mb.add(m1);
		mb.add(m2);
		
		setJMenuBar(mb);
		
		
		setSize(1350,750);
		setLayout(null);
		setVisible(true);
		
		
		
	}

	public static void main(String[] args) 
	{
		new MenuEx();

	}

}
