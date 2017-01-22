package view;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class View {

	private SliderOne sOne;
	private SliderTwo sTwo;
	private DistanceLabel label;
	private GridPane grid;
	private Scene scene;
	


	public View() {
		//setup the GridPane
		grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		
		//setup the Sliders and the Label with model
		sOne = new SliderOne();
		sTwo = new SliderTwo();
//		label = new DistanceLabel();

		//add elements to the GridPane
		grid.add(sOne, 0, 1);
		grid.add(sTwo, 0, 2);
//		grid.add(label, 0, 0);
		
		scene = new Scene(grid, 450, 450);
	}

	public void show(Stage stage) {
		stage.setScene(scene);;
		stage.show();
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
