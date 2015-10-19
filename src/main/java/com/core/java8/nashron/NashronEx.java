/**
 * 
 */
package com.core.java8.nashron;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author Shivpal.Chouhan
 *
 */
public class NashronEx {

	/**
	 * @param args
	 * @throws ScriptException
	 */
	public static void main(String[] args) throws ScriptException {
		ScriptEngineManager manager = new ScriptEngineManager();

		ScriptEngine engine = manager.getEngineByName("JavaScript");

		// will print the Engine name .
		System.out.println("Engine Name : " + engine.getClass().getName());

		// eval will execute the scripting which is passing as param
		System.out.println("Result:"
				+ engine.eval("function f() { return 1; }; f() + 5;"));

	}

}
