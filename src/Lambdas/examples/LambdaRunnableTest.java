package com.Lambdas.examples;

interface abc{
	
	public void show(String mes);

}


public class LambdaRunnableTest {
	
	public static void main(String[] args) {
		
		 System.out.println("=== RunnableTest ===");
		// Anonymous Runnable
		 Runnable r1 = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				 System.out.println("Hello world one!");
				
			}
		 };
	/* Functional Interface is an interface with just one abstract method declared in it.
		java.lang.Runnable is an example of a Functional Interface. There is only one method void run() declared in Runnable interface. 
		Similarly ActionListener interface is also a Functional Interface. We use Anonymous inner classes to instantiate objects of functional interface. 
		With Lambda expressions, this can be simplified.*/
	  //Lambda runnable
		 
		 Runnable r2= ()-> { System.out.println("Hello world two!");};
		 r1.run();
		 r2.run();
		 String s1S="hello";

		 
		 abc aa=new abc(){
			 @Override
			public void show(String mes) {
			System.out.println("Message from annonymous class________"+mes);
				
			}
		 };
		 aa.show(s1S);
		 
		 String str="hello by lambdas";
		 abc a = (String s) -> { System.out.println("Message from lambdas expression_______"+s);};
		 a.show(str);
		 
		 new Thread( () -> System.out.println("hello world three!")).start();
	}
}


