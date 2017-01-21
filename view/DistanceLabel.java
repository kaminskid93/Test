package view;

import java.util.Observable;
import java.util.Observer;

import javafx.scene.Node;
import model.Model;
import javafx.scene.control.Label;

public class DistanceLabel extends Label implements Observer {

	private Model model;
	
	public DistanceLabel(Model model) {
		this.setText("Hallo, dies ist der Unit Converter 5000.");
		this.model = model;
	}


	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
		
	}

}
