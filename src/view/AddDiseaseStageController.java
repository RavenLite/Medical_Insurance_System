/**
 * 
 */package view;

import data.Disease;
import data.Persistence;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import stage.AddDiseaseStage;

public class AddDiseaseStageController {
	@FXML
	private TextField ID;
	@FXML
	private TextField name;
	@FXML
	private TextField classof;
	@FXML
	private TextField applyforReimbMark;
	@FXML
	private TextField remark;
	
	public void saveDisease() throws Exception {
		Disease temp= new Disease(ID.getText(), name.getText(), classof.getText(), applyforReimbMark.getText(),
				remark.getText());
		Persistence p = Persistence.getObjs();
		p.saveDisease(ID.getText(), temp);
		Persistence.saveToFile();
		AddDiseaseStage.getStage().close();
	}
}
