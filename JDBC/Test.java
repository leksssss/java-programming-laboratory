package jdbc;

import java.awt.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App app =  new App();
		app.setLayout((LayoutManager)new FlowLayout());
		app.setVisible(true);
		app.setSize(380,500);
		app.setDefaultCloseOperation(app.EXIT_ON_CLOSE);
	}

}
