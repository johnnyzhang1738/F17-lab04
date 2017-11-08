package edu.ucsb.cs56.drawings.erick_suarez.advanced;

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
 *  @author Erick Suarez
 *  @version for CS56, F17, UCSB
 */

public class AllMyDrawings
{
    /** Draw a picture with a few Doors
     */

    public static void drawPicture1(Graphics2D g2) {

        Door d1 = new Door(100,250,50,75);
        g2.setColor(Color.darkGray); g2.draw(d1);

        // Make a black Door that's half the size,
      	// and moved over 150 pixels in x direction

      	Shape d2 = ShapeTransforms.scaledCopyOfLL(d1,0.5,0.5);
      	d2 = ShapeTransforms.translatedCopyOf(d2,150,0);
      	g2.setColor(Color.ORANGE); g2.draw(d2);

      	// Here's a Door that's 4x as big (2x the original)
      	// and moved over 150 more pixels to right.
      	d2 = ShapeTransforms.scaledCopyOfLL(d2,4,4);
      	d2 = ShapeTransforms.translatedCopyOf(d2,150,0);

        	// We'll draw this with a thicker stroke
        	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

        	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
        	// #002FA7 is "International Klein Blue" according to Wikipedia
        	// In HTML we use #, but in Java (and C/C++) its 0x

        	Stroke orig=g2.getStroke();
        	g2.setStroke(thick);
        	g2.setColor(new Color(0x002FA7));
        	g2.draw(d2);

        	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING

        	g2.setStroke(orig);
        	g2.setColor(Color.BLACK);
        	g2.drawString("Which Door is the right one? by Erick Suarez", 20,20);
      }


      /** Draw a picture with a few Doors and Doors with a window
       */
      public static void drawPicture2(Graphics2D g2) {

        	// Draw some Doors with a window.

        	DoorWithWindow large = new DoorWithWindow(100,70,150,250);
        	DoorWithWindow smallDW = new DoorWithWindow(20,50,40,30);
        	DoorWithWindow tallSkinny = new DoorWithWindow(20,150,20,40);
        	DoorWithWindow shortFat = new DoorWithWindow(20,250,40,20);

        	g2.setColor(Color.RED);     g2.draw(large);
        	g2.setColor(Color.GREEN);   g2.draw(smallDW);
        	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
        	g2.setColor(Color.MAGENTA); g2.draw(shortFat);

        	Door d1 = new Door(100,250,50,75);
        	g2.setColor(Color.CYAN); g2.draw(d1);

        	// Make a black Door that's half the size,
        	// and moved over 150 pixels in x direction
        	Shape d2 = ShapeTransforms.scaledCopyOfLL(d1,0.5,0.5);
        	d2 = ShapeTransforms.translatedCopyOf(d2,150,0);
        	g2.setColor(Color.BLACK); g2.draw(d2);

        	// Here's a Door that's 4x as big (2x the original)
        	// and moved over 150 more pixels to right.
        	d2 = ShapeTransforms.scaledCopyOfLL(d2,4,4);
        	d2 = ShapeTransforms.translatedCopyOf(d2,150,0);

        	// We'll draw this with a thicker stroke
        	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

        	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
        	// #002FA7 is "International Klein Blue" according to Wikipedia
        	// In HTML we use #, but in Java (and C/C++) its 0x

        	Stroke orig=g2.getStroke();
        	g2.setStroke(thick);
        	g2.setColor(new Color(0x002FA7));
        	g2.draw(d2);

        	// Draw two Doors with Windows

        	DoorWithWindow dw1 = new DoorWithWindow(50,350,40,75);
        	DoorWithWindow dw2 = new DoorWithWindow(200,350,200,100);

        	g2.draw(dw1);
        	g2.setColor(new Color(0x8F00FF));

        	// Rotate the second door 45 degrees around its center.
        	Shape dw3 = ShapeTransforms.rotatedCopyOf(dw2, Math.PI/4.0);

        	g2.draw(dw3);

        	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING

        	g2.setStroke(orig);
        	g2.setColor(Color.BLACK);
        	g2.drawString("More Doors with a twist by Erick Suarez", 20,20);
            }

            /** Draw a different picture with a few Doors and Doors with a window
             */

      public static void drawPicture3(Graphics2D g2) {

        	// label the drawing

        	g2.drawString("Why is everything upside down? by Erick suarez", 20,20);


        	// Draw some Doors with window.

        	Door largeDoor = new Door(50,300,100,200);
        	Door smallDoor = new Door(300,300,50,100);
          DoorWithWindow largeDW = new DoorWithWindow(50,50,100,200);
        	DoorWithWindow smallDW = new DoorWithWindow(300,50,50,100);
          // Rotate the second door 270 degrees around its center.
          Shape ulargeDoor = ShapeTransforms.rotatedCopyOf(largeDoor, Math.PI);
          Shape usmallDoor = ShapeTransforms.rotatedCopyOf(smallDoor, Math.PI);
          Shape ulargeDW = ShapeTransforms.rotatedCopyOf(largeDW, Math.PI);
          Shape usmallDW = ShapeTransforms.rotatedCopyOf(smallDW, Math.PI);

        	g2.setColor(Color.RED);     g2.draw(ulargeDoor);
        	g2.setColor(Color.GREEN);   g2.draw(usmallDoor);
          g2.setColor(Color.BLUE);     g2.draw(ulargeDW);
          g2.setColor(Color.GRAY);   g2.draw(usmallDW);

      }
}
