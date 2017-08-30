package data;

import java.io.Serializable;

public class Disease implements Serializable{
	private String ID;
	private String name;
	private String classof;
	private String applyforReimbMark;
	private String remark;
	
	public Disease(String ID, String name, String classof, String applyforReimbMark, String remark) {
		this.ID=ID;
		this.name=name;
		this.classof=classof;
		this.applyforReimbMark=applyforReimbMark;
		this.remark=remark;
	}
	public Disease() {
		
	}
	
	public String getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public String getClassof() {
		return classof;
	}
	public String getApplyforReimbMark() {
		return applyforReimbMark;
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
	 * @param classof the classof to set
	 */
	public void setClassof(String classof) {
		this.classof = classof;
	}
	/**
	 * @param applyforReimbMark the applyforReimbMark to set
	 */
	public void setApplyforReimbMark(String applyforReimbMark) {
		this.applyforReimbMark = applyforReimbMark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
