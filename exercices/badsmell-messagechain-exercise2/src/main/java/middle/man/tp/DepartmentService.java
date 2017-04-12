package middle.man.tp;

import java.util.Iterator;

public class DepartmentService {

	private Manager m;
   
	/**
	 * desassocie un employe et un manager
	 * @param _manager
	 * @param _employe
	 */
	public void SupprimerManager (Employe _employe) {
		 m.removeEmployee(_employe);
    }
	
	/**
	 * associer un manager et un empploye
	 * Si un employe est deja associer a un manager, alors il sera desassocié de celui ci avant detre associé au nouveau
	 * @param _manager
	 * @param _employe
	 */
	public void ajouterEmploye(Manager _manager,Employe _employe) {
		_manager.AjouterEmployer(_employe);
	}
	
	/** 
	 * associer un employe a un departement
	 * @param _department
	 * @param _employe
	 */
	public void setDepartment(Department _department, Employe _employe) {
	 _employe.setDepartment(_department);	
	}


}
