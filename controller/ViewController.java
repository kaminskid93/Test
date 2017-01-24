package controller;

import view.*;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import model.*;

public class ViewController {

	private View view;
	private Model model;
	
	public void show() {
		view.show(model.getPrimaryStage());
	}
	
	public ViewController(Model model) {
		this.model = model;
		this.view = new View();
		
		view.getSliderOne().addChangeListener(new SliderOneController(model));
		view.getSliderTwo().addChangeListener(new SliderTwoController(model));
				
		model.addObserver(view.getSliderOne());
		model.addObserver(view.getSliderTwo());
		model.addObserver(view.getDistLabel());
		
		model.setDistance(50);
		
		
		
	}

}
