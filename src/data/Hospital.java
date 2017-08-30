package data;

import java.io.Serializable;

public class Hospital implements Serializable{
	private String ID;
	private String name;
	private String level;
	private String institutionClass;
	private String zipCode;
	private String legalName;
	private String legalPhone;
	private String linkmanName;
	private String phone;
	private String linkmanPhone;
	private String address;
	private String remark;
	
	public Hospital(String ID, String name, String level, String institutionClass, String zipCode, String legalName,
			String legalPhone, String linkmanName, String phone, String linkmanPhone, String address, String remark) {
		this.ID=ID;
		this.name=name;
		this.level=level;
		this.institutionClass=institutionClass;
		this.zipCode=zipCode;
		this.legalName=legalName;
		this.legalPhone=legalPhone;
		this.linkmanName=linkmanName;
		this.phone=phone;
		this.linkmanPhone=linkmanPhone;
		this.address=address;
		this.remark=remark;
	}
	public Hospital() {
		
	}
	
	public String getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public String getLevel() {
		return level;
	}
	public String getInstitutionClass() {
		return institutionClass;
	}
	public String getZipCode() {
		return zipCode;
	}
	public String getLegalName() {
		return legalName;
	}
	public String getLegalPhone() {
		return legalPhone;
	}
	public String getLinkmanName() {
		return linkmanName;
	}
	public String getPhone() {
		return phone;
	}
	public String getLinkmanPhone() {
		return linkmanPhone;
	}
	public String getAddress() {
		return address;
	}
	public String getRemark() {
		return remark;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(String iD) {
		ID = iD;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param level the level to set
	 */
	public void setLevel(String level) {
		this.level = level;
	}
	/**
	 * @param institutionClass the institutionClass to set
	 */
	public void setInstitutionClass(String institutionClass) {
		this.institutionClass = institutionClass;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	/**
	 * @param legalName the legalName to set
	 */
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}
	/**
	 * @param legalPhone the legalPhone to set
	 */
	public void setLegalPhone(String legalPhone) {
		this.legalPhone = legalPhone;
	}
	/**
	 * @param linkmanName the linkmanName to set
	 */
	public void setLinkmanName(String linkmanName) {
		this.linkmanName = linkmanName;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @param linkmanPhone the linkmanPhone to set
	 */
	public void setLinkmanPhone(String linkmanPhone) {
		this.linkmanPhone = linkmanPhone;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
