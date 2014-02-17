package middle.man.tp;

public class Person {

    private Department department;

    public Person getManager() {
        return department.getManager();
    }

    public String getDepartmentName() {
        return department.getName();
    }

    public String getDepartmentCity() {
        return department.getCity();
    }

}
