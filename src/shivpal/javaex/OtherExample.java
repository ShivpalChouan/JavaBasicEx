/**
 * 
 */
package com.shivpal.javaex;

import java.util.stream.Stream;

/**
 * @author Shivpal.Chouhan
 *
 */
public class OtherExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		fibonacciEx();
	}
	
	
	private static void fibonacciEx(){
		Stream.iterate(new int[]{5, 10},
				t -> new int[]{t[1], t[0]+t[1]})
				.limit(10)
				.forEach(t -> System.out.println(" "+t[0]));
	}

}
