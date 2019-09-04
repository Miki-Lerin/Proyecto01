package person;

import java.util.ArrayList;

public class PersonDB {
	
    private ArrayList<Person> persons;
    private String dbName;
	
	
	public PersonDB(String name) {
		this.persons = new ArrayList<Person>();
		this.dbName = name;
	}

	
	public void addPerson(Person person) {
		this.persons.add(person);
	}
	
	
	public ArrayList<Person> getArray() {
		return this.persons;
		}
	
	
	public int arraySize() {
		return this.persons.size();
	}
	
	
  // get dataPersons versus index
	public Person getPerson(int miindex) {
	   return this.persons.get(miindex);
	   }


	public ArrayList<Person> getPersons() {
		return persons;
	}


	public void setPersons(ArrayList<Person> persons) {
		this.persons = persons;
	}


	public String getDbName() {
		return dbName;
	}


	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
}
