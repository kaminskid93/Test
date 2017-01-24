package controller;

import view.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import model.*;


public class SliderOneController implements ChangeListener {

	private Model model;
	
	public SliderOneController(Model model) {
		this.model = model;
	}

	@Override
	public void changed(ObservableValue observable, Object oldValue, Object newValue) {
		
		model.setDistance(((Number)newValue).intValue());
		
	}

	
	
}
