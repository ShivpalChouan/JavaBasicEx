package com.Lambdas.examples;

import java.util.Arrays;

class Employee{
	
	String empName;
	String empLastName;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
}

public class LambdasExample2 {

	
	public static void main(String[] args) {
		
		/*Lambdas may reference the class members and local variables (implicitly making them effectively final if they are not). 
		For example, those two snippets are equivalent:*/
		
		String separator=",";
		Arrays.asList("x", "y", "z").forEach((String e)->System.out.println(e+separator));
		
		//and
		
		final String separator1 = ",";
		Arrays.asList( "a", "b", "d" ).forEach((String e ) -> System.out.print( e + separator1 ) );

		/* Lambdas may return a value. The type of the return value will be inferred by compiler. 
		 * The return statement is not required if the lambda body is just a one-liner. The two code snippets below are equivalent:*/
		
		Arrays.asList("a" , "y", "v","b").sort((e1,e2)->e1.compareTo(e2));
		//and
		
		Arrays.asList( "a" , "y", "v","b" ).sort( ( e1, e2 ) -> {
			int result = e1.compareTo( e2 );
			System.out.println("---"+result);
			return result;
		} );

		
		
	}
}
