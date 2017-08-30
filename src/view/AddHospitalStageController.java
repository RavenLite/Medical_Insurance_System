package view;

import data.Hospital;
import data.Persistence;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import stage.AddHospitalStage;

/**
 * @author dell
 *
 */
public class AddHospitalStageController {
	@FXML
	private TextField ID;
	@FXML
	private TextField name;
	@FXML
	private TextField level;
	@FXML
	private TextField institutionClass;
	@FXML
	private TextField zipCode;
	@FXML
	private TextField legalName;
	@FXML
	private TextField legalPhone;
	@FXML
	private TextField linkmanName;
	@FXML
	private TextField phone;
	@FXML
	private TextField linkmanPhone;
	@FXML
	private TextField address;
	@FXML
	private TextField remark;
	
	public void saveHospital() throws Exception {
		Hospital temp= new Hospital(ID.getText(), name.getText(), level.getText(), institutionClass.getText(),
				zipCode.getText(), legalName.getText(), legalPhone.getText(), linkmanName.getText(), phone.getText(), 
				linkmanPhone.getText(), address.getText(), remark.getText());
		Persistence p = Persistence.getObjs();
		p.saveHospital(ID.getText(), temp);
		Persistence.saveToFile();
		AddHospitalStage.getStage().close();
	}
}
