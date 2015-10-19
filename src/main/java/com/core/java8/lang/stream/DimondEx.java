package com.core.java8.lang.stream;

public class DimondEx {

	public static void main(String[] args) {
		A a=new ChildClass();
		a.a();
	}

}


interface A{
	default void a(){
		System.out.println("A");
	}
}

interface B extends A{
	@Override
	public default void a() {
	 System.out.println(" B");
	}
}
interface C extends A{
	
		
}

class ChildClass implements B,C {
	
}

