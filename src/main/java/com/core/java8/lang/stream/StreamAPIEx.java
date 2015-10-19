/**
 * 
 */
package com.core.java8.lang.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.DoublePredicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Optional;

/**
 * @author Shivpal.Chouhan
 *
 */
public class StreamAPIEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Find the double of first even number in give list which is greater
		// then 3
		 findDoubleOfFirstEx();

		// Traversable only once
		 streamTraversableEx();

		// Print list of unique element into give list which is divisible by 2
		 printUniqueNuberDivby2();

		// optinalEx
		optinalEx();
		
		//double ex
		doubleStream();
		
		//prime number test
		System.out.println(" Is Prime :"+isPrime(4));
		
		//prime number series 
		primeNumberSeries(10,40);
		
		//Studnet ex
		
		
	}

	

	/*
	 * Find the double of first even number in give list which is greater then 3
	 */
	private static void findDoubleOfFirstEx() {
		List<Integer> numberList = Arrays.asList(1, 2, 4, 3, 5, 6, 7, 8);

		// by Java7

		int result = 0;
		for (int number : numberList) {
			if (number > 3 && number % 2 == 0) {
				result = number * 2;
				break;
			}
		}// end of for		

		System.out.println("Result by Java 7 : ---> " + result);

		// by Lambda expression .
		System.out.println("Result by Lamda :----> "
				+ numberList.stream().filter(e -> e % 2 == 0 && e>3).map(e -> e * 2).findFirst()
						.get());
	}
	
	private static void streamTraversableEx() {
		List<String> empName = Arrays.asList("Ram ", "Gopal ", "Mohan ");
		Stream<String> name = empName.stream();
		name.forEach(System.out::print);
		//name.forEach(System.out::print);
	}

	/*
	 * //Print list of unique element into give list which is divisible by 2
	 */
	private static void printUniqueNuberDivby2() {
		System.out.println("\nUnique Number : ");
		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
		numbers.stream().filter(i -> i % 2 == 0).distinct()
				.forEach(System.out::println);
	}

	// Optional
	private static void optinalEx() {
		getUserList().stream().filter(User::isAdmin).findAny()
				.ifPresent(System.out::println);
	}

	private static List<User> getUserList() {
		List<User> userList = new ArrayList<>();
		userList.add(new User("Rahul", "HR", false));
		userList.add(new User("Mohan", "IT", false));
		userList.add(new User("Gopal", "IT", false));
		userList.add(new User("rajesh", "QA", false));
		userList.add(new User("Kapil", "QA", false));
		userList.add(new User("Robin", "ADMIN", true));
		userList.add(new User("Chirag", "ADMIN", true));
		return userList;
	}
	
	//DoubleStream 
	
	private static void doubleStream(){		
		
		DoublePredicate range = d -> d > 12.11 && d < 12.99;		
		DoubleStream.of(12.1 , 11.2 , 12.3 ,15.25 ,12.54).filter(range).forEach(d->System.out.print(d+" "));
		
		System.out.println("--Using DoubleStream.max--");
		double val = DoubleStream.of(12.1,11.2,13.3).max().getAsDouble();
		System.out.println(" Max from list :"+val);
		
		 val = DoubleStream.of(12.1,11.2,13.3).average().getAsDouble();
		System.out.println(" Average of list " +val);
	}
	
	
	//prime number test
	private static boolean isPrime(int number){
		return number > 1 && IntStream.range(2,number).noneMatch(l -> number % l == 0);      		
	}


	//Prime number series 
	
	private static void primeNumberSeries(int sartPoint ,int endPoint){
		
		IntStream.range(sartPoint, endPoint).filter(StreamAPIEx::isPrime).forEachOrdered(System.out::println);
	}
	
	
	
}// end of the class


