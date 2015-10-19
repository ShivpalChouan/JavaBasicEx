package com.Lambdas.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;

class Person{
	
	String firstName;
	String lastName;
	public Person(String firstName, String lastName) {
		this.firstName =firstName;
		this.lastName =lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}


public class SortingWithLambdas {

	public static void main(String[] args) {
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Virat", "Kohli"));
		personList.add(new Person("Arun", "Kumar"));
		personList.add(new Person("Rajesh", "Mohan"));
		personList.add(new Person("Rahul", "Dravid"));

		Iterator<Person> it = personList.iterator();
		while(it.hasNext()) {
			Person person = it.next();
		    System.out.println("---"+person.getFirstName());
		}
		System.out.println("===============================");

		Collections.sort(personList, (Person p1, Person p2)->p1.getFirstName().compareTo(p2.getFirstName()));
		/*********************************** or ***********************************************/
		
		Collections.sort(personList, ( p1,  p2)->p1.getFirstName().compareTo(p2.getFirstName()));
		
		/*********************************** or ***********************************************/
		/*Another change which can be made to the above code is that the “sort” method has been added to the List class as part of JSR 335 changes 
		 * and we can make use of that method to sort the list:*/

		personList.sort((p1,p2)->p1.firstName.compareTo(p2.firstName));
		
		Iterator<Person> afterSorting = personList.iterator();
		while(afterSorting.hasNext()) {
			Person person = afterSorting.next();
			System.out.println("---"+person.getFirstName());
		}
	}
}
