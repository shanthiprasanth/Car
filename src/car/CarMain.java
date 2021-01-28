package car;

public class CarMain {
	public static void main(String[] a) {
		Car myCar = new Car("Audi", "A Series", "Black", 4);
		
		System.out.println(myCar.getBrand());
		System.out.println(myCar.getModel());
		System.out.println(myCar.getColor());
		System.out.println(myCar.getNumOfSeat());
	}
}
