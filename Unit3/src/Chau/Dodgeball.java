package Chau;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Dodgeball extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Dodgeball");
		Button myButton = new Button ("Play");
		Button Button2 = new Button("Quit");
		
		HBox layout = new HBox();
		layout.getChildren().add(myButton);
		layout.getChildren().add(Button2);
		
//		VBox layout = new VBox();
//		layout.getChildren().add(myButton);
//		layout.getChildren().add(Button2);
		
		Scene scene = new Scene (layout, 1250, 875);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
