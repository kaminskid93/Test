package view;

import model.Model;

import java.util.Observable;
import java.util.Observer;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Slider;

public class SliderOne extends Slider implements Observer {

	private Model model;
	
	
	public SliderOne(Model model) {
		this.setShowTickLabels(true);
		this.setShowTickMarks(true);
		this.setMajorTickUnit(20);
		this.setMajorTickUnit(50);
		this.setValue(50);
		this.setMin(0);
		this.setMax(100);
		this.model = model;
	}
	
	
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		double new_val = this.model.getDistance();
		this.setValue(new_val);
	}

}
