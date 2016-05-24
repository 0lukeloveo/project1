
 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JPanel;


// Fig. 12.5: ColorJPanel.java
// Demonstrating Colors.
 
 
public class Environment extends JPanel  
{
	
      // draw rectangles and Strings in different colors
      public void paintComponent( Graphics g )
      {
    	  
             super.paintComponent( g ); // call superclass's paintComponent
 
             this.setBackground( Color.WHITE );
 
             g.setColor( new Color( 0, 0, 0 ) );
             g.drawRect( 0, 500, 200, 500);
             
             
             g.setColor( new Color(0,0, 0) );
             g.drawRect( 50, 550, 100, 100);
             
 
             // set new drawing color using floats
             g.setColor( Color.GRAY );
             g.fillRect( 350, 350, 50, 600);
            
 
             // set new drawing color using static Color objects
             g.setColor( Color.BLUE );
             g.fillRect( 300, 400, 150, 50);
             
 
             // display individual RGB values
             Color color = Color.MAGENTA;
             g.setColor( color );
             int[] xpoints = {500, 550,650,700};
             int[] ypoints = {1000, 600, 600,1000};
             Polygon myTriangle = new Polygon(xpoints, ypoints, 4);
             g.fillPolygon(myTriangle);
            
             
             g.setColor( new Color( 255, 0, 0 ) );
             g.fillRect( 600, 450, 25, 150);
             
 
             // set new drawing color using static Color objects
             g.setColor( Color.RED );
             g.fillRect( 560, 500, 100, 25);
             
             
             g.setColor( new Color( 255, 0, 0 ) );
             g.drawOval( 750, 900, 200, 50);
             
             g.setColor( Color.GRAY );
             g.fillRect( 1000, 350, 50, 600);
             
 
             // set new drawing color using static Color objects
             g.setColor( Color.BLUE );
             g.fillRect( 950, 400, 150, 50);
             
             
             
             g.setColor( new Color( 128, 64, 0 ) );
             g.fillRect( 1250, 400, 150, 600);
             
 
             // set new drawing color using static Color objects
             g.setColor( Color.GREEN );
             g.fillRect( 1200, 400, 250, 200);
             
 
             g.setColor( Color.black );
             g.fillRect( 0, 425, 1600, 10);
             
 
             
             
             
           
      } // end method paintComponent
} // end class ColorJPanel

