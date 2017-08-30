/**
 * 
 */package data;

import java.io.Serializable;

/**
 * @author dell
 *
 */
public class Approve implements Serializable{
	private String code;
	private String personID;
	private String classof;
	private String startDate;
	private String stopDate;
	private String hospitalID;
	private String approveAdvice;
	private String approvePerson;
	private String approveDate;
	private String remark;
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the personID
	 */
	public String getPersonID() {
		return personID;
	}
	/**
	 * @param personID the personID to set
	 */
	public void setPersonID(String personID) {
		this.personID = personID;
	}
	/**
	 * @return the classof
	 */
	public String getClassof() {
		return classof;
	}
	/**
	 * @param classof the classof to set
	 */
	public void setClassof(String classof) {
		this.classof = classof;
	}
	/**
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the stopDate
	 */
	public String getStopDate() {
		return stopDate;
	}
	/**
	 * @param stopDate the stopDate to set
	 */
	public void setStopDate(String stopDate) {
		this.stopDate = stopDate;
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
	 * @return the approveAdvice
	 */
	public String getApproveAdvice() {
		return approveAdvice;
	}
	/**
	 * @param approveAdvice the approveAdvice to set
	 */
	public void setApproveAdvice(String approveAdvice) {
		this.approveAdvice = approveAdvice;
	}
	/**
	 * @return the approvePerson
	 */
	public String getApprovePerson() {
		return approvePerson;
	}
	/**
	 * @param approvePerson the approvePerson to set
	 */
	public void setApprovePerson(String approvePerson) {
		this.approvePerson = approvePerson;
	}
	/**
	 * @return the approveDate
	 */
	public String getApproveDate() {
		return approveDate;
	}
	/**
	 * @param approveDate the approveDate to set
	 */
	public void setApproveDate(String approveDate) {
		this.approveDate = approveDate;
	}
	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
