import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Dreammer {

	public static void main(String[] args) {
		DrawFrame app = new DrawFrame();
		Environment environment = new Environment();
        
		app.add( environment);
		app.pack();
		app.setSize(1600, 1000);
        app.setVisible(true);
        
       
        
        app.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
       

        

	}

}
