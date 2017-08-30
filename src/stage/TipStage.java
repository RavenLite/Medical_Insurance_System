package stage;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import view.Main;

public class TipStage {
	private static Stage stage= new Stage();
	public static Stage getStage(String message){
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("TipStage.fxml"));
	    try {
	    	AnchorPane loginView = (AnchorPane) loader.load();
			Scene scene = new Scene(loginView);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}		
		return stage;		
	}
}
