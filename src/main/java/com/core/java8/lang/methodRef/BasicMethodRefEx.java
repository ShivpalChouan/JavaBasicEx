/**
 * 
 */
package com.core.java8.lang.methodRef;

import java.util.Arrays;

/**
 * @author Shivpal.Chouhan
 *
 */
public class BasicMethodRefEx {

	public static void main(String str[]) {
		// Static Method References :
		new Thread(BasicMethodRefEx::runBody).start();

		// Instance Method References Of Objects :
		BasicMethodRefEx mr = new BasicMethodRefEx();
		new Thread(mr::runBodyRefofObject).start();

		// Instance Method References Of Classes :
		String[] strArray = { "abe", "adb", "deb", "abc", "ghi", "acd", "acg",
				"acb" };
		Arrays.sort(strArray, String::compareToIgnoreCase);

	}// end of main

	// Static Method References :
	public static void runBody() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("square of i is in runBody " + (i * i));
		}
	}

	// Instance Method References Of Objects :
	public void runBodyRefofObject() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("square of i is in  runBodyRefofObject "
					+ (i * i));
		}
	}

}
