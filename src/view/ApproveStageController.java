/**
 * 
 */
package view;

import data.Approve;
import data.Persistence;
import data.Person;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
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
public class ApproveStageController {
	@FXML
	private TextField code;
	@FXML
	private TextField personID;
	@FXML
	private TextField classof;
	@FXML
	private TextField startDate;
	@FXML
	private TextField stopDate;
	@FXML
	private TextField hospitalID;
	@FXML
	private TextField approveAdvice;
	@FXML
	private TextField approvePerson;
	@FXML
	private TextField approveDate;
	@FXML
	private TextField remark;
	
	@FXML
	private TextField ID;
	@FXML
	private TextField name;
	
	@FXML
	private TextField searchID;
	
	
	
	public void searchPerson() {
		Persistence p = Persistence.getObjs();
		Person temp = new Person();
		for (String key : p.getPersonMap().keySet()) {
			if (key.equals(searchID.getText())) {
				temp = p.getPerson(key);
			}
			ID.setText(temp.getID2());
			name.setText(temp.getName2());
		}
	}
	public void addApprove() throws Exception {
		Approve approve = new Approve();
		approve.setCode(code.getText());
		approve.setPersonID(personID.getText());
		approve.setClassof(classof.getText());
		approve.setStartDate(startDate.getText());
		approve.setStopDate(stopDate.getText());
		approve.setHospitalID(hospitalID.getText());
		approve.setApproveAdvice(approveAdvice.getText());
		approve.setApprovePerson(approvePerson.getText());
		approve.setApproveDate(approveDate.getText());
		approve.setRemark(remark.getText());
		Persistence p = Persistence.getObjs();
		p.getPerson(ID.getText()).setApprove(approve);
		Persistence.saveToFile();
	}
	
	
	
	// Ò³ÃæÌø×ª
	public void charge() {
		ApproveStage.getStage().close();
		ChargeStage.getStage();
	}

	public void approve() {
		ApproveStage.getStage().close();
		ApproveStage.getStage();
	}

	public void search() {
		ApproveStage.getStage().close();
		SearchStage.getStage();
	}

	public void publics() {
		ApproveStage.getStage().close();
		PublicsStage.getStage();
	}

	public void info() {
		ApproveStage.getStage().close();
		InfoStage.getStage();
	}

	public void refresh() {
		ApproveStage.getStage().close();
		ApproveStage.getStage();
	}

	public void homepage() {
		ApproveStage.getStage().close();
		MainStage.getStage();
	}

	public void setting() {
		SettingStage.getStage();
	}
	
}
