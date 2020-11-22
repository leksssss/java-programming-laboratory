package p1;

import javax.swing.*;

public class GuessNumber {
	
    public static void main(String args[]) throws Exception
    {
        GuessTest game = new GuessTest();
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setSize(400, 400);
        game.setVisible(true);
    }
}
