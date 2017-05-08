package middle.man.solution;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * represente un manager d'une entreprise
 * 
 * @author jguidoux
 * 
 */
public class Manager extends Employe {

	/**
	 * un manager gere des personnes
	 */
	private Map<String, Employe> employees = new HashMap<String, Employe>();
	
	
	

	public Manager(String name, String employeUniqueKey) {
		super(name, employeUniqueKey);
		// TODO Auto-generated constructor stub
	}

	public Collection<Employe> getEmployees() {
		return employees.values();
	}

	public boolean removeEmployee(Employe _employe) {
		if (!employees.containsKey(_employe.getEmployeUniqueKey())) {
			return false;
		}
		employees.remove(_employe.getEmployeUniqueKey());
		_employe.setManager(null);
		return true;
	}
	
	public void AjouterEmployer(Employe _employe) {
		if (_employe.getManager() != null) {
			_employe.getManager().removeEmployee(_employe);
		}
		employees.put(_employe.getEmployeUniqueKey(), _employe);
	}

	@Override
	public String toString() {
		return "Manager [employees=" + employees + ", getEmployeUniqueKey()="
				+ getEmployeUniqueKey() + ", getManager()=" + getManager()
				+ ", getDepartment()=" + getDepartment() + ", toString()="
				+ super.toString() + ", getName()=" + getName()
				+ ", getAdresse()=" + getAdresse() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
}
