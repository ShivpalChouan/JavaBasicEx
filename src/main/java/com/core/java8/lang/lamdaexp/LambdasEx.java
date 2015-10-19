/**
 * 
 */
package com.core.java8.lang.lamdaexp;

/**
 * @author Shivpal.Chouhan
 *
 */
public class LambdasEx {

	static int  portNumber = 1337;
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		usingLocalVariable();
		exceptionThrow();

	}

	/* Using local variables */
	/*
	 * lambda expressions can capture local variables that are assigned to them
	 * only once. (Note: capturing an instance variable can be seen as capturing
	 * the final local variable this.)
	 */

	private static void usingLocalVariable() {
		//int portNumber = 1337;
		Runnable r = () -> System.out.println(portNumber);
		r.run(); // we need to print only portNumber
		 portNumber = 1337;
		// will show error here like Local variable portNumber
		// defined in an enclosing scope must be final or effectively final .

	}

	private static void exceptionThrow() throws Exception {

		EmployeeService empService = (id) -> {
			if (id == 101) {
				throw new Exception("Invalid Employee id");
			}
			System.out.println("Hello Admin");
		};

		empService.showEmployeeName(101);
	}

}

interface EmployeeService {
	void showEmployeeName(int empId) throws Exception;
}
