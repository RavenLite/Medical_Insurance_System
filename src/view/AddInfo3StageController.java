/**
 * 
 */package view;

import data.Item;
import data.Persistence;
import data.Recipe;
import data.Record;
import data.TreatmentInfo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import stage.AddInfo3Stage;
import stage.AddInfo4Stage;

/**
 * @author dell
 *
 */
public class AddInfo3StageController {
	@FXML
	private TableView<Item> itemInfo;
	@FXML
	private TableColumn<Item, String> itemID;
	@FXML
	private TableColumn<Item, String> itemName;
	@FXML
	private TableColumn<Item, String> itemPrice;
	@FXML
	private TableColumn<Item, String> itemNum;
	@FXML 
	private TextField money;
	
	private ObservableList<Item> itemData = FXCollections.observableArrayList();
	
	private Stage stage;
	private String ID;
	private String name;
	private TreatmentInfo treatmentInfos=new TreatmentInfo();
	private Recipe recipes=new Recipe();
	
	public void setMain(Stage stage, String ID, String name, TreatmentInfo treatmentInfos, Recipe recipes) {
		this.stage = stage;
		this.ID=ID;
		this.name=name;
		this.treatmentInfos = treatmentInfos;
		this.recipes = recipes;
		initialize();
	}
	
	public void initialize() {
		
		for(int i = 0; i<recipes.getItems().size(); i++){
			itemData.add(recipes.getItems().get(i));
		}
		itemID.setCellValueFactory(cellData -> cellData.getValue().getID2());
		itemName.setCellValueFactory(cellData -> cellData.getValue().getName2());
		itemPrice.setCellValueFactory(cellData -> cellData.getValue().getPrice2());
		itemNum.setCellValueFactory(cellData -> cellData.getValue().getNum2());
		itemInfo.setItems(getItemData());
		float money2=0;
		Float temp = null;
		for(int i = 0; i<recipes.getItems().size(); i++){
			money2+=(temp.parseFloat(recipes.getItems().get(i).getPrice()))*(temp.parseFloat(recipes.getItems().get(i).getNum()));
		}
		money.setText(String.valueOf(money2));
		recipes.setMoney(money2);
	}
	public ObservableList<Item> getItemData() {
		return itemData;
	}
	@FXML
	public void calculate() throws Exception {
		Persistence p = Persistence.getObjs();
		Record tempRecord=new Record();
		tempRecord.setRecipe(recipes);
		tempRecord.setTreatmentInfo(treatmentInfos);
		p.getPerson(ID).getRecord().add(tempRecord);
		Persistence.saveToFile();
		AddInfo3Stage.getStage(ID, name, treatmentInfos, recipes).close();
		AddInfo4Stage.getStage(ID, name, tempRecord);
	}
	@FXML
	public void exit() {
		AddInfo3Stage.getStage(ID, name, treatmentInfos, recipes).close();
	}
}
