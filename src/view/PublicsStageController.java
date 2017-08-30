/**
 * 
 */
package view;

import data.Company;
import data.Persistence;
import data.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import stage.AddCompanyStage;
import stage.AddPersonStage;
import stage.ApproveStage;
import stage.ChargeStage;
import stage.InfoStage;
import stage.MainStage;
import stage.PublicsStage;
import stage.SearchStage;
import stage.SettingStage;

/**
 * 此类是公共业务界面控制器
 * 
 * @author Raven
 *
 */
public class PublicsStageController {
	// 个人信息相关属性
	@FXML
	private TableView<Person> personTable;
	@FXML
	private TableColumn<Person, String> IDt;
	@FXML
	private TableColumn<Person, String> cardCodet;
	@FXML
	private TableColumn<Person, String> namet;
	@FXML
	private TableColumn<Person, String> gendert;
	@FXML
	private TableColumn<Person, String> birthdayt;
	@FXML
	private TableColumn<Person, String> dateofWorkt;
	@FXML
	private TableColumn<Person, String> dateofRetirementt;
	@FXML
	private TableColumn<Person, String> accountAddresst;
	@FXML
	private TableColumn<Person, String> companyIDt;
	@FXML
	private TableColumn<Person, String> socialSecurityt;
	@FXML
	private TableColumn<Person, String> hospitalIDt;
	@FXML
	private TableColumn<Person, String> remarkt;

	@FXML
	private TextField searchID;
	@FXML
	private TextField searchName;

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

	// 单位信息相关属性
	@FXML
	private TableView<Company> companyTable;
	@FXML
	private TableColumn<Company, String> IDs;
	@FXML
	private TableColumn<Company, String> names;
	@FXML
	private TableColumn<Company, String> classofs;
	@FXML
	private TableColumn<Company, String> addresss;
	@FXML
	private TableColumn<Company, String> zipCodes;
	@FXML
	private TableColumn<Company, String> phones;

	@FXML
	private TextField searchID2;
	@FXML
	private TextField searchName2;

	@FXML
	private TextField ID2;
	@FXML
	private TextField name2;
	@FXML
	private TextField classof2;
	@FXML
	private TextField address2;
	@FXML
	private TextField zipCode2;
	@FXML
	private TextField phone2;

	private ObservableList<Person> personData = FXCollections.observableArrayList();
	private ObservableList<Company> companyData = FXCollections.observableArrayList();

	@FXML
	private void initialize() {
		Persistence p = Persistence.getObjs();
		// 个人信息展示
		for (Person value : p.getPersonMap().values()) {
			personData.add(value);
		}
		IDt.setCellValueFactory(cellData -> cellData.getValue().getID());
		cardCodet.setCellValueFactory(cellData -> cellData.getValue().getCardCode());
		namet.setCellValueFactory(cellData -> cellData.getValue().getName());
		gendert.setCellValueFactory(cellData -> cellData.getValue().getGender());
		birthdayt.setCellValueFactory(cellData -> cellData.getValue().getBirthday());
		dateofWorkt.setCellValueFactory(cellData -> cellData.getValue().getDateofWork());
		dateofRetirementt.setCellValueFactory(cellData -> cellData.getValue().getDateofRetirement());
		accountAddresst.setCellValueFactory(cellData -> cellData.getValue().getAccountAddress());
		companyIDt.setCellValueFactory(cellData -> cellData.getValue().getCompanyID());
		socialSecurityt.setCellValueFactory(cellData -> cellData.getValue().getSocialSecurity());
		hospitalIDt.setCellValueFactory(cellData -> cellData.getValue().getHospitalID());
		remarkt.setCellValueFactory(cellData -> cellData.getValue().getRemark());
		personTable.setItems(getPersonData());
		/// 清空TextField区域
		showPersonDetails(null);
		personTable.getSelectionModel().selectedItemProperty()
				.addListener((observable, oldValue, newValue) -> showPersonDetails(newValue));

		// 单位信息展示
		for (Company value : p.getCompanyMap().values()) {
			companyData.add(value);
		}
		IDs.setCellValueFactory(cellData -> cellData.getValue().getID());
		names.setCellValueFactory(cellData -> cellData.getValue().getName());
		classofs.setCellValueFactory(cellData -> cellData.getValue().getClassof());
		addresss.setCellValueFactory(cellData -> cellData.getValue().getAddress());
		zipCodes.setCellValueFactory(cellData -> cellData.getValue().getZipCode());
		phones.setCellValueFactory(cellData -> cellData.getValue().getPhone());
		companyTable.setItems(getCompanyData());
		/// 清空TextField区域
		showCompanyDetails(null);
		companyTable.getSelectionModel().selectedItemProperty()
				.addListener((observable, oldValue, newValue) -> showCompanyDetails(newValue));
	}

	public ObservableList<Person> getPersonData() {
		return personData;
	}

	private void showPersonDetails(Person person) {
		if (person != null) {
			// Fill the labels with info from the person object.
			ID.setText(person.getID2());
			cardCode.setText(person.getCardCode2());
			name.setText(person.getName2());
			gender.setText(person.getGender2());
			birthday.setText(person.getBirthday2());
			dateofWork.setText(person.getDateofWork2());
			dateofRetirement.setText(person.getDateofRetirement2());
			accountAddress.setText(person.getAccountAddress2());
			companyID.setText(person.getCompanyID2());
			socialSecurity.setText(person.getSocialSecurity2());
			hospitalID.setText(person.getHospitalID2());
			remark.setText(person.getRemark2());

		} else {
			// Person is null, remove all the text.
			ID.setText("");
			cardCode.setText("");
			name.setText("");
			gender.setText("");
			birthday.setText("");
			dateofWork.setText("");
			dateofRetirement.setText("");
			accountAddress.setText("");
			companyID.setText("");
			socialSecurity.setText("");
			hospitalID.setText("");
			remark.setText("");
		}
	}

	public void deletePerson() throws Exception {
		Persistence p = Persistence.getObjs();
		p.deletePerson(ID.getText());
		Persistence.saveToFile();
	}

	public void modifyPerson() throws Exception {
		Person temp = new Person();
		temp.setID(ID.getText());
		temp.setCardCode(cardCode.getText());
		temp.setName(name.getText());
		temp.setGender(gender.getText());
		temp.setBirthday(birthday.getText());
		temp.setDateofWork(dateofWork.getText());
		temp.setDateofRetirement(dateofRetirement.getText());
		temp.setAccountAddress(accountAddress.getText());
		temp.setCompanyID(companyID.getText());
		temp.setSocialSecurity(socialSecurity.getText());
		temp.setHospitalID(hospitalID.getText());
		temp.setRemark(remark.getText());
		Persistence p = Persistence.getObjs();
		p.deletePerson(ID.getText());
		p.getPersonMap().put(temp.getID2(), temp);
		Persistence.saveToFile();
	}

	public void searchPerson() throws Exception {
		Persistence p = Persistence.getObjs();
		Person temp = new Person();
		for (String key : p.getPersonMap().keySet()) {
			if (key.equals(searchID.getText())) {
				temp = p.getPerson(key);
				ID.setText(temp.getID2());
				cardCode.setText(temp.getCardCode2());
				name.setText(temp.getName2());
				gender.setText(temp.getGender2());
				birthday.setText(temp.getBirthday2());
				dateofWork.setText(temp.getDateofWork2());
				dateofRetirement.setText(temp.getDateofRetirement2());
				accountAddress.setText(temp.getAccountAddress2());
				companyID.setText(temp.getCompanyID2());
				socialSecurity.setText(temp.getSocialSecurity2());
				hospitalID.setText(temp.getHospitalID2());
				remark.setText(temp.getRemark2());
			}
		}
		if (!p.getMedicineMap().containsKey(searchID.getText())) {
			System.out.println("Nope!");
		}
	}

	private int existNumber;

	public void searchPersonPro() throws Exception {
		existNumber = 0;
		Persistence p = Persistence.getObjs();
		Person temp = new Person();
		for (Person value : p.getPersonMap().values()) {
			if (value.getName2().equals(searchName.getText())) {
				temp = value;
				ID.setText(temp.getID2());
				cardCode.setText(temp.getCardCode2());
				name.setText(temp.getName2());
				gender.setText(temp.getGender2());
				birthday.setText(temp.getBirthday2());
				dateofWork.setText(temp.getDateofWork2());
				dateofRetirement.setText(temp.getDateofRetirement2());
				accountAddress.setText(temp.getAccountAddress2());
				companyID.setText(temp.getCompanyID2());
				socialSecurity.setText(temp.getSocialSecurity2());
				hospitalID.setText(temp.getHospitalID2());
				remark.setText(temp.getRemark2());
			}
		}
		if (existNumber == 0) {
			System.out.println("Nope!");
		}
	}

	//

	public ObservableList<Company> getCompanyData() {
		return companyData;
	}

	private void showCompanyDetails(Company company) {
		if (company != null) {
			ID2.setText(company.getID2());
			name2.setText(company.getName2());
			classof2.setText(company.getClassof2());
			address2.setText(company.getAddress2());
			zipCode2.setText(company.getZipCode2());
			phone2.setText(company.getPhone2());

		} else {
			ID2.setText("");
			name2.setText("");
			classof2.setText("");
			address2.setText("");
			zipCode2.setText("");
			phone2.setText("");
		}
	}

	public void deleteCompany() throws Exception {
		Persistence p = Persistence.getObjs();
		p.deleteCompany(ID2.getText());
		Persistence.saveToFile();
	}

	public void modifyCompany() throws Exception {
		Company temp = new Company();
		temp.setID(ID2.getText());
		temp.setName(name2.getText());
		temp.setClassof(classof2.getText());
		temp.setAddress(address2.getText());
		temp.setZipCode(zipCode2.getText());
		temp.setPhone(phone2.getText());
		Persistence p = Persistence.getObjs();
		p.deleteCompany(ID2.getText());
		p.getCompanyMap().put(temp.getID2(), temp);
		Persistence.saveToFile();
	}

	public void searchCompany() throws Exception {
		Persistence p = Persistence.getObjs();
		Company temp = new Company();
		for (String key : p.getCompanyMap().keySet()) {
			if (key.equals(searchID2.getText())) {
				temp = p.getCompany(key);
				ID2.setText(temp.getID2());
				name2.setText(temp.getName2());
				classof2.setText(temp.getClassof2());
				address2.setText(temp.getAddress2());
				zipCode2.setText(temp.getZipCode2());
				phone2.setText(temp.getPhone2());
			}
		}
		if (!p.getCompanyMap().containsKey(searchID2.getText())) {
			System.out.println("Nope!");
		}
	}

	private int existNumber2;

	public void searchCompanyPro() throws Exception {
		existNumber2 = 0;
		Persistence p = Persistence.getObjs();
		Company temp = new Company();
		for (Company value : p.getCompanyMap().values()) {
			if (value.getName2().equals(searchName2.getText())) {
				temp = value;
				ID2.setText(temp.getID2());
				name2.setText(temp.getName2());
				classof2.setText(temp.getClassof2());
				address2.setText(temp.getAddress2());
				zipCode2.setText(temp.getZipCode2());
				phone2.setText(temp.getPhone2());
			}
		}
		if (existNumber2 == 0) {
			System.out.println("Nope!");
		}
	}

	// 页面跳转
	public void charge() {
		PublicsStage.getStage().close();
		ChargeStage.getStage();
	}

	public void approve() {
		PublicsStage.getStage().close();
		ApproveStage.getStage();
	}

	public void search() {
		PublicsStage.getStage().close();
		SearchStage.getStage();
	}

	public void publics() {
		PublicsStage.getStage().close();
		PublicsStage.getStage();
	}

	public void info() {
		PublicsStage.getStage().close();
		InfoStage.getStage();
	}

	public void setting() {
		SettingStage.getStage();
	}

	public void addPerson() {
		AddPersonStage.getStage();
	}

	public void addCompany() {
		AddCompanyStage.getStage();
	}
	public void refresh() {
		PublicsStage.getStage().close();
		PublicsStage.getStage();
	}
	
	public void homepage() {
		PublicsStage.getStage().close();
		MainStage.getStage();
	}
}
