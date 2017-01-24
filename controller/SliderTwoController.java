package controller;

import view.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import model.*;
import util.Util;

public class SliderTwoController implements ChangeListener {

	private Model model;
	
	public SliderTwoController(Model model) {
		this.model = model;
	}
	
	@Override
	public void changed(ObservableValue slider1, Object oldValue, Object newValue) {
		
		model.setDistance((int) Math.round(Util.milesToKm(((Number) newValue).doubleValue())));

	}
	
}
