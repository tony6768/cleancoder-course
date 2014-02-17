package middle.man.solution;

public class Department {

    private final Person manager;
    private final String name;
    private final String city;

    public Department(Person manager, String name, String city) {
        this.manager = manager;
        this.name = name;
        this.city = city;
    }

    public Person getManager() {
        return manager;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

}
