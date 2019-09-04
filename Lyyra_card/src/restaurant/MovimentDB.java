package restaurant;

import java.util.ArrayList;

public class MovimentDB {
	
    private ArrayList<Moviment> moviment;
    private String dbName;
	
	
	public MovimentDB(String name) {
		this.moviment = new ArrayList<Moviment>();
		this.dbName = name;
	}

	
	public void addMoviment(Moviment moviment) {
		this.moviment.add(moviment);
	}
	
	public void removeMoviment(Moviment moviment) {
		this.moviment.remove(moviment);
	}
	
	
	public ArrayList<Moviment> getArray() {
		return this.moviment;
	}
	
	
	public int arraySize() {
		return this.moviment.size();
	}
	
	
  // get moviment versus index
	public Moviment getPlate(int miindex) {
	   return this.moviment.get(miindex);	
    }


	public ArrayList<Moviment> getMoviment() {
		return moviment;
	}


	public void setMoviment(ArrayList<Moviment> moviment) {
		this.moviment = moviment;
	}


	public String getDbName() {
		return dbName;
	}


	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
}