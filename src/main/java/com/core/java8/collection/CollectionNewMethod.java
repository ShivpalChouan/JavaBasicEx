package com.core.java8.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionNewMethod {

	public static void main(String[] args) {

		List<Integer> integerList = Arrays
				.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println(" \n\n Orignal List of the Integer ." + integerList);

		integerList.replaceAll(x -> x * 5);
		System.out
				.println(" \n\n Multiply all the Integer by 5 (ReplaceAll method )"
						+ integerList);

		integerList.sort((x0, x1) -> x1.intValue() - x0.intValue());
		System.out
				.println(" \n\n Sort the List in descending order (Sort Method) "
						+ integerList);

		List<Double> doubleList = new ArrayList<>();
		java.util.function.Function<Integer, Double> funcation = (x) -> x
				.doubleValue();
		integerList.forEach(x -> doubleList.add(funcation.apply(x)));
		System.out.println("\n\n Turn form Integer to double (forEach method)"
				+ doubleList);

		integerList.removeIf(x -> x.intValue() > 20);
		System.out.println("\n\n Remove all the value > 20 (removeIf method)"
				+ integerList);

		// show();
	}

	/*
	 * public static void show(){ List<Integer> integerList=
	 * Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	 * 
	 * Iterator<Integer> listIt=integerList.iterator(); int i=0;
	 * while(listIt.hasNext()){ System.out.println("i"+i); if(listIt.next()==5){
	 * listIt.remove(); System.out.println("Remove 5 from list"); break; } i++;
	 * } }
	 */

}
