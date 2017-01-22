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
		
		SliderOne slide1 = view.getSliderOne();
		SliderTwo slide2 = view.getSliderTwo();
		
		model.addObserver(slide1);
		model.addObserver(slide2);
		
		
		
	}

}
