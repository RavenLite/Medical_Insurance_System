/**
 * 
 */
package view;

import data.Persistence;
import data.Person;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import stage.AddInfo1Stage;
import stage.ApproveStage;
import stage.ChargeStage;
import stage.InfoStage;
import stage.MainStage;
import stage.PublicsStage;
import stage.SearchStage;
import stage.SettingStage;

/**
 * @author dell
 *
 */
public class ChargeStageController {
	@FXML
	private TextField searchID;
	@FXML
	private TextField searchName;
	@FXML
	private Label ID;
	@FXML
	private Label name;
	@FXML
	private TextArea cardCode;
	@FXML
	private TextArea gender;
	@FXML
	private TextArea birthday;
	@FXML
	private TextArea classofMedicalPerson;
	@FXML
	private TextArea companyID;
	@FXML
	private TextArea companyName;
	@FXML
	private TextArea times;
	@FXML
	private TextArea center;
	@FXML
	private TextArea self;
	@FXML
	private TextArea total;
	@FXML 
	private TextField deleteNum;

	public void searchID() {
		Persistence p = Persistence.getObjs();
		Person temp = new Person();
		for (String key : p.getPersonMap().keySet()) {
			if (key.equals(searchID.getText())) {
				temp = p.getPerson(key);
				ID.setText(temp.getID2());
				name.setText(temp.getName2());
				cardCode.setText(temp.getCardCode2());
				gender.setText(temp.getGender2());
				birthday.setText(temp.getBirthday2());
				classofMedicalPerson.setText("医疗普通人员");
				companyID.setText(temp.getCompanyID2());
				for (String keys : p.getCompanyMap().keySet()) {
					if(keys.equals(temp.getCompanyID2())) {
						companyName.setText(p.getCompanyMap().get(keys).getName2()); 
					}
				}
				times.setText(String.valueOf(temp.getRecord().size()));
				total.setText("0");
				center.setText("0");
				self.setText("0");
			}
		}
		if (!p.getMedicineMap().containsKey(searchID.getText())) {
			System.out.println("Nope!");
		}
	}

	private int existNumber;

	public void searchName() throws Exception {
		existNumber = 0;
		Persistence p = Persistence.getObjs();
		Person temp = new Person();
		for (Person value : p.getPersonMap().values()) {
			if (value.getName2().equals(searchName.getText())) {
				temp = value;
				ID.setText(temp.getID2());
				name.setText(temp.getName2());
				cardCode.setText(temp.getCardCode2());
				gender.setText(temp.getGender2());
				birthday.setText(temp.getBirthday2());
				classofMedicalPerson.setText(temp.getClassofMedicalPerson2());
				companyID.setText(temp.getCompanyID2());
				for (String keys : p.getCompanyMap().keySet()) {
					if(keys.equals(temp.getCompanyID2())) {
						companyName.setText(p.getCompanyMap().get(keys).getName2()); 
					}
				}
			}
		}
		if (existNumber == 0) {
			System.out.println("Nope!");
		}
	}
	public void deleteInfo() {
		Persistence p=Persistence.getObjs();
		p.getPerson(ID.getText()).getRecord().remove(Integer.parseInt(deleteNum.getText()));
	}
	
	public void addInfo() {
		AddInfo1Stage.getStage(ID.getText(), name.getText());
	}
	// 页面跳转
	public void charge() {
		ChargeStage.getStage().close();
		ChargeStage.getStage();
	}

	public void approve() {
		ChargeStage.getStage().close();
		ApproveStage.getStage();
	}

	public void search() {
		ChargeStage.getStage().close();
		SearchStage.getStage();
	}

	public void publics() {
		ChargeStage.getStage().close();
		PublicsStage.getStage();
	}

	public void info() {
		ChargeStage.getStage().close();
		InfoStage.getStage();
	}

	public void refresh() {
		ChargeStage.getStage().close();
		ChargeStage.getStage();
	}

	public void homepage() {
		ChargeStage.getStage().close();
		MainStage.getStage();
	}

	public void setting() {
		SettingStage.getStage();
	}
}
