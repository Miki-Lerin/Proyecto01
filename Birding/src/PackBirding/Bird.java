package PackBirding;

public class Bird {
	
	//attributes
	private String name;
	private String nameLatin;
	private int observations;
	private Person person;
	
	//constructor
	public Bird(String name,  String nameLatin, int observations, Person person ) {
		this.name = name;
		this.nameLatin = nameLatin;
		this.observations = observations;
		this.person = person;
	}
	
	//methods
	
	
	////getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameLatin() {
		return nameLatin;
	}

	public void setNameLatin(String nameLatin) {
		this.nameLatin = nameLatin;
	}

	public int getObservations() {
		return observations;
	}

	public void setObservations(int observations) {
		this.observations = observations;
	}
	
	public void addObservation() {
		this.observations ++;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Bird [name=" + name + ", nameLatin=" + nameLatin + ", observations=" + observations + ", person="
				+ person + "]";
	}
}
