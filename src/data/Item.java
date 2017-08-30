/**
 * 
 */package data;

import java.io.Serializable;

import javafx.beans.property.SimpleStringProperty;

/**
 * @author dell
 *
 */
public class Item implements Serializable{
	private String ID;
	private String name; 
	private String price;
	private String num;
	
	public String getID() {
		return ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
	public SimpleStringProperty getID2() {
		return new SimpleStringProperty(ID);
	}
	public SimpleStringProperty getName2() {
		return new SimpleStringProperty(name);
	}
	public SimpleStringProperty getPrice2() {
		return new SimpleStringProperty(price);
	}
	public SimpleStringProperty getNum2() {
		return new SimpleStringProperty(num);
	}
	
	public Item() {
		
	}
}
