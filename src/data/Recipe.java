/**
 * 
 */package data;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author dell
 *
 */
public class Recipe implements Serializable{
	private String hospitalizationID;
	private ArrayList<Item> Items= new ArrayList<Item>();
	private float money;
	
	public Recipe() {
		
	}
	
	public String getHospitalizationID() {
		return this.hospitalizationID;
	}
	public void setHospitalizationID(String hospitalizationID) {
		this.hospitalizationID = hospitalizationID;
	}
	public ArrayList<Item> getItems() {
		return this.Items;
	}
	public void setItems(ArrayList<Item> items) {
		Items = items;
	}
	public float getMoney() {
		return this.money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	
}
