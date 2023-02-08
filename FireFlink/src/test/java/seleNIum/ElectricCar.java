package seleNIum;

public class ElectricCar extends Car 
{
	@Override
	public final String drive() {
		return "Driving electric car";
	}

	public static void main(String[] wheels) {
		final Car car = new ElectricCar();
		System.out.print(car.drive());
	}
}
