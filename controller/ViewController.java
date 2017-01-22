package controller;

import view.*;
import model.*;

public class ViewController {

	private Model model;
	private View view;
	
	public ViewController(Model model) {
		this.model = model;
		this.view = new View();
	}
	
	public void show() {
		view.show(model.getPrimaryStage());
	}
	
	
}
