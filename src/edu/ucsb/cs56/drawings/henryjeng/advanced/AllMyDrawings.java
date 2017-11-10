package edu.ucsb.cs56.drawings.henryjeng.advanced;

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
    /** Draw a picture with a few bottles 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Bottle b1 = new Bottle(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(b1);
	
	// Make a black bottle that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape b2 = ShapeTransforms.scaledCopyOfLL(b1,0.5,0.5);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	g2.setColor(Color.BLACK); g2.draw(b2);
	
	// Bottle
	// and moved over 150 more pixels to right.
	b2 = ShapeTransforms.scaledCopyOfLL(b2,4,4);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(b2); 
	
	// Draw Bottles with lavels
	
	BottleWithLabel bl1 = new BottleWithLabel(50,350,40,75);
	BottleWithLabel bl2 = new BottleWithLabel(200,350,200,100);
	
	g2.draw(bl1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(bl2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few bottles by Henry Jeng", 20,20);
    }
    
    
    /** Draw a picture with a few bottles
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some coffee cups.	
	Bottle b1 = new Bottle(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(b1);
	
	// Make a black bottle that's half the size, 
	// and moved over 150 pixels in x direction
	Shape b2 = ShapeTransforms.scaledCopyOfLL(b1,0.5,0.5);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	g2.setColor(Color.CYAN); g2.draw(b2);
	
	// Here's a bottle that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	b2 = ShapeTransforms.scaledCopyOfLL(b2,4,4);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       

	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(b2); 
	
	// Draw two more bottles with lavels
	
	BottleWithLabel bl1 = new BottleWithLabel(50,350,40,75);
	BottleWithLabel bl2 = new BottleWithLabel(200,350,200,100);
	
	g2.draw(bl1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second bottle 90 degrees around its center.
	Shape bl3 = ShapeTransforms.rotatedCopyOf(bl2, Math.PI/2.0);
	
	g2.draw(bl3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString(" bottles by Henry Jeng", 20,20);
    }
    
    /** Draw a different picture with a few bottles and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Bottles", 20,20);
	
	
	// Bottles.
	
	Bottle biggyB = new Bottle(100,50,225,150);
	Bottle tinyB = new Bottle(20,50,40,30);
	
	g2.setColor(Color.RED);     g2.draw(biggyB);
	g2.setColor(Color.CYAN);   g2.draw(tinyB);
	
    }       
}
