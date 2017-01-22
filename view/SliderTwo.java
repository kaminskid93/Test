package view;

import model.Model;
import java.util.Observable;
import java.util.Observer;

import javafx.scene.control.Slider;

public class SliderTwo extends Slider implements Observer {

	public SliderTwo() {
		this.setShowTickLabels(true);
		this.setShowTickMarks(true);
		this.setMajorTickUnit(20);
		this.setMajorTickUnit(50);
		this.setValue(50);
		this.setMin(0);
		this.setMax(100);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub

	}

}
