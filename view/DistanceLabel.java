package view;

import java.util.Observable;
import java.util.Observer;

import javafx.scene.Node;
import model.Model;
import javafx.scene.control.Label;

public class DistanceLabel extends Label implements Observer {

	private int distanceKM = 0;
	private int distanceMILES = 0;

	public DistanceLabel(Model model) {
		this.setText(distanceKM + " Kilometer sind umgerechnet "
				+ distanceMILES + " Meilen.");
	}

	@Override
	public void update(Observable model, Object new_val) {
		// TODO Auto-generated method stub
		this.setDistanceKM((int) new_val);
		this.setDistanceMILES((int) new_val * (int) 0.621371);
		this.setText(distanceKM + " Kilometer sind umgerechnet " + distanceMILES + " Meilen.");

	}
	
	public void setDistanceKM(int new_val) {
		this.distanceKM = new_val;
	}
	
	public void setDistanceMILES(int new_val) {
		this.distanceMILES = new_val;
	}
	
	public int getDistanceKM() {
		return this.distanceKM;
	}
	
	public int getDistanceMILES() {
		return this.distanceMILES;
	}

}
