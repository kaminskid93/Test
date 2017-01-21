package model;
import java.util.Observable;

public class Model extends Observable {

	
	private double distance = 50;
	
	public static final double MILES_TO_KM = 1.60934;
	public static final double KM_TO_MILES = 0.621371;
	
	public void setDistance(double dist) {
		setChanged();
		this.distance = dist;
		System.out.println("new Distance " + dist);
		notifyObservers(this.getDistance());
	}
	
	public double getDistance() {
		return distance;
	}
}
