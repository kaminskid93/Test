package view;

import java.util.Observable;
import java.util.Observer;
import javafx.scene.control.Slider;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;


public class SliderOne extends Slider implements Observer {

	public SliderOne() {
		
		this.setShowTickLabels(true);
		this.setShowTickMarks(true);
		this.setMajorTickUnit(20);
		this.setMajorTickUnit(50);
		this.setValue(50);
		this.setMin(0);
		this.setMax(100);
		
	}
	
	public void addChangeListener(ChangeListener listener) {
		this.valueProperty().addListener(listener);
	}
	
	@Override
	public void update(Observable model, Object val) {
		if(val instanceof Number) {
		this.setValue(((Number)val).intValue());
		}
		else {
			throw new IllegalArgumentException("Sliders can only process numeric values.");
		}
		
	}

}
