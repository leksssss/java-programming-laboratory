package jdbc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class App extends JFrame implements ActionListener{
	
	private JLabel lrollno;
	private JLabel lname;
	private JLabel lage;
	private JLabel lgender;
	private JLabel laddress;
	private JLabel lmark1;
	private JLabel lmark2;
	private JLabel lmark3;
	private JLabel lmark4;
	private JLabel lmark5;
	private JButton store;
	private JButton display;
	private JButton update;
	private JTextField tname;
	private JTextField trollno;
	private JTextField tage;
	private JTextField tgender;
	private JTextField taddress;
	private JTextField tmark1;
	private JTextField tmark2;
	private JTextField tmark3;
	private JTextField tmark4;
	private JTextField tmark5;
	private JPanel rno;
	private JPanel name;
	private JPanel age;
	private JPanel gender;
	private JPanel addr;
	private JPanel m1;
	private JPanel m2;
	private JPanel m3;
	private JPanel m4;
	private JPanel m5;
	private JPanel box;
	private JPanel x;
	private AppHelper db;
	private JLabel error = null;
	private JPanel buttonpanel;
	private JButton reset;

	
	App() {
		super("Student Details Application");
		rno = new JPanel((LayoutManager) new GridLayout());
		name = new JPanel((LayoutManager) new GridLayout());
		age = new JPanel((LayoutManager) new GridLayout());
		gender = new JPanel((LayoutManager) new GridLayout());
		addr = new JPanel((LayoutManager) new GridLayout());
		m1 = new JPanel((LayoutManager) new GridLayout());
		m2 = new JPanel((LayoutManager) new GridLayout());
		m3 = new JPanel((LayoutManager) new GridLayout());
		m4 = new JPanel((LayoutManager) new GridLayout());
		m5 = new JPanel((LayoutManager) new GridLayout());
		x = new JPanel((LayoutManager) new GridLayout(15,1));
		
		box = new JPanel();
		box.setLayout(new BoxLayout(box,BoxLayout.Y_AXIS));
		buttonpanel = new JPanel((LayoutManager) new GridLayout(1,3));
		
		lname = new JLabel("Enter your Name : ");
		tname = new JTextField();
		tname.setSize(200, 100);
		name.add(lname);
		name.add(tname);
		
		lrollno = new JLabel("Enter your Roll No : ");
		trollno = new JTextField();
		trollno.setSize(200, 100);
		rno.add(lrollno);
		rno.add(trollno);
		
		lage = new JLabel("Enter your age : ");
		tage =  new JTextField();
		tage.setSize(200, 100);
		age.add(lage);
		age.add(tage);
		
		lgender = new JLabel("Enter your Gender : ");
		tgender =  new JTextField();
		tgender.setSize(200, 100);
		gender.add(lgender);
		gender.add(tgender);
		
		laddress = new JLabel("Enter your address : ");
		taddress =  new JTextField();
		taddress.setSize(200, 100);
		addr.add(laddress);
		addr.add(taddress);
		
		
		lmark1 = new JLabel("Enter mark of 1st subject : ");
		tmark1 =  new JTextField();
		tmark1.setSize(200, 100);
		m1.add(lmark1);
		m1.add(tmark1);
		
		lmark2 = new JLabel("Enter mark of 2nd subject : ");
		tmark2 =  new JTextField();
		tmark2.setSize(200, 100);
		m2.add(lmark2);
		m2.add(tmark2);
		
		lmark3 = new JLabel("Enter mark of 3rd subject : ");
		tmark3 =  new JTextField();
		tmark3.setSize(200, 100);
		m3.add(lmark3);
		m3.add(tmark3);
		
		lmark4 = new JLabel("Enter mark of 4th subject : ");
		tmark4 = new JTextField();
		tmark4.setSize(200, 100);
		m4.add(lmark4);
		m4.add(tmark4);
		
		lmark5 = new JLabel("Enter mark of 5th subject : ");
		tmark5 =  new JTextField();
		tmark5.setSize(200, 100);
		m5.add(lmark5);
		m5.add(tmark5);
		
		store = new JButton("Save");
		display = new JButton("Display");
		update = new JButton("Update");
		reset = new JButton("Reset");
		
		this.add(rno);
		this.add(name);
		this.add(age);
		this.add(gender);
		this.add(addr);
		this.add(m1);
		this.add(m2);
		this.add(m3);
		this.add(m4);
		this.add(m5);
		this.add(box);
		buttonpanel.add(store);
		buttonpanel.add(update);
		buttonpanel.add(display);
		buttonpanel.add(reset);
		reset.setVisible(false);
		box.add(buttonpanel);
		box.add(x);
		db = new AppHelper(x);
		x.setVisible(false);
		store.addActionListener(this::actionPerformed);
		update.addActionListener(this::actionPerformed);
		display.addActionListener(this::actionPerformed);
		reset.addActionListener(this::actionPerformed);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//inserting into database
		try {
			
			if(e.getSource() == store && !trollno.getText().isEmpty() && !tname.getText().isEmpty() && !tage.getText().isEmpty() && !tgender.getText().isEmpty()
			&& !taddress.getText().isEmpty() && !tmark1.getText().isEmpty() && !tmark2.getText().isEmpty() && !tmark3.getText().isEmpty() && !tmark4.getText().isEmpty() && !tmark5.getText().isEmpty() ) {
				try {
					int m1 = Integer.parseInt(tmark1.getText());
					int m2 = Integer.parseInt(tmark2.getText());
					int m3 = Integer.parseInt(tmark3.getText());
					int m4 = Integer.parseInt(tmark4.getText());
					int m5 = Integer.parseInt(tmark5.getText());
					int age = Integer.parseInt(tage.getText());
					
					Data d = new Data(trollno.getText(),tname.getText(),age, tgender.getText(), taddress.getText(),m1,m2,m3,m4,m5);
					db.insertRow(d);
					db.calculateGPA(d);
					setEditability(false);
					reset.setVisible(true);
				}
				catch(IllegalArgumentException ex){
					System.out.println("Enter valid values");
				}
			}
			
			//displaying details from database
			else if(e.getSource() == display && !trollno.getText().isEmpty()) {
				try {		
					System.out.println("adfa");
					db.displayDetails(trollno.getText());
					x.setVisible(true);
					setEditability(false);
					reset.setVisible(true);
				}
				catch(IllegalArgumentException q) {
					System.out.println("Check your roll number");
				}
			}
			
			//updating details in database
			else if(e.getSource() == update && !trollno.getText().isEmpty() && !tmark1.getText().isEmpty() && !tmark2.getText().isEmpty() && !tmark3.getText().isEmpty() && !tmark4.getText().isEmpty() && !tmark5.getText().isEmpty()) {
				try {
					int m1 = Integer.parseInt(tmark1.getText());
					int m2 = Integer.parseInt(tmark2.getText());
					int m3 = Integer.parseInt(tmark3.getText());
					int m4 = Integer.parseInt(tmark4.getText());
					int m5 = Integer.parseInt(tmark5.getText());
					
					Data d1 = new Data(trollno.getText(),m1,m2,m3,m4,m5);
					db.updateMarks(d1);
					setEditability(false);
					reset.setVisible(true);
				}
				catch(NumberFormatException r) {
					System.out.println("Check your marks!");
				}
			}
			else if(e.getSource() == reset) {
				reseting();
				}
				
			else {
				error = new JLabel("Check your input..Enter only valid credentials!");
				error.setSize(150,150);
				x.add(error);
				x.setVisible(true);
				
			}
		}
		catch(Exception err) {
			System.out.println(err.getMessage());
		}
	}
	
	public void reseting() {
		tname.setText("");
		trollno.setText("");
		tgender.setText("");
		taddress.setText("");
		tage.setText("");
		tmark1.setText("");
		tmark2.setText("");
		tmark3.setText("");
		tmark4.setText("");
		tmark5.setText("");
		db.panel.removeAll();
		setEditability(true);
		reset.setVisible(false);
	}
	
	public void setEditability(boolean flag) {
		trollno.setEditable(flag);
		tname.setEditable(flag);
		tage.setEditable(flag);
		tgender.setEditable(flag);
		taddress.setEditable(flag);
		tmark1.setEditable(flag);
		tmark2.setEditable(flag);
		tmark3.setEditable(flag);
		tmark4.setEditable(flag);
		tmark5.setEditable(flag);
		store.setEnabled(flag);
		display.setEnabled(flag);
		update.setEnabled(flag);
	}
	
}
