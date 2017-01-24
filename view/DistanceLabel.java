package view;

import java.util.Observable;
import java.util.Observer;

import javafx.scene.Node;
import model.Model;
import javafx.scene.control.Label;
import util.Util;

public class DistanceLabel extends Label implements Observer {

	@Override
	public void update(Observable model, Object new_val) {
		if (new_val instanceof Number) {
		      int km = ((Number) new_val).intValue();
		      int miles = (int) Math.round(Util.kmToMiles(km));

		      setText(km + " kilometers equals " + miles + " miles");

		    } else {
		      throw new IllegalArgumentException("Sliders may only process numeric values");
		    }
	}

}
