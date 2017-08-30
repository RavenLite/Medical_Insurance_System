package data;

import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;

public class Medicine extends Item implements Serializable{
	private String ID;//药品编码
	private String name;//药品名称
	private String EngName;//英文名称
	private String chargeClass;//收费类别
	private String prescriptionMedicineMark;//处方药标志
	private String chargeItemLevel;//收费项目等级
	private String dosageUnit;//药品剂量单位
	private String ceilingPrice;//最高限价
	private String hospitalPreparationMark;//院内制剂标志
	private String approveMark;//是否需要审批标志
	private String hospitalLevel;//医院等级
	private String form;//剂型
	private String usageFrequency;//使用频次
	private String usageMethod;//用法
	private String unit;//单位
	private String specification;//规格
	private String limitNumberofDays;//规定天数
	private String tradeName;//药品商品名
	private String factoryName;//药厂名称
	private String SFDA;//国药准字
	private String remark;//备注
	private String NCC;//国家目录编码
	private String restrictedScope;//限制使用范围
	private String productionPlace;//产地
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
	 * @param engName the engName to set
	 */
	public void setEngName(String engName) {
		EngName = engName;
	}
	/**
	 * @param chargeClass the chargeClass to set
	 */
	public void setChargeClass(String chargeClass) {
		this.chargeClass = chargeClass;
	}
	/**
	 * @param prescriptionMedicineMark the prescriptionMedicineMark to set
	 */
	public void setPrescriptionMedicineMark(String prescriptionMedicineMark) {
		this.prescriptionMedicineMark = prescriptionMedicineMark;
	}
	/**
	 * @param chargeItemLevel the chargeItemLevel to set
	 */
	public void setChargeItemLevel(String chargeItemLevel) {
		this.chargeItemLevel = chargeItemLevel;
	}
	/**
	 * @param dosageUnit the dosageUnit to set
	 */
	public void setDosageUnit(String dosageUnit) {
		this.dosageUnit = dosageUnit;
	}
	/**
	 * @param ceilingPrice the ceilingPrice to set
	 */
	public void setCeilingPrice(String ceilingPrice) {
		this.ceilingPrice = ceilingPrice;
	}
	/**
	 * @param hospitalPreparationMark the hospitalPreparationMark to set
	 */
	public void setHospitalPreparationMark(String hospitalPreparationMark) {
		this.hospitalPreparationMark = hospitalPreparationMark;
	}
	/**
	 * @param approveMark the approveMark to set
	 */
	public void setApproveMark(String approveMark) {
		this.approveMark = approveMark;
	}
	/**
	 * @param hospitalLevel the hospitalLevel to set
	 */
	public void setHospitalLevel(String hospitalLevel) {
		this.hospitalLevel = hospitalLevel;
	}
	/**
	 * @param form the form to set
	 */
	public void setForm(String form) {
		this.form = form;
	}
	/**
	 * @param usageFrequency the usageFrequency to set
	 */
	public void setUsageFrequency(String usageFrequency) {
		this.usageFrequency = usageFrequency;
	}
	/**
	 * @param usageMethod the usageMethod to set
	 */
	public void setUsageMethod(String usageMethod) {
		this.usageMethod = usageMethod;
	}
	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	/**
	 * @param specification the specification to set
	 */
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	/**
	 * @param limitNumberofDays the limitNumberofDays to set
	 */
	public void setLimitNumberofDays(String limitNumberofDays) {
		this.limitNumberofDays = limitNumberofDays;
	}
	/**
	 * @param tradeName the tradeName to set
	 */
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	/**
	 * @param factoryName the factoryName to set
	 */
	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}
	/**
	 * @param sFDA the sFDA to set
	 */
	public void setSFDA(String sFDA) {
		SFDA = sFDA;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * @param nCC the nCC to set
	 */
	public void setNCC(String nCC) {
		NCC = nCC;
	}
	/**
	 * @param restrictedScope the restrictedScope to set
	 */
	public void setRestrictedScope(String restrictedScope) {
		this.restrictedScope = restrictedScope;
	}
	/**
	 * @param productionPlace the productionPlace to set
	 */
	public void setProductionPlace(String productionPlace) {
		this.productionPlace = productionPlace;
	}

	public Medicine(String ID, String name, String EngName, String chargeClass, String prescriptionMedicineMark,
			String chargeItemLevel, String dosageUnit, String ceilingPrice, String hospitalPreparationMark,
			String approveMark, String hospitalLevel, String form, String usageFrequency, String usageMethod,
			String unit, String specification, String limitNumberofDays, String tradeName, String factoryName,
			String SFDA, String remark, String NCC, String restrictedScope, String productionPlace) {
		this.ID=ID;
		this.name=name;
		this.EngName=EngName;
		this.chargeClass=chargeClass;
		this.prescriptionMedicineMark=prescriptionMedicineMark;
		this.chargeItemLevel=chargeItemLevel;
		this.dosageUnit=dosageUnit;
		this.ceilingPrice=ceilingPrice;
		this.hospitalPreparationMark=hospitalPreparationMark;
		this.approveMark=approveMark;
		this.hospitalLevel=hospitalLevel;
		this.form=form;
		this.usageFrequency=usageFrequency;
		this.usageMethod=usageMethod;
		this.unit=unit;
		this.specification=specification;
		this.limitNumberofDays=limitNumberofDays;
		this.tradeName=tradeName;
		this.factoryName=factoryName;
		this.SFDA=SFDA;
		this.remark=remark;
		this.NCC=NCC;
		this.restrictedScope=restrictedScope;
		this.productionPlace=productionPlace;
	}
	public Medicine(String ID, String name) {
		this.ID=ID;
		this.name=name;
	}
	public Medicine(String ID) {
		this.ID=ID;
	}
	public Medicine() {
		
	}
	public String getID() {
		return this.ID;
	}
	public String getName() {
		return this.name;
	}
	public String getEngName() {
		return this.EngName;
	}
	public String getChargeClass() {
		return this.chargeClass;
	}
	public String getPrescriptionMedicineMark() {
		return this.prescriptionMedicineMark;
	}
	public String getChargeItemLevel() {
		return this.chargeItemLevel;
	}
	public String getDosageUnit() {
		return this.dosageUnit;
	}
	public String getCeilingPrice() {
		return this.ceilingPrice;
	}
	public String getHospitalPreparationMark() {
		return this.hospitalPreparationMark;
	}
	public String getApproveMark() {
		return this.approveMark;
	}
	public String getHospitalLevel() {
		return this.hospitalLevel;
	}
	public String getForm() {
		return this.form;
	}
	public String getUsageFrequency() {
		return this.usageFrequency;
	}
	public String getUsageMethod() {
		return this.usageMethod;
	}
	public String getUnit() {
		return this.unit;
	}
	public String getSpecification() {
		return this.specification;
	}
	public String getLimitNumberofDays() {
		return this.limitNumberofDays;
	}
	public String getTradeName() {
		return this.tradeName;
	}
	public String getFactoryName() {
		return this.factoryName;
	}
	public String getSFDA() {
		return this.SFDA;
	}
	public String getRemark() {
		return this.remark;
	}
	public String getNCC() {
		return this.NCC;
	}
	public String getRestrictedScope() {
		return this.restrictedScope;
	}
	public String getProductionPlace() {
		return this.productionPlace;
	}
	public SimpleStringProperty getID2() {
		return new SimpleStringProperty(ID);
	}
	public SimpleStringProperty getName2() {
		return new SimpleStringProperty(name);
	}
}
