package view;

import java.util.Observable;
import java.util.Observer;

import javafx.scene.Node;
import model.Model;
import javafx.scene.control.Label;

public class DistanceLabel extends Label implements Observer {

	private Model model;

	public DistanceLabel(Model model) {
		this.setText((int) model.getDistance() + " Kilometer sind umgerechnet "
				+ (int) (model.getDistance() * model.KM_TO_MILES) + " Meilen.");
		this.model = model;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		this.setText((int) arg + " Kilometer sind umgerechnet " + (int) ((int) arg * model.KM_TO_MILES) + " Meilen.");

	}

}
