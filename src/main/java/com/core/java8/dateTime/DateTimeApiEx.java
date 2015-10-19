/**
 * 
 */
package com.core.java8.dateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

/**
 * @author Shivpal.Chouhan
 *
 */
public class DateTimeApiEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Current Date
		LocalDate today = LocalDate.now();
		System.out.println("Current Date=" + today);

		// Creating LocalDate by providing input arguments
		LocalDate firstDay_2014 = LocalDate.of(2014, Month.JANUARY, 1);
		System.out.println("Specific Date=" + firstDay_2014);
		//firstDay_2014.format(DateTimeFormatter.ofPattern("MM-DD-YYYY")

		// Current date in Europe/Berlin, you can get it from ZoneId javadoc
		//"Asia/Kolkata"
		LocalDate todayEurope = LocalDate.now(ZoneId.of("Europe/Berlin"));
		System.out.println("Current Date in Europe/Berlin =" + todayEurope);

		LocalDate hundredDay2014 = LocalDate.ofYearDay(2015, 100);
		System.out.println("100th day of 2015=" + hundredDay2014);

	}

}
