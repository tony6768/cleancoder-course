package middle.man.solution;

/**
 * represente un employe d'entreprise
 * 
 * @author jguidoux
 * 
 */
public class Employe extends Person {

	private Manager manager;

	private Department department;

	private String employeUniqueKey;
	
	
	

	public Employe(String name, String employeUniqueKey) {
		super(name);
		this.employeUniqueKey = employeUniqueKey;
	}

	public String getEmployeUniqueKey() {
		return employeUniqueKey;
	}

	public void setEmployeUniqueKey(String employeUniqueKey) {
		this.employeUniqueKey = employeUniqueKey;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Department getDepartment() {
		return department;
	}

}
