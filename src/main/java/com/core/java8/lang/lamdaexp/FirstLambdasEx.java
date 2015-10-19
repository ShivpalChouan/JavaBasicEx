package com.core.java8.lang.lamdaexp;

/**
 * @author Shivpal.Chouhan
 *
 */
public class FirstLambdasEx {

	public static void main(String... str) {
		showBeforeJdk8();
		byLamdaExp();

		// TODO Need to show this example with abstract class .

	}// end of the main method

	// before JDK 8
	static void showBeforeJdk8() {
		Employee employee = new Employee() {
			@Override
			public void show() {
				System.out.println("Show Method calling before JDK8.");
			}
		};

		employee.show();
	}

	// by Lamda expression .
	
	static void byLamdaExp() {
		
		Employee employee = () -> {
			System.out.println("Show Method calling .by Lamda expressions");
		};
		employee.show();
	}

}// end of class

 @FunctionalInterface
interface Employee {
	void show();
	 //void m(); //showing the compilation error.
}
