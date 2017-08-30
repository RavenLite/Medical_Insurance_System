/**
 * 
 */package stage;

import java.io.IOException;

import data.TreatmentInfo;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import view.AddInfo2StageController;
import view.Main;

/**
 * @author dell
 *
 */
public class AddInfo2Stage {
	private static Stage stage = new Stage();

	public static Stage getStage(String ID, String name, TreatmentInfo treatmentInfo) {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("AddInfo2Stage.fxml"));
		try {
			AnchorPane loginView = (AnchorPane) loader.load();
			Scene scene = new Scene(loginView);
			AddInfo2StageController con=loader.getController();
			con.setMain(stage, ID, name, treatmentInfo);
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
