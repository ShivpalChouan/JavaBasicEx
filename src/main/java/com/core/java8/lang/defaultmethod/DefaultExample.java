package com.core.java8.lang.defaultmethod;

public class DefaultExample implements MydefaultEx {

	public static void main(String[] args) {
		MydefaultEx myDefaultEx = new DefaultExample();
		myDefaultEx.print();
		myDefaultEx.print1();
		MydefaultEx.print2();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
}

interface MydefaultEx {

	  void show();
	 default void print(){
		System.out.println("This is the print method");
	}

	default void print1() {
		System.out.println("This is the print1 method");
	}

	static void print2() {
		System.out.println("static print");
	}

}
