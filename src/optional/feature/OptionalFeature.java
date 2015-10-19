package com.optional.feature;

import java.util.Optional;

/*Optional is a container object which may or may not contain a non-null value. 
 * If a value is present, isPresent() will return true and get() will return the value. 
 * Stream terminal operations return Optional object. Some of these methods are:*/

public class OptionalFeature {

	
	public static void main(String[] args) {
		
		Optional< String > fullName = Optional.ofNullable( null );
		
		System.out.println( "Full Name is set? " + fullName.isPresent()); 
		
		//orElseGet() method Return the value if present, otherwise invoke other and return the result of that invocation.

		System.out.println( "Full Name: " + fullName.orElseGet( () -> "[none]" ) );  
		System.out.println( fullName.map( s -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) );
		
		/* The isPresent() method returns true if this instance of Optional has non-null value and false otherwise. 
		 * The orElseGet() method provides the fallback mechanism in case Optional has null value*/
		
		Optional< String > firstName = Optional.of( "Tom" );
		System.out.println( "First Name is set? " + firstName.isPresent() );        
		System.out.println( "First Name: " + firstName.orElseGet( () -> "[none]" ) ); 
		System.out.println( firstName.map( s -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) );
		System.out.println();

	}
}


