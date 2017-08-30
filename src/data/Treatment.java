/**
 * 
 */package data;

import java.io.Serializable;

/**
 * @author dell
 *
 */
public class Treatment extends Item implements Serializable{
	private String ID;//项目编码
	private String name;//项目名称
	private String chargeClass;//收费类别
	private String chargeItemLevel;//收费项目等级
	private String hospitalLevel;//医院等级
	private String approveMark;//是否需要审批标志
	private String unit;//单位
	private String manufacturer;//生产厂家
	private String remark;//备注
	private String restrictedScope;//限制使用范围
	
	public Treatment(String ID, String name, String chargeClass, String chargeItemLevel,
			String hospitalLevel, String approveMark, String unit, String manufacturer,
			String remark, String restrictedScope) {
		this.ID=ID;
		this.name=name;
		this.chargeClass=chargeClass;
		this.chargeItemLevel=chargeItemLevel;
		this.hospitalLevel=hospitalLevel;
		this.approveMark=approveMark;
		this.unit=unit;
		this.manufacturer=manufacturer;
		this.remark=remark;
		this.restrictedScope=restrictedScope;
	}
	public Treatment() {
		
	}
	
	public String getID() {
		return this.ID;
	}
	public String getName() {
		return this.name;
	}
	public String getChargeClass() {
		return this.chargeClass;
	}
	public String getChargeItemLevel() {
		return this.chargeItemLevel;
	}
	public String getHospitalLevel() {
		return this.hospitalLevel;
	}
	public String getApproveMark() {
		return this.approveMark;
	}
	public String getUnit() {
		return this.unit;
	}
	public String getManufacturer() {
		return this.manufacturer;
	}
	public String getRemark() {
		return this.remark;
	}
	public String getRestrictedScope() {
		return this.restrictedScope;
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
	 * @param chargeClass the chargeClass to set
	 */
	public void setChargeClass(String chargeClass) {
		this.chargeClass = chargeClass;
	}
	/**
	 * @param chargeItemLevel the chargeItemLevel to set
	 */
	public void setChargeItemLevel(String chargeItemLevel) {
		this.chargeItemLevel = chargeItemLevel;
	}
	/**
	 * @param hospitalLevel the hospitalLevel to set
	 */
	public void setHospitalLevel(String hospitalLevel) {
		this.hospitalLevel = hospitalLevel;
	}
	/**
	 * @param approveMark the approveMark to set
	 */
	public void setApproveMark(String approveMark) {
		this.approveMark = approveMark;
	}
	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * @param restrictedScope the restrictedScope to set
	 */
	public void setRestrictedScope(String restrictedScope) {
		this.restrictedScope = restrictedScope;
	}
	
}
