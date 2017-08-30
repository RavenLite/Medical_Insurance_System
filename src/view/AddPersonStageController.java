/**
 * 
 */package view;

import data.Persistence;
import data.Person;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import stage.AddPersonStage;

/**
 * @author dell
 *
 */
public class AddPersonStageController {
	@FXML
	private TextField ID;
	@FXML
	private TextField cardCode;
	@FXML
	private TextField name;
	@FXML
	private TextField gender;
	@FXML
	private TextField birthday;
	@FXML
	private TextField dateofWork;
	@FXML
	private TextField dateofRetirement;
	@FXML
	private TextField accountAddress;
	@FXML
	private TextField companyID;
	@FXML
	private TextField socialSecurity;
	@FXML
	private TextField hospitalID;
	@FXML
	private TextField remark;
	
	public void savePerson() throws Exception {
		Person temp= new Person(ID.getText(), cardCode.getText(), name.getText(), gender.getText(),
				birthday.getText(), dateofWork.getText(), dateofRetirement.getText(), accountAddress.getText(),
				companyID.getText(), socialSecurity.getText(), hospitalID.getText(), remark.getText());
		Persistence p = Persistence.getObjs();
		p.savePerson(ID.getText(), temp);
		Persistence.saveToFile();
		AddPersonStage.getStage().close();
	}
	
}
