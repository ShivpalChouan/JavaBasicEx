package com.core.java8.lang.lamdaexp;

public class LambdaByAbstractClass {

	public static void main(String[] args) {

		MyClass my = () -> {
			System.out.println("show method");
		};
		my.show();
		

	}

}

interface  MyClass {
	abstract void show();	
}
