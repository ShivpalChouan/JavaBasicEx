package com.core.java8.nashron;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ParameterNames {

	public static void main(String[] s) throws Exception {
		Method method = ParameterNames.class.getMethod("main", String[].class);
		for (final Parameter parameter : method.getParameters()) {
			System.out.println("Parameter: " + parameter.getName());
		}
	}
}
