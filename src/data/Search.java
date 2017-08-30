/**
 * 
 */package data;

import javafx.beans.property.SimpleStringProperty;

/**
 * @author dell
 *
 */
public class Search {
	private String ID;
	private String name;
	private String companyID;
	private String birthday;
	private String inCode;
	private String inDate;
	private String outDate;
	private String disease;
	
	public Search() {
		
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the companyID
	 */
	public String getCompanyID() {
		return companyID;
	}

	/**
	 * @param companyID the companyID to set
	 */
	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}

	/**
	 * @return the birthday
	 */
	public String getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return the inCode
	 */
	public String getInCode() {
		return inCode;
	}

	/**
	 * @param inCode the inCode to set
	 */
	public void setInCode(String inCode) {
		this.inCode = inCode;
	}

	/**
	 * @return the inDate
	 */
	public String getInDate() {
		return inDate;
	}

	/**
	 * @param inDate the inDate to set
	 */
	public void setInDate(String inDate) {
		this.inDate = inDate;
	}

	/**
	 * @return the outDate
	 */
	public String getOutDate() {
		return outDate;
	}

	/**
	 * @param outDate the outDate to set
	 */
	public void setOutDate(String outDate) {
		this.outDate = outDate;
	}

	/**
	 * @return the disease
	 */
	public String getDisease() {
		return disease;
	}

	/**
	 * @param disease the disease to set
	 */
	public void setDisease(String disease) {
		this.disease = disease;
	}
	
	public SimpleStringProperty getID2() {
		return new SimpleStringProperty(ID);
	}
	public SimpleStringProperty getName2() {
		return new SimpleStringProperty(name);
	}
	public SimpleStringProperty getCompanyID2() {
		return new SimpleStringProperty(companyID);
	}
	public SimpleStringProperty getBirthday2() {
		return new SimpleStringProperty(birthday);
	}
	public SimpleStringProperty getInCode2() {
		return new SimpleStringProperty(inCode);
	}
	public SimpleStringProperty getInDate2() {
		return new SimpleStringProperty(inDate);
	}
	public SimpleStringProperty getOutDate2() {
		return new SimpleStringProperty(outDate);
	}
	public SimpleStringProperty getDisease2() {
		return new SimpleStringProperty(disease);
	}
}
