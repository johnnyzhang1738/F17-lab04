package edu.ucsb.cs56.drawings.brianhumphreys.advanced;

import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.Shape;

public class TrainingBike extends Bike implements Shape
{
	/** 
	* Constructor for objects of TrainingBike class
	*/
	public TrainingBike(double x, double y, double length, double height, double wheelRadius)
	{
		super(x,y,length,height,wheelRadius);

		GeneralPath gp = this.get();

		double trainingWheelRadius = wheelRadius / 4;
		double trainingWheelDiameter = trainingWheelRadius * 2;

		Ellipse2D.Double trainingWheel =
		new Ellipse2D.Double (x - trainingWheelRadius,
			y + (trainingWheelRadius * 3),
			trainingWheelDiameter,
			trainingWheelDiameter);

		Rectangle2D.Double mount = 
		new Rectangle2D.Double (x - (trainingWheelRadius / 2),
			y,
			trainingWheelRadius,
			trainingWheelRadius * 3);

		GeneralPath wholeBike = this.get();
		wholeBike.append(trainingWheel, false);
		wholeBike.append(mount, false);
	}
}