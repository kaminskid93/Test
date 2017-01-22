package model;
import java.util.Observable;

import javafx.stage.Stage;

public class Model extends Observable {

	
	private int distance = 50;
	private Stage primaryStage = null;
	
	public static final double MILES_TO_KM = 1.60934;
	public static final double KM_TO_MILES = 0.621371;
	
	public Model(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}
	
	public void setDistance(int dist) {
//		setChanged();
		distance = dist;
		System.out.println("new Distance " + dist);
//		notifyObservers(this.getDistance());
	}
	
	public Stage getPrimaryStage() {
		return primaryStage;
	}
	
	public int getDistance() {
		return distance;
	}
}
