package sample;
 
import javax.swing.*;
import java.awt.*;

/**
 * Simple Java program for Swing 
 * @author R.GOPALAKRISHNAN
 * @author gopalakrishnanr94@gmail.com
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

@SuppressWarnings("serial")
public class Sample1 extends JFrame  
{
	JFrame f;

	JLabel l1,l2,l3;
	JTextField t;
	JTextArea ta;
	JPasswordField pf;
	JButton b;
	JCheckBox ch1,ch2;
	JRadioButton rb1,rb2;
	
	JComboBox<String> cb;
	String Country[]={"USA","India","UAE","Malaysia"};
	
	JList<String> l;
	
	String name;
	
	JScrollBar s;
	Sample1()
	{
		//Joptionpane
		
		name=JOptionPane.showInputDialog("Enter name");
		JOptionPane.showMessageDialog(f,"hi.." +name);
		
		//Label
		l1=new JLabel("User name:");
		l2=new JLabel("Password:");
		l3=new JLabel("FaceBook");
				
		l1.setBounds(10,70,100,20);
		l2.setBounds(10,90,100,20);
		l3.setBackground(Color.BLUE);
		l3.setBounds(50,50,100,20);
		
		//TextField and PassWordField
		t=new JTextField();
		pf=new JPasswordField();
		
		t.setBounds(120,70, 100,20);
		pf.setBounds(120,90,100,20);
		
		//Checkbox
		ch1=new JCheckBox("Married");
		ch2=new JCheckBox("UnMarried",true);
		
		ch1.setBounds(10,120,100,20);
		ch2.setBounds(120,120,100,20);
		
		//radioBox
		rb1=new JRadioButton("Male");
		rb2=new JRadioButton("Female");
		
		rb1.setBounds(10,140,100,20);
		rb2.setBounds(120,140,100,20);
		
		//Combobox
		cb=new JComboBox<>(Country);
		cb.setBounds(10,180,100,20);
		
		//list
		DefaultListModel<String> ll=new DefaultListModel<>();
		ll.addElement("c");
		ll.addElement("c++");
		ll.addElement("java");
		ll.addElement("c#");
		ll.addElement("Python");
		l=new JList<>(ll);
		l.setBounds(150,180,100,20);
		
		//button
		b=new JButton("Login");
		
		b.setBounds(70,220,100,20);
		b.setMnemonic('L');
		
		//TextArea
		ta=new JTextArea("Comments..");
		ta.setBounds(10,240,500,500);
		
		
		//Scrollbar
		s=new JScrollBar();
		s.setBounds(1350,0,20,750);
		
		
		//adding components to the frame
		
		add(l3);
		add(l1);
		add(l2);
		
		add(t);
		
		add(pf);
		
		add(ch1);
		add(ch2);
		
		add(rb1);
		add(rb2);
		
		add(cb);
		add(l);
		
		add(b);
		
		add(ta);
		
		add(s);
		
		//frame
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		
		
	}
	

	public static void main(String[] args) 
	{
		
		new Sample1();

	}

}
