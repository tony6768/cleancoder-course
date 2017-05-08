package middle.man.tp;

import middle.man.solution.Department;
import middle.man.solution.Employe;
import middle.man.solution.Manager;

import org.junit.Assert;
import org.junit.Test;

public class MiddleManTest {

	@Test
	public void testSetDepartment() {
		Employe john = new Employe("john", "AAA");
		Manager william = new Manager("william", "BBB");
		Department dep = new Department("research");

		john.setDepartment(dep);
		william.setDepartment(dep);
		william.AjouterEmployer(john);

		Assert.assertEquals("research", john.getDepartment().getName());
		Assert.assertEquals("research", william.getDepartment().getName());
	}
	
	@Test
	public void testAjoutEmploye() {
		Employe john = new Employe("john", "AAA");
		Manager william = new Manager("william", "BBB");
		
		william.AjouterEmployer(john);

		Assert.assertEquals(1, william.getEmployees().size());
	}
	
	@Test
	public void testSupprimerEmploye() {
		Employe john = new Employe("john", "AAA");
		Manager william = new Manager("william", "BBB");
		
		william.AjouterEmployer(john);

		Assert.assertEquals(1, william.getEmployees().size());
		william.removeEmployee(john);
		Assert.assertEquals(0, william.getEmployees().size());

	}

}
