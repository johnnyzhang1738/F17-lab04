package edu.ucsb.cs56.drawings.yash_rane.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Phill Conrad, Yash Rane 
 * @version for UCSB CS56, F17 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few Lollypops 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	g2.setColor(new Color(0x8F00FF));
	Lollypop l1 = new Lollypop(100, 200, 50, 50);
	g2.draw(l1);

	Lollypop l2 = new Lollypop(300, 300, 100, 200);
	g2.setColor(Color.RED);
	g2.draw(l2);

	Lollypop l3 = new Lollypop(400, 100, 25, 20);
	g2.setColor(Color.CYAN);
	g2.draw(l3);	


	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	g2.setColor(Color.BLACK); 
	g2.drawString("Some Lollypops by Yash Rane", 20,20);
    }
    
    
    /** Draw a picture with a few Skateboard
     */
    public static void drawPicture2(Graphics2D g2) {

	g2.setColor(new Color(0x8F00FF));
	Skateboard s1 = new Skateboard(100, 200, 150, 50);
	g2.draw(s1);

	Skateboard s2 = new Skateboard(300, 300, 300, 100);
	g2.setColor(Color.RED);
	g2.draw(s2);

	Skateboard s3 = new Skateboard(400, 100, 50, 20);
	g2.setColor(Color.CYAN);
	g2.draw(s3);	

	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setColor(Color.BLACK); 
	g2.drawString("Several Skateboards by Yash Rane", 20,20);
    }
    
    /** Draw a picture with some Patterned Skateboards
     */
    
    public static void drawPicture3(Graphics2D g2) {
	g2.setColor(new Color(0x8F00FF));
	PatternedSkateboard s1 = new PatternedSkateboard(100, 200, 150, 50);
	g2.draw(s1);

	PatternedSkateboard s2 = new PatternedSkateboard(300, 300, 300, 100);
	g2.setColor(Color.RED);
	g2.draw(s2);

	PatternedSkateboard s3 = new PatternedSkateboard(400, 100, 50, 20);
	g2.setColor(Color.CYAN);
	g2.draw(s3);	

	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setColor(Color.BLACK); 
	g2.drawString("Several Patterned Skateboards by Yash Rane",20,20); 	
    }       
}
