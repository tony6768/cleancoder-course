package middle.man.tp;

public class Person {

	private String name;

	private String adresse;

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
