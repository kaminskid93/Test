package controller;

import view.*;
import model.*;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



public class SliderTwoController implements ChangeListener {

	private Model model;
	private View view;
	
	public SliderTwoController(Model model) {
		this.model = model;
		this.view = new View();
	}
	
	public void show() {
		view.show(model.getPrimaryStage());
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		SliderOne slider1 = (SliderOne) e.getSource();
		model.setDistance((int) slider1.getValue()); 
		System.out.println("State Changed");
	}
	
	
}
