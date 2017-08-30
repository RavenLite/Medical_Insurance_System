/**
 * 
 */package view;

import data.Company;
import data.Persistence;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import stage.AddCompanyStage;

/**
 * @author dell
 *
 */
public class AddCompanyStageController {
	@FXML
	private TextField ID;
	@FXML
	private TextField name;
	@FXML
	private TextField classof;
	@FXML
	private TextField address;
	@FXML
	private TextField zipCode;
	@FXML
	private TextField phone;
	
	public void saveCompany() throws Exception {
		Company temp= new Company(ID.getText(), name.getText(), classof.getText(), address.getText(),
				zipCode.getText(), phone.getText());
		Persistence p = Persistence.getObjs();
		p.saveCompany(ID.getText(), temp);
		Persistence.saveToFile();
		AddCompanyStage.getStage().close();
	}
}
