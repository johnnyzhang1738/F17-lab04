package edu.ucsb.cs56.drawings.ryanl.wiener.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.ryanl.wiener.Glasses;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Phill Conrad 
 * @author Ryan Wiener
 * @version for UCSB CS56, F17 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few glasses and shades
     */
    
    public static void drawPicture1(Graphics2D g2) {
		Stroke orig=g2.getStroke();
		Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
		g2.setStroke(thick);
		// draw some glasses
		Glasses glass1 = new Glasses(100,250,50,75);
		g2.setColor(Color.CYAN);
		g2.draw(glass1);
	/*	
		
		Shape glass2 = ShapeTransforms.scaledCopyOfLL(glass1,0.5,0.5);
		glass2 = ShapeTransforms.translatedCopyOf(glass2,150,0);
		g2.setColor(Color.BLACK);
		g2.draw(glass2);
		
		glass2 = ShapeTransforms.scaledCopyOfLL(glass2,4,4);
		glass2 = ShapeTransforms.translatedCopyOf(glass2,150,0);
		
		// We'll draw this with a thicker stroke
		
		// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
		// #002FA7 is "International Klein Blue" according to Wikipedia
		// In HTML we use #, but in Java (and C/C++) its 0x
		
		g2.setColor(new Color(0x002FA7)); 
		g2.draw(glass2); 
		// draw some shades
		Shades s1 = new Shades(50,350,40,75);
		Shades s2 = new Shades(200,350,200,100);
		
		g2.draw(s1);
		g2.setColor(new Color(0x8F00FF));
		g2.draw(s2);
		
		// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
		
		g2.setStroke(orig);
		g2.setColor(Color.BLACK); 
		g2.drawString("A few glasses and shades by Ryan Wiener. This is the mac test!!!!!!!!!", 20,20);
		*/
    }
    
    
    /** Draw a picture with a few glasses and shades
     */
    public static void drawPicture2(Graphics2D g2) {
		//draw some shades
		Shades small = new Shades(20,50,40,30);
		Shades shortFat = new Shades(20,250,40,20);
		
		g2.setColor(Color.GREEN); 
	  	g2.draw(small);
		g2.setColor(Color.MAGENTA);
	   	g2.draw(shortFat);

		//draw some glasses
		
		Glasses glass1 = new Glasses(50,350,40,75);
		Glasses glass2 = new Glasses(400,50,200,100);
		
		g2.draw(glass1);
		g2.draw(glass2);
		g2.setColor(new Color(0x8F00FF)); 
		
		Shape glass3 = ShapeTransforms.rotatedCopyOf(new Glasses(200,250,200,100), Math.PI/4.0);
		
		g2.draw(glass3);
		
		// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
		g2.setColor(Color.BLACK); 
		g2.drawString("A bunch of glasses and shades by Ryan Wiener", 20,20);
    }
    
    /** Draw a different picture with a few glasses and shades
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
		// label the drawing
		
		g2.drawString("A bunch of glasses and shades by Ryan Wiener", 20,20);
		
		
		// Draw some glasses and shades
		
		Glasses largeGlasses = new Glasses(100,50,225,150);
		Glasses smallGlasses = new Glasses(20,50,40,30);
		Shades shades = new Shades(60, 200, 150, 100);
		
		g2.setColor(Color.RED);
		g2.draw(largeGlasses);
		g2.setColor(Color.GREEN);
		g2.draw(smallGlasses);
		g2.draw(shades);
    }       
}
