package controller;

import javafx.application.Application;
import javafx.stage.Stage;
import model.*;
import view.*;

public class StartUp extends Application{
	
	private ViewController viewControl;
	private Model model;

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		model = new Model(primaryStage);
		viewControl = new ViewController(model);
		viewControl.show();
		
	}
	
	public static void main(String[] args) {
		start();
	}

}
