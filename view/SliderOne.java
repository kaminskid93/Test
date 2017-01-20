package view;

import model.Model;

import java.util.Observable;
import java.util.Observer;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Slider;

public class SliderOne extends Slider implements Observer {

	private Model model;
	
	
	public void setModel(Model model) {
		this.model = model;
	}
	
	public SliderOne() {
		this.setShowTickLabels(true);
		this.setShowTickMarks(true);
		this.setMajorTickUnit(20);
		this.setMajorTickUnit(50);
		this.setValue(50);
		this.setMin(0);
		this.setMax(100);
		this.valueProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue<? extends Number> ov, Number old_val, Number new_val) {
				System.out.println(old_val + " Value has changed! " + new_val);
			}
		});
	}
	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("changed!");
//		this.model.setDistance((int) this.getValue());
//	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		this.setValue((double) arg1);
	}

}
