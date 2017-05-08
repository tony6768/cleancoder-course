package middle.man.solution;


public class Main {

    public static void main(String[] args) {
        Employe john = new Employe("john", "AAA");
        Manager william = new Manager("william", "BBB");
        Department dep = new Department("research");

        
        john.setDepartment(dep);
        william.setDepartment(dep);
        william.AjouterEmployer(john);
        
        System.out.println(william);

    }

}
