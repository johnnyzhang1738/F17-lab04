package edu.ucsb.cs56.drawings.kperkins.advanced;

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
 * @author Kate Perkins
 * @version for UCSB CS56, F17 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few ice cream cones 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	IceCreamCone ic1 = new IceCreamCone(150,250,50,75);
	g2.setColor(Color.GREEN); g2.draw(ic1);
	
	// Make a black ice cream cone that's half the size, 
	// and moved over 180 pixels in x direction
	
	Shape ic2 = ShapeTransforms.scaledCopyOfLL(ic1,0.5,0.5);
	ic2 = ShapeTransforms.translatedCopyOf(ic2,180,0);
	g2.setColor(Color.BLACK); g2.draw(ic2);
	
	// Here's an ice cream cone that's 3x as big
	// and moved over 150 more pixels to right.
	ic2 = ShapeTransforms.scaledCopyOfLL(ic2,3,3);
	ic2 = ShapeTransforms.translatedCopyOf(ic2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(ic2); 
	
	// Draw two Ice cream cones with toppings
	
	IceCreamWithToppings icT1 = new IceCreamWithToppings(50,350,40,75);
	IceCreamWithToppings icT2 = new IceCreamWithToppings(200,150,200,100);
	
	g2.draw(icT1);
	g2.setColor(new Color(0x8FAAFF)); g2.draw(icT2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Some ice cream by Kate Perkins", 20,20);
    }
    
    
    /** Draw a picture with a few ice cream cones with and without toppings
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some ice cream.
	IceCreamCone large = new IceCreamCone(100,100,200,150);
	IceCreamCone small = new IceCreamCone(20,50,40,30);
	
	IceCreamWithToppings someToppings = new IceCreamWithToppings(20,150,20,40);
	
	g2.setColor(Color.MAGENTA);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(small);
	g2.setColor(Color.BLUE);    g2.draw(someToppings);
       
	IceCreamCone i1 = new IceCreamCone(100,250,50,75);
	g2.setColor(Color.BLUE); g2.draw(i1);
	
	// Make a black ice cream that's half the size, 
	// and moved over 100 pixels in x direction
	Shape i2 = ShapeTransforms.scaledCopyOfLL(i1,0.5,0.5);
        i2 = ShapeTransforms.translatedCopyOf(i2,100,0);
	g2.setColor(Color.BLACK); g2.draw(i2);
	
	// Here's an ice cream cone that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	i2 = ShapeTransforms.scaledCopyOfLL(i2,4,4);
	i2 = ShapeTransforms.translatedCopyOf(i2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(i2); 
	
	// Draw two ice cream cones with toppings
	
	IceCreamWithToppings ic1 = new IceCreamWithToppings(50,350,40,75);
	IceCreamWithToppings ic2 = new IceCreamWithToppings(200,350,150,100);
	
	g2.draw(ic1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second ice cream 45 degrees around its center.
	Shape ic3 = ShapeTransforms.rotatedCopyOf(ic2, Math.PI/4.0);
	
	g2.draw(ic3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("ice cream by Kate Perkins", 20,20);
    }
    
    /** Draw a different picture with a few ice cream cones with and without toppings */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of ice cream cones", 20,20);
	
	
	// Draw some ice cream
	
	IceCreamCone big = new IceCreamCone(100,50,225,150);
	IceCreamCone small = new IceCreamCone(20,50,40,30);

	//draw some ice cream with Toppings

	IceCreamWithToppings icT1 = new IceCreamWithToppings(70, 200, 100, 200);
	IceCreamWithToppings icT2 = new IceCreamWithToppings(40, 100, 50, 70);
	
	
	g2.setColor(Color.RED);     g2.draw(big);
	g2.setColor(Color.GREEN);   g2.draw(small);
	g2.setColor(new Color(0x404488)); g2.draw(icT1);
	g2.setColor(new Color(0x0089CC)); g2.draw(icT2);
    }
}
