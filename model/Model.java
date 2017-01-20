package model;
import java.util.Observable;

public class Model extends Observable {

	
	private int distance = 0;
	
	public void setDistance(int dist) {
		setChanged();
		this.distance = dist;
		System.out.println("new Distance" + dist);
		notifyObservers(this.getDistance());
	}
	
	public int getDistance() {
		return distance;
	}
}
