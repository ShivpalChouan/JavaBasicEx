package com.interface_default;

interface MyData {
	
    default void print(String str) {
        if (!isNull(str))
            System.out.println("MyData Print::--" + str);
    }
    
	/* Static methods are similar to default methods except that we can’t override them in the implementation classes. 
	 * This feature helps us in avoiding undesired results incase of poor implementation in child classes. */ 
    
    static boolean isNull(String str) {
        System.out.println("MyData Null Check");
        return str == null ? true : "".equals(str) ? true : false;
    }
	
}


public class staticMethods implements MyData {


	  public boolean isNull(String str) {
	        System.out.println("staticMethods Null Check");
	 
	        return str == null ? true : false;
	    }
	     
	    public static void main(String args[]){
	    	staticMethods obj = new staticMethods();
	        obj.print("");
	        obj.isNull("abc");
	    }

}
