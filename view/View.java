package view;

import model.Model;

import java.util.Observable;
import java.util.Observer;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class View implements Observer {

	private SliderOne sOne;
	private SliderTwo sTwo;
	private DistanceLabel label;
	private GridPane grid;
	private Scene scene;
	
	public Model model;


	public View(Model model) {
		//setup the GridPane
		grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		
		//setup the Sliders and the Label with model
		sOne = new SliderOne(model);
		sTwo = new SliderTwo(model);
		label = new DistanceLabel(model);

		//add elements to the GridPane
		grid.add(sOne, 0, 1);
		grid.add(sTwo, 0, 2);
		grid.add(label, 0, 0);
		
		scene = new Scene(grid, 450, 450);
	}

	public void show(Stage stage) {
		stage.setScene(scene);;
		stage.show();
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		System.out.println("has changed");

	}
	
	public SliderOne getSliderOne() {
		return this.sOne;
	}
	
	public SliderTwo getSliderTwo() {
		return this.sTwo;
	}
	
	public Scene getScene() {
		return this.scene;
	}
	
	public DistanceLabel getDistLabel() {
		return this.label;
	}

}
