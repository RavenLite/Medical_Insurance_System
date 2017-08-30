/**
 * 
 */package data;

import java.io.Serializable;

/**
 * @author dell
 *
 */
public class TreatmentInfo implements Serializable{
	private String ID;
	private String hospitalizationID;
	private String hospitalID;
	private String classofTreatment;
	private String dateofEnterHospital;
	private String dateofLeaveHospital;
	private String diseaseID;
	private String hospitalLevel;
	private String enterDiseaseID;
	private String enterDiseaseName;
	private String reasonLeavingHospital;
	
	public TreatmentInfo() {
		
	}
	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(String iD) {
		ID = iD;
	}
	/**
	 * @return the hospitalizationID
	 */
	public String getHospitalizationID() {
		return hospitalizationID;
	}
	/**
	 * @param hospitalizationID the hospitalizationID to set
	 */
	public void setHospitalizationID(String hospitalizationID) {
		this.hospitalizationID = hospitalizationID;
	}
	/**
	 * @return the hospitalID
	 */
	public String getHospitalID() {
		return hospitalID;
	}
	/**
	 * @param hospitalID the hospitalID to set
	 */
	public void setHospitalID(String hospitalID) {
		this.hospitalID = hospitalID;
	}
	/**
	 * @return the classofTreatment
	 */
	public String getClassofTreatment() {
		return classofTreatment;
	}
	/**
	 * @param classofTreatment the classofTreatment to set
	 */
	public void setClassofTreatment(String classofTreatment) {
		this.classofTreatment = classofTreatment;
	}
	/**
	 * @return the dateofEnterHospital
	 */
	public String getDateofEnterHospital() {
		return dateofEnterHospital;
	}
	/**
	 * @param dateofEnterHospital the dateofEnterHospital to set
	 */
	public void setDateofEnterHospital(String dateofEnterHospital) {
		this.dateofEnterHospital = dateofEnterHospital;
	}
	/**
	 * @return the dataofLeaveHospital
	 */
	public String getDateofLeaveHospital() {
		return dateofLeaveHospital;
	}
	/**
	 * @param dataofLeaveHospital the dataofLeaveHospital to set
	 */
	public void setDateofLeaveHospital(String dataofLeaveHospital) {
		this.dateofLeaveHospital = dataofLeaveHospital;
	}
	/**
	 * @return the diseaseID
	 */
	public String getDiseaseID() {
		return diseaseID;
	}
	/**
	 * @param diseaseID the diseaseID to set
	 */
	public void setDiseaseID(String diseaseID) {
		this.diseaseID = diseaseID;
	}
	/**
	 * @return the hospitalLevel
	 */
	public String getHospitalLevel() {
		return hospitalLevel;
	}
	/**
	 * @param hospitalLevel the hospitalLevel to set
	 */
	public void setHospitalLevel(String hospitalLevel) {
		this.hospitalLevel = hospitalLevel;
	}
	/**
	 * @return the enterDiseaseID
	 */
	public String getEnterDiseaseID() {
		return enterDiseaseID;
	}
	/**
	 * @param enterDiseaseID the enterDiseaseID to set
	 */
	public void setEnterDiseaseID(String enterDiseaseID) {
		this.enterDiseaseID = enterDiseaseID;
	}
	/**
	 * @return the enterDiseaseName
	 */
	public String getEnterDiseaseName() {
		return enterDiseaseName;
	}
	/**
	 * @param enterDiseaseName the enterDiseaseName to set
	 */
	public void setEnterDiseaseName(String enterDiseaseName) {
		this.enterDiseaseName = enterDiseaseName;
	}
	/**
	 * @return the reasonLeavingHospital
	 */
	public String getReasonLeavingHospital() {
		return reasonLeavingHospital;
	}
	/**
	 * @param reasonLeavingHospital the reasonLeavingHospital to set
	 */
	public void setReasonLeavingHospital(String reasonLeavingHospital) {
		this.reasonLeavingHospital = reasonLeavingHospital;
	}
	
	
}
