package view;

import data.Item;
import data.Medicine;
import data.Persistence;
import data.Recipe;
import data.Service;
import data.Treatment;
import data.TreatmentInfo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import stage.AddInfo2Stage;
import stage.AddInfo3Stage;

/**
 * @author dell
 *
 */
public class AddInfo2StageController {
	@FXML
	private Label ID1;
	@FXML
	private Label ID2;
	@FXML
	private Label name1;
	@FXML
	private Label name2;
	@FXML
	private TableView<Medicine> medicineInfo;
	@FXML
	private TableColumn<Medicine, String> medicineID;
	@FXML
	private TableColumn<Medicine, String> medicineName;

	@FXML
	private TableView<Treatment> treatmentInfo;
	@FXML
	private TableColumn<Treatment, String> treatmentID;
	@FXML
	private TableColumn<Treatment, String> treatmentName;

	@FXML
	private TableView<Service> serviceInfo;
	@FXML
	private TableColumn<Service, String> serviceID;
	@FXML
	private TableColumn<Service, String> serviceName;

	@FXML
	private Label itemID;
	@FXML
	private Label itemName;
	@FXML
	private TextField price1;
	@FXML
	private TextField num1;

	private ObservableList<Medicine> medicineData = FXCollections.observableArrayList();
	private ObservableList<Treatment> treatmentData = FXCollections.observableArrayList();
	private ObservableList<Service> serviceData = FXCollections.observableArrayList();

	private Stage stage;
	private TreatmentInfo treatmentInfos;
	private Recipe recipe=new Recipe();

	public void setMain(Stage stage, String ID, String name, TreatmentInfo treatmentInfos) {
		this.stage = stage;
		this.treatmentInfos = treatmentInfos;
		ID1.setText(ID);
		name1.setText(name);
	}

	@FXML
	public void initialize() {
		Persistence p = Persistence.getObjs();

		for (Treatment value : p.getTreatmentMap().values()) {
			treatmentData.add(value);
		}
		treatmentID.setCellValueFactory(cellData -> cellData.getValue().getID2());
		treatmentName.setCellValueFactory(cellData -> cellData.getValue().getName2());
		treatmentInfo.setItems(getTreatmentData());

		for (Medicine value : p.getMedicineMap().values()) {
			medicineData.add(value);
		}
		medicineID.setCellValueFactory(cellData -> cellData.getValue().getID2());
		medicineName.setCellValueFactory(cellData -> cellData.getValue().getName2());
		medicineInfo.setItems(getMedicineData());
		showMedicineDetails(null);
		medicineInfo.getSelectionModel().selectedItemProperty()
				.addListener((observable, oldValue, newValue) -> showMedicineDetails(newValue));

		for (Service value : p.getServiceMap().values()) {
			serviceData.add(value);
		}
		serviceID.setCellValueFactory(cellData -> cellData.getValue().getID2());
		serviceName.setCellValueFactory(cellData -> cellData.getValue().getName2());
		serviceInfo.setItems(getServiceData());
	}

	public void showMedicineDetails(Medicine medicine) {
		if (medicine != null) {
			itemID.setText(medicine.getID());
			itemName.setText(medicine.getName());
		} else {
			itemID.setText("");
			itemName.setText("");
		}
	}

	public ObservableList<Medicine> getMedicineData() {
		return medicineData;
	}

	public ObservableList<Treatment> getTreatmentData() {
		return treatmentData;
	}

	public ObservableList<Service> getServiceData() {
		return serviceData;
	}

	// 点击“添加”按钮，将选中药品信息添加到处方中
	@FXML
	public void addItem1() {
		Item item = new Item();
		item.setID(itemID.getText());
		item.setName(itemName.getText());
		item.setPrice(price1.getText());
		item.setNum(num1.getText());
		recipe.getItems().add(item);
	}

	// 点击“预结算”按钮——打开预结算界面
	@FXML
	public void preCalculate() {
		AddInfo2Stage.getStage(ID1.getText(), name1.getText(), treatmentInfos).close();
		AddInfo3Stage.getStage(ID1.getText(), name1.getText(), treatmentInfos, recipe);
	}
	@FXML
	private TextField itemID2;
	@FXML
	private TextField itemName2;
	@FXML
	private TextField itemPrice2;
	@FXML
	private TextField itemNum2;
	
	public void addItem2() {
		Item item = new Item();
		item.setID(itemID2.getText());
		item.setName(itemName2.getText());
		item.setPrice(itemPrice2.getText());
		item.setNum(itemNum2.getText());
		recipe.getItems().add(item);
	}
	
}
