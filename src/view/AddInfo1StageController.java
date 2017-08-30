/**
 * 
 */package view;

import data.Persistence;
import data.TreatmentInfo;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import stage.AddInfo1Stage;
import stage.AddInfo2Stage;

/**
 * @author dell
 *
 */
public class AddInfo1StageController {
	@FXML
	private Label IDs;
	@FXML
	private Label names;
	@FXML
	private TextField hospitalizationID;
	@FXML
	private TextField hospitalID;
	@FXML
	private TextField classofTreatment;
	@FXML
	private TextField dateofEnterHospital;
	@FXML
	private TextField dateofLeaveHospital;
	@FXML
	private TextField diseaseID;
	@FXML
	private TextField hospitalLevel;
	@FXML
	private TextField enterDiseaseID;
	@FXML
	private TextField enterDiseaseName;
	@FXML
	private TextField reasonLeavingHospital;
	
	private Stage stage;
	
	public void setMain(Stage stage, String ID, String name) {
		this.stage=stage;
		IDs.setText(ID);
		names.setText(name);
	}
	
	public void next() {
		TreatmentInfo treatmentInfo = new TreatmentInfo();
		treatmentInfo.setHospitalizationID(hospitalizationID.getText());
		treatmentInfo.setHospitalID(hospitalID.getText());
		treatmentInfo.setClassofTreatment(classofTreatment.getText());
		treatmentInfo.setDateofEnterHospital(dateofEnterHospital.getText());
		treatmentInfo.setDateofLeaveHospital(dateofLeaveHospital.getText());
		treatmentInfo.setDiseaseID(diseaseID.getText());
		treatmentInfo.setHospitalLevel(hospitalLevel.getText());
		treatmentInfo.setEnterDiseaseID(enterDiseaseID.getText());
		treatmentInfo.setEnterDiseaseName(enterDiseaseName.getText());
		treatmentInfo.setReasonLeavingHospital(reasonLeavingHospital.getText());
		AddInfo1Stage.getStage(IDs.getText(), names.getText()).close();
		AddInfo2Stage.getStage(IDs.getText(), names.getText(), treatmentInfo);
	}
}
