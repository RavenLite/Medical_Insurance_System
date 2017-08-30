/**
 * 
 */package data;

import java.io.Serializable;

/**
 * @author dell
 *
 */
public class Account implements Serializable{
	private String accountName;
	private String accountPassword;
	
	public Account() {
		
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	
}
