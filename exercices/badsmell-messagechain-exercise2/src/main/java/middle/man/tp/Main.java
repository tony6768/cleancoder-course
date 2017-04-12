package middle.man.tp;


public class Main {

    public static void main(String[] args) {
        Employe john = new Employe("john", "AAA");
        Manager william = new Manager("william", "BBB");
        Department dep = new Department("research");
        DepartmentService service = new DepartmentService();

        
        service.setDepartment(dep, john);
        service.setDepartment(dep, william);
        service.ajouterEmploye(william, john);
        
        System.out.println(william);

    }

}
