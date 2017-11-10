package edu.ucsb.cs56.drawings.xiaosun95.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
/**                                                                            
   A Table                                                                      
   @author Xiao Sun                                                         
   @version for CS56, F17, UCSB                                                 
                                                                                
*/
public class tablewithballs extends table implements Shape
{
    /**                                                                         
     * Constructor for objects of class table                              
     */
    public tablewithballs(double x, double y, double width, double height)
    {
        // construct the basic table shell                                      
        super(x,y,width,height);

        // get the GeneralPath that we are going to append stuff to             
        GeneralPath gp = this.get();

        // Make three balls, spaced like this, where w=width/10.0;            
        // | +--+ +--+ +--+ |                                                   
        // | |  | |  | |  | |                                                   
        // | +--+ +--+ +--+ |                                                   
        // |w 2w w 2w w w2 w|                                                   
        //                                                                      
        // The top of window will be at y + 0.5*height and the                  
        // height of the window is 0.25height;                                  
        double ballheight=0.1* width;
        double ballwidth =0.1* width;
        

        Ellipse2D.Double ball1 =
            new Ellipse2D.Double(x, y-ballheight,ballheight,ballwidth);
        Ellipse2D.Double ball2 =
            new Ellipse2D.Double(x+0.2*width, y-ballheight,ballheight,ballwidth);
        Ellipse2D.Double ball3 =
            new Ellipse2D.Double(x+0.6*width,y-ballheight,ballheight,ballwidth);

        // add balls to table                  
        // Look up the meaning of the second parameter of append                
        // (Hint--is a method of "GeneralPath") 
 // add the windows to the house                                         
        // Look up the meaning of the second parameter of append                
        // (Hint--is a method of "GeneralPath")                                 

        GeneralPath wholetable = this.get();
        wholetable.append(ball1, false);
        wholetable.append(ball2, false);
        wholetable.append(ball3, false);
    }
}
