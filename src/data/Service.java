package data;

import java.io.Serializable;

public class Service extends Item implements Serializable{
	private String ID;//医疗服务设施编码
	private String name;//服务设施名称
	private String chargeClass;//收费类别
	private String remark;//备注
	private String restrictedScope;//限制使用范围
	
	public Service(String ID, String name, String chargeClass, String remark, String restrictedScope) {
		this.ID=ID;
		this.name=name;
		this.chargeClass=chargeClass;
		this.remark=remark;
		this.restrictedScope=restrictedScope;
	}
	
	public Service() {
		
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
