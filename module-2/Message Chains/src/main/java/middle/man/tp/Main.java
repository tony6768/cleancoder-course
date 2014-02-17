package middle.man.tp;

public class Main {

    public static void main(String[] args) {
        Person john = new Person();

        Person manager = john.getManager();
        String departmentName = john.getDepartmentName();
        String departmentCity = john.getDepartmentCity();

    }

}
