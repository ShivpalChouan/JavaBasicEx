package com.Lambdas.examples;

import java.util.Arrays;
import java.util.List;

public class LambdasExample1 {

	public static void main(String[] args) {
		
		/*Performs the given action for each element of the Iterable until all elements have been processed
		 *  or the action throws an exception*/
		Arrays.asList("a","b","c").forEach(e->System.out.println(e));
		List<String> list = Arrays.asList("a" , "b" , "d");
		list.stream().forEach(e->System.out.println("lambdas list____"+e));
		
		//Alternatively, you may explicitly provide the type of the parameter, wrapping the definition in brackets
		
		Arrays.asList("a" , "b" , "d").forEach((String e) -> System.out.println(e));
		
		//In case lambda’s body is more complex, it may be wrapped into curly brackets, as the usual function definition in Java.
		
		Arrays.asList( "a", "b", "d" ).forEach( e -> {
			System.out.print( e );
			System.out.print( e );
			} );
		
	
		
	}//end of main
	
}
