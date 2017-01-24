package model;
import java.util.Observable;

import javafx.stage.Stage;

public class Model extends Observable {

	
	private int distance = 50;
	private Stage primaryStage = null;
	
	public Model(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}
	
	public void setDistance(int dist) {
		setChanged();
		distance = dist;
		System.out.println("new distance " + dist);
		notifyObservers(this.getDistance());
	}
	
	public Stage getPrimaryStage() {
		return primaryStage;
	}
	
	public int getDistance() {
		return distance;
	}
}
