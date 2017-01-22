package controller;

import view.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import model.*;


public class SliderOneController implements ChangeListener {

	private Model model;
	private View view;
	
	public SliderOneController(Model model) {
		this.model = model;
		this.view = new View();
	}
	
	public void show() {
		view.show(model.getPrimaryStage());
	}

	@Override
	public void changed(ObservableValue observable, Object oldValue, Object newValue) {
		model.setDistance((int) newValue);
		System.out.println("State Changed!");
		
	}

	
	
}
