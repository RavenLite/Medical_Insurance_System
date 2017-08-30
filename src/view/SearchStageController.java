/**
 * 
 */package view;


import data.Persistence;
import data.Person;
import data.Search;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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
public class SearchStageController {
	@FXML 
	private TextField searchID;
	@FXML
	private TableView<Search> searchInfo;
	@FXML
	private TableColumn<Search, String> IDs;
	@FXML
	private TableColumn<Search, String> names;
	@FXML
	private TableColumn<Search, String> companyIDs;
	@FXML
	private TableColumn<Search, String> birthdays;
	@FXML
	private TableColumn<Search, String> inCodes;
	@FXML
	private TableColumn<Search, String> inDates;
	@FXML
	private TableColumn<Search, String> outDates;
	@FXML
	private TableColumn<Search, String> diseases;
	
	private ObservableList<Search> searchData = FXCollections.observableArrayList();
	
	public void searchID() {
		Persistence p = Persistence.getObjs();
		Person temp = new Person();
		for (String key : p.getPersonMap().keySet()) {
			if (key.equals(searchID.getText())) {
				temp = p.getPerson(key);
			}
		}
		for(int i=0 ; i<temp.getRecord().size(); i++) {
		Search search=new Search();
		search.setID(temp.getID2());
		search.setName(temp.getName2());
		search.setCompanyID(temp.getCompanyID2());
		search.setBirthday(temp.getBirthday2());
		search.setInCode(temp.getRecord().get(i).getTreatmentInfo().getHospitalizationID());
		search.setInDate(temp.getRecord().get(i).getTreatmentInfo().getDateofEnterHospital());
		search.setOutDate(temp.getRecord().get(i).getTreatmentInfo().getDateofLeaveHospital());
		search.setDisease(temp.getRecord().get(i).getTreatmentInfo().getDiseaseID());
		searchData.add(search);
		}
		IDs.setCellValueFactory(cellData -> cellData.getValue().getID2());
		names.setCellValueFactory(cellData -> cellData.getValue().getName2());
		companyIDs.setCellValueFactory(cellData -> cellData.getValue().getCompanyID2());
		birthdays.setCellValueFactory(cellData -> cellData.getValue().getBirthday2());
		inCodes.setCellValueFactory(cellData -> cellData.getValue().getInCode2());
		inDates.setCellValueFactory(cellData -> cellData.getValue().getInDate2());
		outDates.setCellValueFactory(cellData -> cellData.getValue().getOutDate2());
		diseases.setCellValueFactory(cellData -> cellData.getValue().getDisease2());
		searchInfo.setItems(getSearchData());
	}
	public ObservableList<Search> getSearchData() {
		return searchData;
	}
	
	
	//Ò³ÃæÌø×ª
		public void charge() {
			SearchStage.getStage().close();
			ChargeStage.getStage();
		}
		public void approve() {
			SearchStage.getStage().close();
			ApproveStage.getStage();
		}
		public void search() {
			SearchStage.getStage().close();
			SearchStage.getStage();
		}
		public void publics() {
			SearchStage.getStage().close();
			PublicsStage.getStage();
		}
		public void info() {
			SearchStage.getStage().close();
			InfoStage.getStage();
		}
		public void refresh() {
			SearchStage.getStage().close();
			SearchStage.getStage();
		}
		public void homepage() {
			SearchStage.getStage().close();
			MainStage.getStage();
		}
		public void setting() {
			SettingStage.getStage();
		}
}
