package com.optional.feature;

import java.util.Optional;

public class OptionalTest {

	
	public String getNullString(){
		return(null);
	}
	
	public Optional<String> getOptionalNullString() {
		return(null);
	}
	
	
	public static void main(String[] args) {
		OptionalTest optionalTest = new OptionalTest();
    	String nullString = optionalTest.getNullString();
		try {
			System.out.println(nullString.toString());
		}catch(NullPointerException  e){
			System.out.println("Oh the humanity, a NullPointerException!");
		}
		
//		Optional<String> optionalString =optionalTest.getOptionalNullString();
//	    try {
//	    	if(optionalString.isPresent()){
//	    		System.out.println(optionalString.toString());
//	    	}
//	    }catch(NullPointerException e){
//	    	System.out.println("Optional object can be null, sorry dude.");
//	    }
	}
}

/* 1) Null pointer check prior to java8  

	if(nullString != null){
		System.out.println(nullString.toString());
	}else {
		System.out.println("nullString is null, man that check was a lot of work");
	} */

/* 
 * 2) With Optional features 
 * 
 * Optional<String> optionalString =optionalTest.getOptionalNullString();
	    try {
	    	if(optionalString.isPresent()){
	    		System.out.println(optionalString.toString());
	    	}
	    }catch(NullPointerException e){
	    	System.out.println("Optional object can be null, sorry dude.");
	    }
 *
 * */
 