package middle.man.solution;

public class Main {

    public static void main(String[] args) {
        Person john = new Person();

        Department department = john.getDepartment();
        Person manager = department.getManager();
        String departmentName = department.getName();
        String departmentCity = department.getCity();
    }

}
