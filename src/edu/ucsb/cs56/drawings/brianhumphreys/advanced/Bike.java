package edu.ucsb.cs56.drawings.brianhumphreys.advanced;

import java.awt.geom.GeneralPath;
import java.awt.Shape;
import javafx.scene.shape.*;

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms; 
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

public class Bike extends GeneralPathWrapper implements Shape
{
	/**
	* Constructor for objects of class Bike
	*/
	public Bike(double x, double y, double height, double length, double wheelRadius){

		double radiusMax = length / 3;
		double radiusMin = length / 6;
		double heightMin = wheelRadius * 2;

		if(wheelRadius > radiusMax) {wheelRadius = radiusMax;}
		if(wheelRadius < radiusMin) {wheelRadius = radiusMin;}
		if(height < heightMin) {height = heightMin;}

		double rearFrameLength = length / 3;
		double frontFrameLength = 2 * (length / 3);

		double frameHeight = height - wheelRadius;

		double wheelShaftWidth = wheelRadius / 8;

		double seatLength = length / 3;
		double seatHeight = seatLength / 8;

		double handleBarDiameter = wheelShaftWidth * 3;


		//Create Bike wheels from Circle objects
		Ellipse2D.Double backWheel = 
		new Ellipse2D.Double (x - wheelRadius, y - wheelRadius, wheelRadius * 2, wheelRadius * 2);

		Ellipse2D.Double frontWheel = 
		new Ellipse2D.Double (x + length - wheelRadius,
		y - wheelRadius,
		wheelRadius * 2,
		wheelRadius * 2);


		//Create Bike Frame from Line2D.Double objects
		Line2D.Double rearFrameBottomLeg = 
		new Line2D.Double (x, y, x + rearFrameLength, y);

		Line2D.Double  frameHeightLeg = 
		new Line2D.Double (x + rearFrameLength, y,
			x + rearFrameLength, y - frameHeight);

		Line2D.Double rearFrameHypnosLeg =
		new Line2D.Double (x, y, 
			x + rearFrameLength, y - frameHeight);

		Line2D.Double frontFrameTopLeg = 
		new Line2D.Double (x + rearFrameLength, 
			y - frameHeight,
			x + rearFrameLength + frontFrameLength,
			y - frameHeight);

		Line2D.Double frontFrameHypnosLeg = 
		new Line2D.Double (x + rearFrameLength, 
			y,
			x + rearFrameLength + frontFrameLength,
			y - frameHeight);


		//Create Bike Handle bars and wheel shaft objects
		Rectangle2D.Double wheelShaft = 
		new Rectangle2D.Double (x + length,
			y - frameHeight - seatHeight,
			wheelShaftWidth,
			frameHeight + seatHeight);

		Ellipse2D.Double handleBars = 
		new Ellipse2D.Double (x + length - (handleBarDiameter / 3),
		 	y - frameHeight - seatHeight - handleBarDiameter,
			handleBarDiameter,
			handleBarDiameter);


		//Create Bike Seat object
		Ellipse2D.Double bikeSeat =
		new Ellipse2D.Double (x + rearFrameLength - (seatLength / 2),
			y - frameHeight - seatHeight,
			seatLength, 
			seatHeight);


		GeneralPath wholeBike = this.get();
		wholeBike.append(backWheel, false);
		wholeBike.append(frontWheel, false);
		wholeBike.append(rearFrameBottomLeg, false);
		wholeBike.append(frameHeightLeg, false);
		wholeBike.append(rearFrameHypnosLeg, false);
		wholeBike.append(frontFrameTopLeg, false);
		wholeBike.append(frontFrameHypnosLeg, false);
		wholeBike.append(wheelShaft, false);
		wholeBike.append(handleBars, false);
		wholeBike.append(bikeSeat, false);







































	}
}