package data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person implements Serializable{
	private String  ID;
	private String  cardType;
	private String  cardCode;
	private String  name;
	private String  gender;
	private String  nation;
	private String  birthday;
	private String  dateofWork;
	private String  dateofRetirement;
	private String  statusofRetirement;
	private String  accountQuality;
	private String  accountAddress;
	private String  degreeofEducation;
	private String  politicsStatus;
	private String  personalIdentity;
	private String  employmentForm;
	private String  technicalPosition;
	private String  careerLevel;
	private String  statusofMarital;
	private String  administrativePost;
	private String  remark;
	private String  companyID;
	private String  classofMedicalPerson;
	private String  statusofHealth;
	private String  classofResident;
	private String  socialSecurity;
	private String  hospitalID;
	private String  civilServantMark;
	private String  modelWorkerMark;
	private String  leaderMark;
	private String  onTheJobMark;
	private String  flexibleEmploymentMark;
	private String  migrantWorkerMark;
	private String  employerMark;
	private String  armyTransferredMark;
	private ArrayList<Record> record=new ArrayList<Record>();
	private Approve approve=new Approve();
	
	public Person(String ID, String cardCode, String name, String gender, String birthday, String dateofWork,
			String dateofRetirement, String accountAddress, String companyID, String socialSecurity, String hospitalID, String remark) {
		this.ID=ID;
		this.cardCode=cardCode;
		this.name=name;
		this.gender=gender;
		this.birthday=birthday;
		this.dateofWork=dateofWork;
		this.dateofRetirement=dateofRetirement;
		this.accountAddress=accountAddress;
		this.companyID=companyID;
		this.socialSecurity=socialSecurity;
		this.hospitalID=hospitalID;
		this.remark=remark;
	}
	
	public Person() {
		
	}
	
	public SimpleStringProperty getID() {
		return new SimpleStringProperty(ID);
	}
	public SimpleStringProperty getCardCode() {
		return new SimpleStringProperty(cardCode);
	}
	public SimpleStringProperty getName() {
		return new SimpleStringProperty(name);
	}
	public SimpleStringProperty getGender() {
		return new SimpleStringProperty(gender);
	}
	public SimpleStringProperty getBirthday() {
		return new SimpleStringProperty(birthday);
	}
	public SimpleStringProperty getDateofWork() {
		return new SimpleStringProperty(dateofWork);
	}
	public SimpleStringProperty getDateofRetirement() {
		return new SimpleStringProperty(dateofRetirement);
	}
	public SimpleStringProperty getAccountAddress() {
		return new SimpleStringProperty(accountAddress);
	}
	public SimpleStringProperty getCompanyID() {
		return new SimpleStringProperty(companyID);
	}
	public SimpleStringProperty getSocialSecurity() {
		return new SimpleStringProperty(socialSecurity);
	}
	public SimpleStringProperty getHospitalID() {
		return new SimpleStringProperty(hospitalID);
	}
	public SimpleStringProperty getRemark() {
		return new SimpleStringProperty(remark);
	}
	
	public String getID2() {
		return ID;
	}
	public String getCardCode2() {
		return cardCode;
	}
	public String getName2() {
		return name;
	}
	public String getGender2() {
		return gender;
	}
	public String getBirthday2() {
		return birthday;
	}
	public String getDateofWork2() {
		return dateofWork;
	}
	public String getDateofRetirement2() {
		return dateofRetirement;
	}
	public String getAccountAddress2() {
		return accountAddress;
	}
	public String getCompanyID2() {
		return companyID;
	}
	public String getSocialSecurity2() {
		return socialSecurity;
	}
	public String getHospitalID2() {
		return hospitalID;
	}
	public String getRemark2() {
		return remark;
	}
	public String getClassofMedicalPerson2() {
		return classofMedicalPerson;
	}

	/**
	 * @return the cardType
	 */
	public String getCardType() {
		return cardType;
	}

	/**
	 * @param cardType the cardType to set
	 */
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	/**
	 * @return the nation
	 */
	public String getNation() {
		return nation;
	}

	/**
	 * @param nation the nation to set
	 */
	public void setNation(String nation) {
		this.nation = nation;
	}

	/**
	 * @return the statusofRetirement
	 */
	public String getStatusofRetirement() {
		return statusofRetirement;
	}

	/**
	 * @param statusofRetirement the statusofRetirement to set
	 */
	public void setStatusofRetirement(String statusofRetirement) {
		this.statusofRetirement = statusofRetirement;
	}

	/**
	 * @return the accountQuality
	 */
	public String getAccountQuality() {
		return accountQuality;
	}

	/**
	 * @param accountQuality the accountQuality to set
	 */
	public void setAccountQuality(String accountQuality) {
		this.accountQuality = accountQuality;
	}

	/**
	 * @return the degreeofEducation
	 */
	public String getDegreeofEducation() {
		return degreeofEducation;
	}

	/**
	 * @param degreeofEducation the degreeofEducation to set
	 */
	public void setDegreeofEducation(String degreeofEducation) {
		this.degreeofEducation = degreeofEducation;
	}

	/**
	 * @return the politicsStatus
	 */
	public String getPoliticsStatus() {
		return politicsStatus;
	}

	/**
	 * @param politicsStatus the politicsStatus to set
	 */
	public void setPoliticsStatus(String politicsStatus) {
		this.politicsStatus = politicsStatus;
	}

	/**
	 * @return the personalIdentity
	 */
	public String getPersonalIdentity() {
		return personalIdentity;
	}

	/**
	 * @param personalIdentity the personalIdentity to set
	 */
	public void setPersonalIdentity(String personalIdentity) {
		this.personalIdentity = personalIdentity;
	}

	/**
	 * @return the employmentForm
	 */
	public String getEmploymentForm() {
		return employmentForm;
	}

	/**
	 * @param employmentForm the employmentForm to set
	 */
	public void setEmploymentForm(String employmentForm) {
		this.employmentForm = employmentForm;
	}

	/**
	 * @return the technicalPosition
	 */
	public String getTechnicalPosition() {
		return technicalPosition;
	}

	/**
	 * @param technicalPosition the technicalPosition to set
	 */
	public void setTechnicalPosition(String technicalPosition) {
		this.technicalPosition = technicalPosition;
	}

	/**
	 * @return the careerLevel
	 */
	public String getCareerLevel() {
		return careerLevel;
	}

	/**
	 * @param careerLevel the careerLevel to set
	 */
	public void setCareerLevel(String careerLevel) {
		this.careerLevel = careerLevel;
	}

	/**
	 * @return the statusofMarital
	 */
	public String getStatusofMarital() {
		return statusofMarital;
	}

	/**
	 * @param statusofMarital the statusofMarital to set
	 */
	public void setStatusofMarital(String statusofMarital) {
		this.statusofMarital = statusofMarital;
	}

	/**
	 * @return the administrativePost
	 */
	public String getAdministrativePost() {
		return administrativePost;
	}

	/**
	 * @param administrativePost the administrativePost to set
	 */
	public void setAdministrativePost(String administrativePost) {
		this.administrativePost = administrativePost;
	}

	/**
	 * @return the classofMedicalPerson
	 */
	public String getClassofMedicalPerson() {
		return classofMedicalPerson;
	}

	/**
	 * @param classofMedicalPerson the classofMedicalPerson to set
	 */
	public void setClassofMedicalPerson(String classofMedicalPerson) {
		this.classofMedicalPerson = classofMedicalPerson;
	}

	/**
	 * @return the statusofHealth
	 */
	public String getStatusofHealth() {
		return statusofHealth;
	}

	/**
	 * @param statusofHealth the statusofHealth to set
	 */
	public void setStatusofHealth(String statusofHealth) {
		this.statusofHealth = statusofHealth;
	}

	/**
	 * @return the classofResident
	 */
	public String getClassofResident() {
		return classofResident;
	}

	/**
	 * @param classofResident the classofResident to set
	 */
	public void setClassofResident(String classofResident) {
		this.classofResident = classofResident;
	}

	/**
	 * @return the civilServantMark
	 */
	public String getCivilServantMark() {
		return civilServantMark;
	}

	/**
	 * @param civilServantMark the civilServantMark to set
	 */
	public void setCivilServantMark(String civilServantMark) {
		this.civilServantMark = civilServantMark;
	}

	/**
	 * @return the modelWorkerMark
	 */
	public String getModelWorkerMark() {
		return modelWorkerMark;
	}

	/**
	 * @param modelWorkerMark the modelWorkerMark to set
	 */
	public void setModelWorkerMark(String modelWorkerMark) {
		this.modelWorkerMark = modelWorkerMark;
	}

	/**
	 * @return the leaderMark
	 */
	public String getLeaderMark() {
		return leaderMark;
	}

	/**
	 * @param leaderMark the leaderMark to set
	 */
	public void setLeaderMark(String leaderMark) {
		this.leaderMark = leaderMark;
	}

	/**
	 * @return the onTheJobMark
	 */
	public String getOnTheJobMark() {
		return onTheJobMark;
	}

	/**
	 * @param onTheJobMark the onTheJobMark to set
	 */
	public void setOnTheJobMark(String onTheJobMark) {
		this.onTheJobMark = onTheJobMark;
	}

	/**
	 * @return the flexibleEmploymentMark
	 */
	public String getFlexibleEmploymentMark() {
		return flexibleEmploymentMark;
	}

	/**
	 * @param flexibleEmploymentMark the flexibleEmploymentMark to set
	 */
	public void setFlexibleEmploymentMark(String flexibleEmploymentMark) {
		this.flexibleEmploymentMark = flexibleEmploymentMark;
	}

	/**
	 * @return the migrantWorkerMark
	 */
	public String getMigrantWorkerMark() {
		return migrantWorkerMark;
	}

	/**
	 * @param migrantWorkerMark the migrantWorkerMark to set
	 */
	public void setMigrantWorkerMark(String migrantWorkerMark) {
		this.migrantWorkerMark = migrantWorkerMark;
	}

	/**
	 * @return the employerMark
	 */
	public String getEmployerMark() {
		return employerMark;
	}

	/**
	 * @param employerMark the employerMark to set
	 */
	public void setEmployerMark(String employerMark) {
		this.employerMark = employerMark;
	}

	/**
	 * @return the armyTransferredMark
	 */
	public String getArmyTransferredMark() {
		return armyTransferredMark;
	}

	/**
	 * @param armyTransferredMark the armyTransferredMark to set
	 */
	public void setArmyTransferredMark(String armyTransferredMark) {
		this.armyTransferredMark = armyTransferredMark;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(String iD) {
		ID = iD;
	}

	/**
	 * @param cardCode the cardCode to set
	 */
	public void setCardCode(String cardCode) {
		this.cardCode = cardCode;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	/**
	 * @param dateofWork the dateofWork to set
	 */
	public void setDateofWork(String dateofWork) {
		this.dateofWork = dateofWork;
	}

	/**
	 * @param dateofRetirement the dateofRetirement to set
	 */
	public void setDateofRetirement(String dateofRetirement) {
		this.dateofRetirement = dateofRetirement;
	}

	/**
	 * @param accountAddress the accountAddress to set
	 */
	public void setAccountAddress(String accountAddress) {
		this.accountAddress = accountAddress;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @param companyID the companyID to set
	 */
	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}

	/**
	 * @param socialSecurity the socialSecurity to set
	 */
	public void setSocialSecurity(String socialSecurity) {
		this.socialSecurity = socialSecurity;
	}

	/**
	 * @param hospitalID the hospitalID to set
	 */
	public void setHospitalID(String hospitalID) {
		this.hospitalID = hospitalID;
	}
	public ArrayList<Record> getRecord() {
		return this.record;
	}
	public Approve getApprove() {
		return this.approve;
	}
	public void setApprove(Approve approve) {
		this.approve=approve;
	}
}
