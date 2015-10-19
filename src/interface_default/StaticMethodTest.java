package com.interface_default;

interface xyz {
	
	static void foo(){
		
		System.out.println("Static Methos Foo from xyz");
	}
}

class Y implements xyz {
	
	
}
/* you no longer need to provide your own companion utility classes. 
 * Instead, you can place static methods in the appropriate interfaces, which is a good habit to cultivate.   */

public class StaticMethodTest {
	
	public static void main(String[] args) 	{
	      xyz.foo();
//	       Y.foo(); // won't compile
    }
	
}
