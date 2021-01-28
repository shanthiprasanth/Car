package car;

public class Car {
	private String 	brand;
	private String 	model;
	private String 	color;
	private int 	numOfSeat;
	
	//constructor
	public Car(String brand, String model, String color, int numOfSeat) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.numOfSeat = numOfSeat;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumOfSeat() {
		return numOfSeat;
	}

	public void setNumOfSeat(int numOfSeat) {
		this.numOfSeat = numOfSeat;
	}	
}
