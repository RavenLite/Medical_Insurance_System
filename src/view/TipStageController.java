package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import stage.TipStage;

public class TipStageController {
	@FXML
	private Label tip;
	public void ok() {
		TipStage.getStage("temp").close();
	}
	public void setMessage() {
		
	}
}
