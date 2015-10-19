/**
 * 
 */
package com.core.java8.lang.methodRef;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Shivpal.Chouhan
 *
 */
public class PassingBehaviorsInMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		//sum of all numbers
		System.out.println("Sum of All Number : "+sumWithCondition(numbers, n -> true));
		//sum of all even numbers
		System.out.println("Sum of all Even Number "+sumWithCondition(numbers, i -> i%2==0));
		//sum of all numbers greater than 5
		System.out.println("Sum of all Number greater then 5 : "+sumWithCondition(numbers, i -> i>5));
		
		System.out.println("Sum of all Number greater then 5 : "+sumWithCondition(numbers, i -> i<8));
		
	}

	
	public static int sumWithCondition(List<Integer> numbers, Predicate<Integer> predicate) {
        return numbers.parallelStream()
                .filter(predicate)
                .mapToInt(i -> i)
                .sum();
    }
}
