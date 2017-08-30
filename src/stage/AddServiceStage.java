/**
 * 
 */
package stage;

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
public class AddServiceStage {
	private static Stage stage = new Stage();

	public static Stage getStage() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("AddServiceStage.fxml"));
		try {
			AnchorPane loginView = (AnchorPane) loader.load();
			Scene scene = new Scene(loginView);
			stage.getIcons().add(new Image("file:image/logo.jpg"));
			stage.setTitle("沈阳市社会医疗保险管理局");
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return stage;
	}
}
