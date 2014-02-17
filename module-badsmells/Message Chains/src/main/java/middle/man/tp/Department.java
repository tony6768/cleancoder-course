package middle.man.tp;

public class Department {

    private final Integer id;
    private final DepartmentService service = new DepartmentService();

    public Department(Integer id) {
        this.id = id;
    }

    public Person getManager() {
        return service.getManager(id);
    }

    public String getName() {
        return service.getDepartmentName(id);
    }

    public String getCity() {
        return service.getDepartmentCity(id);
    }

}
