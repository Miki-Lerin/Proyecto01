package plate;

public class Plate {
	
	private String plate;
	private Double price;
	
	public Plate(String plate, Double price) {
		this.plate = plate;
		this.price = price;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Plate [plate=" + this.plate + ", price=" + this.price + "]";
	}
}