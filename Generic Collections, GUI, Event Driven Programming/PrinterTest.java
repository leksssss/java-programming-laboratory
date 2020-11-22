package p1;

import javax.swing.*;
import java.awt.*;

public class PrinterTest extends JFrame {
	String s1[] = { "High","Medium","Low" }; 
	  

	PrinterTest(){
		
		super("Printer");
		setLayout(new FlowLayout());
		setBackground(Color.GRAY);
		JPanel p = new JPanel();p.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(0,1,0,5));
		JLabel l = new JLabel("Printer:MyPrinter");
		JPanel p9 = new JPanel();
		p9.setLayout(new FlowLayout(FlowLayout.LEFT));
		p9.add(l);
		
		JPanel p7 = new JPanel();
		p7.setLayout(new BoxLayout(p7,BoxLayout.Y_AXIS));
		
		JPanel p2 = new JPanel();
		c.weightx = 0.5;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;c.ipady = 60;c.ipadx = 60;
		c.gridy = 0;
		p.add(p2,c);
		
		JPanel p3 = new JPanel();
		p3.setLayout((LayoutManager) new BoxLayout(p3,BoxLayout.Y_AXIS));
		JCheckBox checkBox1 = new JCheckBox("Image");  
        JCheckBox checkBox2 = new JCheckBox("Text");
        JCheckBox checkBox3 = new JCheckBox("Code");
        p3.add(checkBox1);p3.add(checkBox2);p3.add(checkBox3);
        p.add(p3);
		
		JPanel p4 = new JPanel();
		c.weightx = 0.5;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;c.ipady = 60;c.ipadx = 45;
		c.gridy = 0;
		p.add(p4,c);
		
		JPanel p5 = new JPanel();
		p5.setLayout((LayoutManager) new BoxLayout(p5,BoxLayout.Y_AXIS));
		JRadioButton r1=new JRadioButton("Selection");
        JRadioButton r2=new JRadioButton("All");
        JRadioButton r3=new JRadioButton("Applet");
        p5.add(r1);p5.add(r2);p5.add(r3);
        p.add(p5);
        
		JPanel p6 = new JPanel();
		c.weightx = 0.5;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;c.ipady = 60;c.ipadx = 60;
		c.gridy = 0;
		p.add(p6,c);
		
		p2.setBackground(Color.WHITE);
		p4.setBackground(Color.WHITE);
		p6.setBackground(Color.WHITE);
	
        JButton jb1 = new JButton("OK");jb1.setSize(new Dimension(250, 100));
        JButton jb2 = new JButton("Cancel");
        JButton jb3 = new JButton("Setup...");
        JButton jb4 = new JButton("Help");
        p1.add(jb1);p1.add(jb2);p1.add(jb3);p1.add(jb4);
        
        JPanel p8 = new JPanel();
        JLabel l1 = new JLabel("Print Quality :  	");
        JCheckBox c4 = new JCheckBox("Print To File");
        p8.add(l1);
        JComboBox c1 = new JComboBox(s1); 
        p8.add(c1);
        p8.add(c4);
       
        p7.add(p9);
		p7.add(p);
		p7.add(p8);
        add(p7);
        add(p1);
	}
}
