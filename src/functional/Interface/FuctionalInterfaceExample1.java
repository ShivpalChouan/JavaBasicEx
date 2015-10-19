package com.functional.Interface;


/* @FunctionalInterface annotation is added so that we can mark an interface as functional interface. 
 * It is not mandatory to use it, but it’s best practice to use it with functional interfaces to avoid addition of extra methods accidentally. 
 * If the interface is annotated with @FunctionalInterface annotation and we try to have more than one abstract method, it throws compiler error. */


interface LambdasFuctionalInterfaceEx {
	
	public void doSomeWork();
}

public class FuctionalInterfaceExample1 {

	public static void execute(LambdasFuctionalInterfaceEx lambdas) {
		lambdas.doSomeWork();
	}
	public static void main(String[] args) {
		   //invoke doSomeWork using Annonymous class
		execute(new LambdasFuctionalInterfaceEx() {
			
			@Override
			public void doSomeWork() {
				System.out.println("Hello from annonymous Inner Class!");
				
			}
		});
		
		// Now invoke doSomeWork using Lambda expression 
		
		execute( ( )-> System.out.println("Hello from lambdas Expression!") ); 

		
	}

}