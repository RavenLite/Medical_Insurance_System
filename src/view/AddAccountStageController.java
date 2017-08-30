/**
 * 
 */package view;

import data.Account;
import data.Persistence;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import stage.AddAccountStage;

/**
 * @author dell
 *
 */
public class AddAccountStageController {
	@FXML
	private TextField accountName;
	@FXML
	private TextField password;
	
	public void confirm() throws Exception {
		Persistence p=Persistence.getObjs();
		Account account = new Account();
		account.setAccountName(accountName.getText());
		account.setAccountPassword(password.getText());
		p.saveAccount(accountName.getText(), account);
		Persistence.saveToFile();
		AddAccountStage.getStage().close();
	}
}
