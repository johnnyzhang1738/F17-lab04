package edu.ucsb.cs56.drawings.cindylu.advanced;

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
 * @author Phill Conrad 
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few houses 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Lock l1 = new Lock(100,250,50,100);
	g2.setColor(Color.CYAN); g2.draw(l1);
	
	// Make a black lock that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape l2 = ShapeTransforms.scaledCopyOfLL(l1,0.5,0.5);
	l2 = ShapeTransforms.translatedCopyOf(l2,150,0);
	g2.setColor(Color.BLACK); g2.draw(l2);
	
	// Here's a lock that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	l2 = ShapeTransforms.scaledCopyOfLL(l2,4,4);
	l2 = ShapeTransforms.translatedCopyOf(l2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x00C4B0)); 
	g2.draw(l2); 
	
	// Draw two locks with keyholes
	
	LockWithKeyhole LK1 = new LockWithKeyhole(20,100,40,75);
	LockWithKeyhole LK2 = new LockWithKeyhole(300,100,70,140);
	
	g2.draw(LK1);
	g2.setColor(new Color(0xFFBF00)); g2.draw(LK2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("im so confuseddddd", 20,20);
    }
    
    
    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some coffee cups.
	
	Lock large = new Lock(100,50,225,150);
	Lock smallL = new Lock(20,50,20,40);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.BLUE);    g2.draw(smallL);
	
	LockWithKeyhole LK1 = new LockWithKeyhole(100,250,50,100);
	g2.setColor(new Color(0x551B8C)); g2.draw(LK1);
	
	// Make a black house that's half the size, 
	// and moved over 150 pixels in x direction
	Shape LK2 = ShapeTransforms.scaledCopyOfLL(LK1,0.5,0.5);
	LK2 = ShapeTransforms.translatedCopyOf(LK2,150,0);
	g2.setColor(Color.BLACK); g2.draw(LK2);
	
	// Here's a house that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	LK2 = ShapeTransforms.scaledCopyOfLL(LK2,4,4);
	LK2 = ShapeTransforms.translatedCopyOf(LK2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x89CFF0)); 
	g2.draw(LK2); 
	
	// Draw two houses with Windows
	
	Lock L1 = new Lock(50,350,30,75);
	LockWithKeyhole LK = new LockWithKeyhole(200,350,50,100);
	
	g2.draw(L1);
	g2.setColor(new Color(0x8F5973)); 
	
	// Rotate the second house 45 degrees around its center.
	Shape LK3 = ShapeTransforms.rotatedCopyOf(LK, Math.PI/4.0);
	
	g2.draw(LK3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Locks by Cindy Lu", 20,20);
    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of locks by Cindy Lu", 20,20);
	
	
	// Draw some coffee cups.
	
	Lock smallL = new Lock(300,50,30,60);
	LockWithKeyhole largeL = new LockWithKeyhole(20,30,200,400);

	Stroke thick = new BasicStroke (6.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
     
	
	g2.setColor(new Color(0xA1CAF1));     g2.draw(smallL);
	g2.setStroke(thick);
	g2.setColor(new Color(0xFFC1CC));     g2.draw(largeL);
	
    }       
}
