package view;

import model.Model;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class View extends Application {

	private SliderOne sOne;
	private SliderTwo sTwo;
	
	private Slider s1;
	private Slider s2;
	
	
	public void setSliderModel(Model model) {
		this.sOne.setModel(model);
		this.sTwo.setModel(model);
	}
	
		@Override
	public void start(Stage primaryStage) throws Exception {
			
//			sOne = new SliderOne();
//			sTwo = new SliderTwo();
			
			GridPane grid = new GridPane ();
//			grid.add(sOne, 1, 1);
//			grid.add(sTwo, 1, 2);
//			
			
			s1 = new Slider();
			s2 = new Slider();
			
		 
			Scene scene = new Scene(grid, 640, 480);
			primaryStage.setScene(scene);
			primaryStage.show();

	}
		
		public static void main(String[] args) {
			launch();
		}

}
