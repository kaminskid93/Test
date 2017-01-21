package controller;

import javafx.application.Application;
import javafx.stage.Stage;
import model.*;
import view.*;

public class Controller extends Application{
	
	private View view;
	private Model model;

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		model = new Model();
		view = new View(model);
		
		view.show(primaryStage);
		
		
	}

}