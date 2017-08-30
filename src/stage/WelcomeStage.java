/**
 * 
 */package stage;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import view.Main;

/**
 * @author dell
 *
 */
 public class WelcomeStage {
		private static Stage stage= new Stage();
		public static Stage getStage(){
			FXMLLoader loader = new FXMLLoader();//
			loader.setLocation(Main.class.getResource("WelcomeStage.fxml"));
		    try {
				AnchorPane loginView = (AnchorPane) loader.load();
				Scene scene = new Scene(loginView);
				stage.setScene(scene);
				stage.setTitle("»¶Ó­");
				stage.getIcons().add(new Image("file:image/logo.jpg"));
				stage.show();
			} catch (IOException e) {
				e.printStackTrace();
			}		
			return stage;		
		}
	}