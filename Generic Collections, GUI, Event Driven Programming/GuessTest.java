package p1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class GuessTest extends JFrame {
	
	    private int guesses = 1;
	    private int previousGuess = 0;
	    private int number;
	    private JTextField guessInput;
	    private JLabel pr1;
	    private JLabel msg;
	    private JLabel msg2;
	    private JLabel rdm = new JLabel("");
	    private JButton newgame;
	    JPanel pan = new JPanel();
	    JPanel pan1 = new JPanel();
	    private Color bg;
	    String s = "<html>I have a number between 1 and 1000.Can you guess my number?<br>Please enter your guesses : <br></html>";
	    String s1 = "<html>I have a number between 1 and 1000.Can you guess my number?<br>Please Enter Your Guesses : <br></html>";
	    String s2 = "<html><br><p></p></html>";
	    
	    public GuessTest() {
	    	
	        super("Guessing the Number Game");
	        changeBackground("cyan");
	        setLayout(new FlowLayout());
	        pan1.setLayout((LayoutManager) new BoxLayout(pan1,BoxLayout.Y_AXIS));
	        bg = Color.cyan;
	        pr1 = new JLabel(s,SwingConstants.CENTER);
	        add(pr1); 
	        msg = new JLabel(s2);
	        guessInput = new JTextField(20);
	        guessInput.addActionListener(new GuessHandler());
	        
	        pan1.add(guessInput);
	        pan1.add(msg);
	        add(pan1);
	        
	        
	        newgame = new JButton("PlayAgain");
	        pan1.add(newgame);
	        add(pan);
	        
	        Random gen = new Random();
	        number = gen.nextInt(1001);
	        System.out.println(number);
	        newgame.addActionListener(
	                new ActionListener()
	                {
	                	@Override
	                    public void actionPerformed(ActionEvent e)
	                    {
	                    	changeBackground("cyan");
	                    	pr1.setText(s);
	                        guessInput.setText("");
	                        Random generator = new Random();
	                        number = generator.nextInt(1001);
	                        rdm.setText(String.valueOf(number));
	                        SwingUtilities.updateComponentTreeUI(rdm);
	                        guessInput.setEditable(true);
	                        guesses = 0;
	                        msg.setText(s2);
	                        guesses++;
	                    }

		          }
	        );
	        Game();
	    }

	    public void Game() {
	    	
	    }
	    
	    public void changeBackground(String col) {
	    	if(col == "red") {
	    		getContentPane().setBackground(Color.RED);
	    		pan.setBackground(Color.RED);
	    		pan1.setBackground(Color.RED);
	    	}
	    	else if(col == "blue"){
	    		getContentPane().setBackground(Color.BLUE);
	    		pan.setBackground(Color.BLUE);
	    		pan1.setBackground(Color.BLUE);
	    	}
	    	else if(col == "green"){
	    		getContentPane().setBackground(Color.GREEN);
	    		pan.setBackground(Color.GREEN);
	    		pan1.setBackground(Color.GREEN);
	    	}
	    	else {
	    		getContentPane().setBackground(Color.CYAN);
	    		pan.setBackground(Color.CYAN);
	    		pan1.setBackground(Color.CYAN);
	    	}
	    }
	    class GuessHandler implements ActionListener {
	    
	        public void actionPerformed(ActionEvent e) {
	        
	        	pr1.setText(s1);
	            int curGuess;
	            String dis="";
	            try {
	            	curGuess = Integer.parseInt(guessInput.getText());
	            	if (curGuess > previousGuess)
	                {
	            		changeBackground("red");
	                }
	                else if(curGuess == previousGuess) {
	                	
	                }
	                else
	                {
	                	changeBackground("blue");
	                }
	                previousGuess = curGuess;
	                if (curGuess > number)
	                {
	                	dis = "Too High";
	                }
	                if (curGuess < number)
	                {
	                	dis = "Too Low";
	                }
	                if (curGuess == number)
	                {
	                	changeBackground("green");
	                    dis = "Correct!";
	                    guessInput.setEditable(false);
	                }
	            }
	            catch(NumberFormatException ee) {
	            	dis = "Enter an Integer";
	            }
	            
	            msg.setText("<html>"+"<br>"+dis+"<br>Number of guesses: " + guesses++ +"<br><p></p><br></html>");
	        }
	    }
}

