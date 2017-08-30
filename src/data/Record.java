/**
 * 
 */package data;

import java.io.Serializable;

/**
 * @author dell
 *
 */
public class Record implements Serializable{
	private Recipe recipe=new Recipe();
	private TreatmentInfo treatmentInfo=new TreatmentInfo();
	/**
	 * @return the recipe
	 */
	public Recipe getRecipe() {
		return recipe;
	}
	/**
	 * @param recipe the recipe to set
	 */
	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}
	/**
	 * @return the treatmentInfo
	 */
	public TreatmentInfo getTreatmentInfo() {
		return treatmentInfo;
	}
	/**
	 * @param treatmentInfo the treatmentInfo to set
	 */
	public void setTreatmentInfo(TreatmentInfo treatmentInfo) {
		this.treatmentInfo = treatmentInfo;
	}
	
}
