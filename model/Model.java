package model;
import java.util.Observable;

public class Model extends Observable {

	
	private int distance = 0;
	
	public void setDistance(int dist) {
		setChanged();
		this.distance = dist;
		notifyObservers(this.getDistance());
	}
	
	public int getDistance() {
		return distance;
	}
}
