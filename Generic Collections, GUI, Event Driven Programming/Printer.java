package p1;

import javax.swing.*;

public class Printer {
	public static void main(String args[]) throws Exception
    {
    	PrinterTest printer = new PrinterTest();
        printer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        printer.setSize(500, 175);
        printer.setVisible(true);
    }
}
