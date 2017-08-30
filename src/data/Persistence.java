package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Persistence implements java.io.Serializable {
	private final static String FILE_NAME = "F:\\03Eclispe Workspace\\Medical Insurance System\\src\\data\\database";
	private HashMap<String, Medicine> medicineMap;
	private HashMap<String, Treatment> treatmentMap;
	private HashMap<String, Service> serviceMap;
	private HashMap<String, Hospital> hospitalMap;
	private HashMap<String, Disease> diseaseMap;
	private HashMap<String, Person> personMap;
	private HashMap<String, Company> companyMap;
	private HashMap<String, Account> accountMap;
	/*
	 * private List<Ratio> ratioRules; private HashMap<String, VisitingRecord>
	 * recordMap;
	 */
	public static Object o;

	private static Persistence p = null;

	public static Persistence getObjs() {
		if (p != null)
			return p;
		try {
			p = Persistence.loadFromFile(FILE_NAME);
		} catch (Exception e) {
			p = new Persistence();
			p.init();
		}
		return p;
	}

	public void init() {
		medicineMap = new HashMap<String, Medicine>();
		treatmentMap = new HashMap<String, Treatment>();
		serviceMap = new HashMap<String, Service>();
		hospitalMap = new HashMap<String, Hospital>();
		diseaseMap = new HashMap<String, Disease>();
		personMap = new HashMap<String, Person>();
		companyMap = new HashMap<String, Company>();
		accountMap = new HashMap<String, Account>();
	}

	public static Persistence loadFromFile(String name) throws Exception {
		File file = new File(name);

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		Persistence p = (Persistence) ois.readObject();
		ois.close();
		return p;
	}

	public static void saveToFile() throws Exception {
		File file = new File(FILE_NAME);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(p);
		oos.close();
	}

	// Medicine相关方法
	public HashMap<String, Medicine> getMedicineMap() {
		return this.medicineMap;
	}

	public Medicine getMedicine(String code) {
		return medicineMap.get(code);
	}

	public void saveMedicine(String code, Medicine p) {
		medicineMap.put(code, p);
	}

	public void deleteMedicine(String code) {
		medicineMap.remove(code);
	}

	// Treatment相关方法
	public HashMap<String, Treatment> getTreatmentMap() {
		return this.treatmentMap;
	}

	public Treatment getTreatment(String code) {
		return treatmentMap.get(code);
	}

	public void saveTreatment(String code, Treatment p) {
		treatmentMap.put(code, p);
	}

	public void deleteTreatment(String code) {
		treatmentMap.remove(code);
	}

	// Service相关方法
	public HashMap<String, Service> getServiceMap() {
		return this.serviceMap;
	}

	public Service getService(String code) {
		return serviceMap.get(code);
	}

	public void saveService(String code, Service p) {
		serviceMap.put(code, p);
	}

	public void deleteService(String code) {
		serviceMap.remove(code);
	}

	// Hospital相关方法
	public HashMap<String, Hospital> getHospitalMap() {
		return this.hospitalMap;
	}

	public Hospital getHospital(String code) {
		return hospitalMap.get(code);
	}

	public void saveHospital(String code, Hospital p) {
		hospitalMap.put(code, p);
	}

	public void deleteHospital(String code) {
		hospitalMap.remove(code);
	}

	// Disease相关方法
	public HashMap<String, Disease> getDiseaseMap() {
		return this.diseaseMap;
	}

	public Disease getDisease(String code) {
		return diseaseMap.get(code);
	}

	public void saveDisease(String code, Disease p) {
		diseaseMap.put(code, p);
	}

	public void deleteDisease(String code) {
		diseaseMap.remove(code);
	}

	// Person相关方法
	public HashMap<String, Person> getPersonMap() {
		return this.personMap;
	}

	public Person getPerson(String code) {
		return personMap.get(code);
	}

	public void savePerson(String code, Person p) {
		personMap.put(code, p);
	}

	public void deletePerson(String code) {
		personMap.remove(code);
	}

	// Company相关方法
	public HashMap<String, Company> getCompanyMap() {
		return this.companyMap;
	}

	public Company getCompany(String code) {
		return companyMap.get(code);
	}

	public void saveCompany(String code, Company p) {
		companyMap.put(code, p);
	}

	public void deleteCompany(String code) {
		companyMap.remove(code);
	}

	// Account相关方法
	public HashMap<String, Account> getAccountMap() {
		return this.accountMap;
	}

	public Account getAccount(String code) {
		return accountMap.get(code);
	}

	public void saveAccount(String code, Account p) {
		accountMap.put(code, p);
	}

	public void deleteAccount(String code) {
		accountMap.remove(code);
	}
}
