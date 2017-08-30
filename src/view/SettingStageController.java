/**
 * 
 */package view;

import javafx.fxml.FXML;
import stage.AddAccountStage;
import stage.SettingStage;

/**
 * @author dell
 *
 */
public class SettingStageController {
	@FXML
	public void addAccount() {
		SettingStage.getStage().close();
		AddAccountStage.getStage();
	}
	public void exit() {
		SettingStage.getStage().close();
	}
}
