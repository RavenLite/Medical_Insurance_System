/**
 * 
 */
package stage;

import java.io.IOException;

import data.Recipe;
import data.TreatmentInfo;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import view.AddInfo3StageController;
import view.Main;

/**
 * @author dell
 *
 */
public class AddInfo3Stage {
	private static Stage stage = new Stage();

	public static Stage getStage(String ID, String name, TreatmentInfo treatmentInfo, Recipe recipe) {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("AddInfo3Stage.fxml"));
		try {
			AnchorPane loginView = (AnchorPane) loader.load();
			Scene scene = new Scene(loginView);
			AddInfo3StageController con=loader.getController();
			con.setMain(stage, ID, name, treatmentInfo, recipe);
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
