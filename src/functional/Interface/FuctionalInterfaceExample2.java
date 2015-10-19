package com.functional.Interface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FuctionalInterfaceExample2 {

	public static void main(String[] args) {
		
		Runnable r = new Runnable() {
			public void run() {
				
				System.out.println("Running from Runnable !");
			}
		};
		
		// Now invoke run method through Lambdas expression
		
		Runnable r1 = () -> { System.out.println("My lambdas expression runnable!");};
		r.run();
		r1.run();
		
		Consumer<String> c = (String  x)-> {System.out.println(x);};

		BiConsumer<Integer, String> b = (Integer m, String n) -> {System.out.println(m + "" + n);};
		b.accept(10, "hello");
		
		//@FunctionalInterface Represents a predicate (boolean-valued function) of one argument. This is a functional interface whose functional method is test(Object)
	
		Predicate<Integer> p = (Integer i)-> i ==2;
		System.out.println(p.test(4));
	}

	



}
