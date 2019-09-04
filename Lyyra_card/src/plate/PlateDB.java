package plate;

import java.util.ArrayList;

public class PlateDB {
	
    private ArrayList<Plate> plate;
    private String dbName;
	
	
	public PlateDB(String name) {
		this.plate = new ArrayList<Plate>();
		this.dbName = name;
	}

	
	public void addPlate(Plate plate) {
		this.plate.add(plate);
	}
	
	public void removePlate(Plate plate ) {
		this.plate.remove(plate);
	}
	
	
	public ArrayList<Plate> getArray() {
		return this.plate;
	}
	
	
	public int arraySize() {
		return this.plate.size();
	}
	
	
  // get plates versus index
	public Plate getPlate(int miindex) {
	   return this.plate.get(miindex);
    }


	public ArrayList<Plate> getPlates() {
		return plate;
	}


	public void setPlates(ArrayList<Plate> plate) {
		this.plate = plate;
	}


	public String getDbName() {
		return dbName;
	}


	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
}