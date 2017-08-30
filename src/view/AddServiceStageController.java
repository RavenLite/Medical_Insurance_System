/**
 * 
 */
package view;

import data.Persistence;
import data.Service;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import stage.AddServiceStage;

/**
 * @author dell
 *
 */
public class AddServiceStageController {
	@FXML
	private TextField ID;
	@FXML
	private TextField name;
	@FXML
	private ChoiceBox<String> chargeClass;
	@FXML
	private TextField remark;
	@FXML
	private TextField restrictedScope;
	public void initialize() {
		chargeClass.setItems(FXCollections.observableArrayList("特检费","输氧费","治疗费","输血费","特治费","医疗服务费",
				"手术费","麻药费","产前检查费","材料费","新生儿费","内置材料","其他费"));
		}
	public void saveService() throws Exception {
		Service temp= new Service(ID.getText(), name.getText(), chargeClass.getValue(), remark.getText(),
				restrictedScope.getText());
		Persistence p = Persistence.getObjs();
		p.saveService(ID.getText(), temp);
		Persistence.saveToFile();
		AddServiceStage.getStage().close();
	}
}