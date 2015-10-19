/**
 * 
 */
package com.core.java8.lang.constructorRef;

/**
 * @author Shivpal.Chouhan
 *
 */
public class ConstRefEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("\n\n------------by Lambdas-----------------");
		// using lambdas
		Car car = (id) -> new BMWCar(id);
		car.getCar("3783").printCarModel();

		System.out.println("\n\n------------by Method Ref-----------------");
		// using method reference
		Car car1 = ConstRefEx::myCarWithId;
		car1.getCar("3783").printCarModel();

		System.out
				.println("\n\n------------by Constructor Reference----------------");
		// using Constructor Reference
		Car car2 = BMWCar::new;
		car2.getCar("3783").printCarModel();
	}

	public static BMWCar myCarWithId(String id) {
		System.out.println("Calling method myCarWithId");
		return new BMWCar(id);
	}

}

@FunctionalInterface
interface Car {
	public BMWCar getCar(String id);
}

class BMWCar {
	private String carId = "";

	public BMWCar(String carId) {
		this.carId = carId;
		System.out.println("Calling with carId :" + carId);
	}

	public BMWCar() {
		System.out.println("Calling without carId");
	}

	public void printCarModel() {

		System.out.println("Car Model : 2014 CarId :" + carId);

	}

}