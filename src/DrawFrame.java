import java.awt.BorderLayout;

import javax.swing.JFrame;

public class DrawFrame extends JFrame {
	
	private Environment environment;
	
	public DrawFrame(){
		
		environment = new Environment();
		add(environment, BorderLayout.CENTER);
		
	}

}
