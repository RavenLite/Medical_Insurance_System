package view;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import stage.WelcomeStage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.getIcons().add(new Image("file:image/logo.jpg"));
			primaryStage=WelcomeStage.getStage();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
