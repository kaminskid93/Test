
import model.Model;
import view.*;

public class Controller {

	public static View view;
	public static Model model;
	
	public Controller() {
		this.view = new View();
		this.model = new Model();
	}

	public static void main(String[] args) {
		Controller control = new Controller();
		
		control.view.main(args);
		
	}
}
