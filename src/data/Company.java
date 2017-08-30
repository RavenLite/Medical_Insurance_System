package data;

import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;

public class Company implements Serializable{
	private String ID;
	private String name;
	private String classof;
	private String address;
	private String zipCode;
	private String phone;
	
	public Company(String ID, String name, String classof, String address, String zipCode, String phone) {
		this.ID=ID;
		this.name=name;
		this.classof=classof;
		this.address=address;
		this.zipCode=zipCode;
		this.phone=phone;
	}
	
	public Company() {
		
	}
	
	public SimpleStringProperty getID() {
		return new SimpleStringProperty(ID);
	}
	public SimpleStringProperty getName() {
		return new SimpleStringProperty(name);
	}
	public SimpleStringProperty getClassof() {
		return new SimpleStringProperty(classof);
	}
	public SimpleStringProperty getAddress() {
		return new SimpleStringProperty(address);
	}
	public SimpleStringProperty getZipCode() {
		return new SimpleStringProperty(zipCode);
	}
	public SimpleStringProperty getPhone() {
		return new SimpleStringProperty(phone);
	}
	
	public String getID2() {
		return ID;
	}
	public String getName2() {
		return name;
	}
	public String getClassof2() {
		return classof;
	}
	public String getAddress2() {
		return address;
	}
	public String getZipCode2() {
		return zipCode;
	}
	public String getPhone2() {
		return phone;
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
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
