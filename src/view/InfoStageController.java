package view;

import data.Disease;
import data.Hospital;
import data.Medicine;
import data.Persistence;
import data.Service;
import data.Treatment;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import stage.AddDiseaseStage;
import stage.AddHospitalStage;
import stage.AddMedicineStage;
import stage.AddServiceStage;
import stage.AddTreatmentStage;
import stage.ApproveStage;
import stage.ChargeStage;
import stage.InfoStage;
import stage.MainStage;
import stage.PublicsStage;
import stage.SearchStage;
import stage.SettingStage;

public class InfoStageController {
	//页面跳转
	public void charge() {
		InfoStage.getStage().close();
		ChargeStage.getStage();
	}

	public void approve() {
		InfoStage.getStage().close();
		ApproveStage.getStage();
	}

	public void search() {
		InfoStage.getStage().close();
		SearchStage.getStage();
	}

	public void publics() {
		InfoStage.getStage().close();
		PublicsStage.getStage();
	}

	public void info() {
		InfoStage.getStage().close();
		InfoStage.getStage();
	}

	public void setting() {
		SettingStage.getStage();
	}
	
	//药品相关
	@FXML
	private TextField searchID;
	@FXML
	private TextField searchName;
	@FXML
	private TextField deleteID;
	private int existNumber;
	@FXML
	private TextArea ID;
	@FXML
	private TextArea name;
	@FXML
	private TextArea EngName;
	@FXML
	private TextArea chargeClass;
	@FXML
	private TextArea prescriptionMedicineMark;
	@FXML
	private TextArea chargeItemLevel;
	@FXML
	private TextArea dosageUnit;
	@FXML
	private TextArea ceilingPrice;
	@FXML
	private TextArea hospitalLevel;
	@FXML
	private TextArea hospitalPreparationMark;
	@FXML
	private TextArea approveMark;
	@FXML
	private TextArea form;
	@FXML
	private TextArea usageFrequency;
	@FXML
	private TextArea usageMethod;
	@FXML
	private TextArea unit;
	@FXML
	private TextArea specification;
	@FXML
	private TextArea limitNumberofDays;
	@FXML
	private TextArea tradeName;
	@FXML
	private TextArea factoryName;
	@FXML
	private TextArea SFDA;
	@FXML
	private TextArea remark;
	@FXML
	private TextArea NCC;
	@FXML
	private TextArea restrictedScope;
	@FXML
	private TextArea productionPlace;
	
	public void addMedicine() {
		AddMedicineStage.getStage();
	}

	public void deleteMedicine() throws Exception {
		Persistence p = Persistence.getObjs();
		p.deleteMedicine(deleteID.getText());
		Persistence.saveToFile();
	}

	public void searchMedicine() {
		Persistence p = Persistence.getObjs();
		Medicine temp = new Medicine();
		for (String key : p.getMedicineMap().keySet()) {
			if (key.equals(searchID.getText())) {
				temp = p.getMedicine(key);
				ID.setText(temp.getID());
				name.setText(temp.getName());
				EngName.setText(temp.getEngName());
				chargeClass.setText(temp.getChargeClass());
				prescriptionMedicineMark.setText(temp.getPrescriptionMedicineMark());
				chargeItemLevel.setText(temp.getChargeItemLevel());
				dosageUnit.setText(temp.getDosageUnit());
				ceilingPrice.setText(temp.getCeilingPrice());
				hospitalPreparationMark.setText(temp.getHospitalPreparationMark());
				approveMark.setText(temp.getApproveMark());
				hospitalLevel.setText(temp.getHospitalLevel());
				form.setText(temp.getForm());
				usageFrequency.setText(temp.getUsageFrequency());
				usageMethod.setText(temp.getUsageMethod());
				unit.setText(temp.getUnit());
				specification.setText(temp.getSpecification());
				limitNumberofDays.setText(temp.getLimitNumberofDays());
				tradeName.setText(temp.getTradeName());
				factoryName.setText(temp.getFactoryName());
				SFDA.setText(temp.getSFDA());
				remark.setText(temp.getRemark());
				NCC.setText(temp.getNCC());
				restrictedScope.setText(temp.getRestrictedScope());
				productionPlace.setText(temp.getProductionPlace());
			}
		}
		if (!p.getMedicineMap().containsKey(searchID.getText())) {
			System.out.println("Nope!");
		}
	}

	public void searchMedicinePro() {
		existNumber=0;
		Persistence p = Persistence.getObjs();
		Medicine temp = new Medicine();
		for (Medicine value : p.getMedicineMap().values()) {
			if (value.getName().equals(searchName.getText())) {
				temp = value;
				ID.setText(temp.getID());
				name.setText(temp.getName());
				EngName.setText(temp.getEngName());
				chargeClass.setText(temp.getChargeClass());
				prescriptionMedicineMark.setText(temp.getPrescriptionMedicineMark());
				chargeItemLevel.setText(temp.getChargeItemLevel());
				dosageUnit.setText(temp.getDosageUnit());
				ceilingPrice.setText(temp.getCeilingPrice());
				hospitalPreparationMark.setText(temp.getHospitalPreparationMark());
				approveMark.setText(temp.getApproveMark());
				hospitalLevel.setText(temp.getHospitalLevel());
				form.setText(temp.getForm());
				usageFrequency.setText(temp.getUsageFrequency());
				usageMethod.setText(temp.getUsageMethod());
				unit.setText(temp.getUnit());
				specification.setText(temp.getSpecification());
				limitNumberofDays.setText(temp.getLimitNumberofDays());
				tradeName.setText(temp.getTradeName());
				factoryName.setText(temp.getFactoryName());
				SFDA.setText(temp.getSFDA());
				remark.setText(temp.getRemark());
				NCC.setText(temp.getNCC());
				restrictedScope.setText(temp.getRestrictedScope());
				productionPlace.setText(temp.getProductionPlace());
				existNumber++;
			}
		}
		if(existNumber==0) {
			System.out.println("Nope!");
		}
	}

	public void modifyMedicine() throws Exception {
		Medicine temp = new Medicine();
		temp.setID(ID.getText());
		temp.setName(name.getText());
		temp.setEngName(EngName.getText());
		temp.setChargeClass(chargeClass.getText());
		temp.setPrescriptionMedicineMark(prescriptionMedicineMark.getText());
		temp.setChargeItemLevel(chargeItemLevel.getText());
		temp.setDosageUnit(dosageUnit.getText());
		temp.setCeilingPrice(ceilingPrice.getText());
		temp.setHospitalPreparationMark(hospitalPreparationMark.getText());
		temp.setApproveMark(approveMark.getText());
		temp.setHospitalLevel(hospitalLevel.getText());
		temp.setForm(form.getText());
		temp.setUsageFrequency(usageFrequency.getText());
		temp.setUsageMethod(usageMethod.getText());
		temp.setUnit(unit.getText());
		temp.setSpecification(specification.getText());
		temp.setLimitNumberofDays(limitNumberofDays.getText());
		temp.setTradeName(tradeName.getText());
		temp.setFactoryName(factoryName.getText());
		temp.setSFDA(SFDA.getText());
		temp.setRemark(remark.getText());
		temp.setNCC(NCC.getText());
		temp.setProductionPlace(productionPlace.getText());
		Persistence p = Persistence.getObjs();
		p.deleteMedicine(ID.getText());
		p.getMedicineMap().put(temp.getID(), temp);
		Persistence.saveToFile();
	}
	
	
	//诊疗设备相关
	@FXML
	private TextField searchID2;
	@FXML
	private TextField searchName2;
	@FXML
	private TextField deleteID2;
	private int existNumber2;
	@FXML
	private TextArea ID2;
	@FXML
	private TextArea name2;
	@FXML
	private TextArea chargeClass2;
	@FXML
	private TextArea chargeItemLevel2;
	@FXML
	private TextArea hospitalLevel2;
	@FXML
	private TextArea approveMark2;
	@FXML
	private TextArea unit2;
	@FXML
	private TextArea manufacturer2;
	@FXML
	private TextArea remark2;
	@FXML
	private TextArea restrictedScope2;
	
	public void addTreatment() {
		AddTreatmentStage.getStage();
	}

	public void deleteTreatment() throws Exception {
		Persistence p = Persistence.getObjs();
		p.deleteTreatment(deleteID2.getText());
		Persistence.saveToFile();
	}
	
	public void searchTreatment() {
		Persistence p = Persistence.getObjs();
		Treatment temp = new Treatment();
		for (String key : p.getTreatmentMap().keySet()) {
			if (key.equals(searchID2.getText())) {
				temp = p.getTreatment(key);
				ID2.setText(temp.getID());
				name2.setText(temp.getName());
				chargeClass2.setText(temp.getChargeClass());
				chargeItemLevel2.setText(temp.getChargeItemLevel());
				hospitalLevel2.setText(temp.getChargeItemLevel());
				approveMark2.setText(temp.getApproveMark());
				unit2.setText(temp.getUnit());
				manufacturer2.setText(temp.getManufacturer());
				remark2.setText(temp.getRemark());
				restrictedScope2.setText(temp.getRestrictedScope());
			}
		}
		if (!p.getTreatmentMap().containsKey(searchID2.getText())) {
			System.out.println("Nope!");
		}
	}
	public void searchTreatmentPro() {
		existNumber2=0;
		Persistence p = Persistence.getObjs();
		Treatment temp = new Treatment();
		for (Treatment value : p.getTreatmentMap().values()) {
			if (value.getName().equals(searchName2.getText())) {
				temp = value;
				ID2.setText(temp.getID());
				name2.setText(temp.getName());
				chargeClass2.setText(temp.getChargeClass());
				chargeItemLevel2.setText(temp.getChargeItemLevel());
				hospitalLevel2.setText(temp.getChargeItemLevel());
				approveMark2.setText(temp.getApproveMark());
				unit2.setText(temp.getUnit());
				manufacturer2.setText(temp.getManufacturer());
				remark2.setText(temp.getRemark());
				restrictedScope2.setText(temp.getRestrictedScope());
				existNumber2++;
			}
		}
		if(existNumber2==0) {
			System.out.println("Nope!");
		}
	}
	public void modifyTreatment() throws Exception {
		Treatment temp = new Treatment();
		temp.setID(ID2.getText());
		temp.setName(name2.getText());
		temp.setChargeClass(chargeClass2.getText());
		temp.setChargeItemLevel(chargeItemLevel2.getText());
		temp.setHospitalLevel(hospitalLevel2.getText());
		temp.setApproveMark(approveMark2.getText());
		temp.setUnit(unit2.getText());
		temp.setManufacturer(manufacturer2.getText());
		temp.setRemark(remark2.getText());
		temp.setRestrictedScope(restrictedScope2.getText());
		Persistence p = Persistence.getObjs();
		p.deleteTreatment(ID.getText());
		p.getTreatmentMap().put(temp.getID(), temp);
		Persistence.saveToFile();
	}
	
	//服务设施相关
	@FXML
	private TextField searchID3;
	@FXML
	private TextField searchName3;
	@FXML
	private TextField deleteID3;
	private int existNumber3;
	
	@FXML
	private TextArea ID3;
	@FXML
	private TextArea name3;
	@FXML
	private TextArea chargeClass3;
	@FXML
	private TextArea remark3;
	@FXML
	private TextArea restrictedScope3;
	public void addService() {
		AddServiceStage.getStage();
	}

	public void deleteService() throws Exception {
		Persistence p = Persistence.getObjs();
		p.deleteService(deleteID3.getText());
		Persistence.saveToFile();
	}
	public void searchService() {
		Persistence p = Persistence.getObjs();
		Service temp = new Service();
		for (String key : p.getServiceMap().keySet()) {
			if (key.equals(searchID3.getText())) {
				temp = p.getService(key);
				ID3.setText(temp.getID());
				name3.setText(temp.getName());
				chargeClass3.setText(temp.getChargeClass());
				remark3.setText(temp.getRemark());
				restrictedScope.setText(temp.getRestrictedScope());
			}
		}
		if (!p.getServiceMap().containsKey(searchID3.getText())) {
			System.out.println("Nope!");
		}
	}
	public void searchServicePro() {
		existNumber3=0;
		Persistence p = Persistence.getObjs();
		Service temp = new Service();
		for (Service value : p.getServiceMap().values()) {
			if (value.getName().equals(searchName3.getText())) {
				temp = value;
				ID3.setText(temp.getID());
				name3.setText(temp.getName());
				chargeClass3.setText(temp.getChargeClass());
				remark3.setText(temp.getRemark());
				restrictedScope.setText(temp.getRestrictedScope());
				existNumber3++;
			}
		}
		if(existNumber3==0) {
			System.out.println("Nope!");
		}
	}
	public void modifyService() throws Exception {
		Service temp = new Service();
		temp.setID(ID3.getText());
		temp.setName(name3.getText());
		temp.setChargeClass(chargeClass3.getText());
		temp.setRemark(remark3.getText());
		temp.setRestrictedScope(restrictedScope3.getText());
		Persistence p = Persistence.getObjs();
		p.deleteService(ID.getText());
		p.getServiceMap().put(temp.getID(), temp);
		Persistence.saveToFile();
	}
	
	//Hospital相关
	@FXML
	private TextField searchID4;
	@FXML
	private TextField searchName4;
	@FXML
	private TextField deleteID4;
	private int existNumber4;
	
	@FXML
	private TextArea ID4;
	@FXML
	private TextArea name4;
	@FXML
	private TextArea level4;
	@FXML
	private TextArea institutionClass4;
	@FXML
	private TextArea zipCode4;
	@FXML
	private TextArea legalName4;
	@FXML
	private TextArea legalPhone4;
	@FXML
	private TextArea linkmanName4;
	@FXML
	private TextArea phone4;
	@FXML
	private TextArea linkmanPhone4;
	@FXML
	private TextArea address4;
	@FXML
	private TextArea remark4;
	
	public void addHostipal() {
		AddHospitalStage.getStage();
	}

	public void deleteHostipal() throws Exception {
		Persistence p = Persistence.getObjs();
		p.deleteHospital(deleteID4.getText());
		Persistence.saveToFile();
	}
	public void searchHospital() {
		Persistence p = Persistence.getObjs();
		Hospital temp = new Hospital();
		for (String key : p.getHospitalMap().keySet()) {
			if (key.equals(searchID4.getText())) {
				temp = p.getHospital(key);
				ID4.setText(temp.getID());
				name4.setText(temp.getName());
				level4.setText(temp.getLevel());
				institutionClass4.setText(temp.getInstitutionClass());
				zipCode4.setText(temp.getZipCode());
				legalName4.setText(temp.getLegalName());
				legalPhone4.setText(temp.getLegalPhone());
				linkmanName4.setText(temp.getLinkmanName());
				phone4.setText(temp.getPhone());
				linkmanPhone4.setText(temp.getLinkmanPhone());
				address4.setText(temp.getAddress());
				remark4.setText(temp.getRemark());
			}
		}
		if (!p.getHospitalMap().containsKey(searchID4.getText())) {
			System.out.println("Nope!");
		}
	}
	public void searchHospitalPro() {
		existNumber4=0;
		Persistence p = Persistence.getObjs();
		Hospital temp = new Hospital();
		for (Hospital value : p.getHospitalMap().values()) {
			if (value.getName().equals(searchName4.getText())) {
				temp = value;
				ID4.setText(temp.getID());
				name4.setText(temp.getName());
				level4.setText(temp.getLevel());
				institutionClass4.setText(temp.getInstitutionClass());
				zipCode4.setText(temp.getZipCode());
				legalName4.setText(temp.getLegalName());
				legalPhone4.setText(temp.getLegalPhone());
				linkmanName4.setText(temp.getLinkmanName());
				phone4.setText(temp.getPhone());
				linkmanPhone4.setText(temp.getLinkmanPhone());
				address4.setText(temp.getAddress());
				remark4.setText(temp.getRemark());
				existNumber4++;
			}
		}
		if(existNumber4==0) {
			System.out.println("Nope!");
		}
	}
	
	public void modifyHospital() throws Exception {
		Hospital temp = new Hospital();
		temp.setID(ID4.getText());
		temp.setName(name4.getText());
		temp.setLevel(level4.getText());
		temp.setInstitutionClass(institutionClass4.getText());
		temp.setZipCode(zipCode4.getText());
		temp.setLegalName(legalName4.getText());
		temp.setLegalPhone(legalPhone4.getText());
		temp.setLinkmanName(linkmanName4.getText());
		temp.setPhone(phone4.getText());
		temp.setLinkmanPhone(linkmanPhone4.getText());
		temp.setAddress(address4.getText());
		temp.setRemark(remark4.getText());
		Persistence p = Persistence.getObjs();
		p.deleteHospital(ID.getText());
		p.getHospitalMap().put(temp.getID(), temp);
		Persistence.saveToFile();
	}
	//Disease相关
	@FXML
	private TextField searchID5;
	@FXML
	private TextField searchName5;
	@FXML
	private TextField deleteID5;
	private int existNumber5;
	
	@FXML
	private TextArea ID5;
	@FXML
	private TextArea name5;
	@FXML
	private TextArea classof5;
	@FXML
	private TextArea applyforReimbMark5;
	@FXML
	private TextArea remark5;
	
	public void addDisease() {
		AddDiseaseStage.getStage();
	}

	public void deleteDisease() throws Exception {
		Persistence p = Persistence.getObjs();
		p.deleteDisease(deleteID5.getText());
		Persistence.saveToFile();
	}
	public void searchDisease() {
		Persistence p = Persistence.getObjs();
		Disease temp = new Disease();
		for (String key : p.getDiseaseMap().keySet()) {
			if (key.equals(searchID5.getText())) {
				temp = p.getDisease(key);
				ID5.setText(temp.getID());
				name5.setText(temp.getName());
				classof5.setText(temp.getClassof());
				applyforReimbMark5.setText(temp.getApplyforReimbMark());
				remark5.setText(temp.getRemark());;
			}
		}
		if (!p.getDiseaseMap().containsKey(searchID5.getText())) {
			System.out.println("Nope!");
		}
	}
	public void searchDiseasePro() {
		existNumber5=0;
		Persistence p = Persistence.getObjs();
		Disease temp = new Disease();
		for (Disease value : p.getDiseaseMap().values()) {
			if (value.getName().equals(searchName5.getText())) {
				temp = value;
				ID5.setText(temp.getID());
				name5.setText(temp.getName());
				classof5.setText(temp.getClassof());
				applyforReimbMark5.setText(temp.getApplyforReimbMark());
				remark5.setText(temp.getRemark());
				existNumber5++;
			}
		}
		if(existNumber5==0) {
			System.out.println("Nope!");
		}
	}
	
	public void modifyDisease() throws Exception {
		Disease temp = new Disease();
		temp.setID(ID5.getText());
		temp.setName(name5.getText());
		temp.setClassof(classof5.getText());
		temp.setApplyforReimbMark(applyforReimbMark5.getText());
		temp.setRemark(remark5.getText());
		Persistence p = Persistence.getObjs();
		p.deleteDisease(ID.getText());
		p.getDiseaseMap().put(temp.getID(), temp);
		Persistence.saveToFile();
	}
	
	public void refresh() {
		InfoStage.getStage().close();
		InfoStage.getStage();
	}
	
	public void homepage() {
		InfoStage.getStage().close();
		MainStage.getStage();
	}
}
