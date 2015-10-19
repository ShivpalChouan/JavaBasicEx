package com.repeating.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.*;

/*Prior to Java8, it was forbidden to declare more than one annotation of the same type to the same location of a code. 
   Java8 introduces the repeating annotation. This means same annotations can be repeated as much as you want at same locations.*/

/* prior to java 8
 
 * @Manufactures({
	@Manufacturer(name =”BMW”),
	@Manufacturer(name = “Range Rover”)
 
    })
    public class Car{
       //code goes in here
    }
*/

public class RepeatingAnnotation {

	@Retention( RetentionPolicy.RUNTIME )
    public @interface Cars {
        Manufacturer[] value() default{};
    }
 
    @Manufacturer( "Mercedes Benz")
    @Manufacturer( "Toyota")
    @Manufacturer( "BMW")
    @Manufacturer( "Range Rover")
    public interface Car { 
 
    }
 
 
    @Repeatable(value = Cars.class )
    public @interface Manufacturer {
        String value();
 
    };
 
    public static void main(String[] args) {
 
        Manufacturer[] a = Car.class.getAnnotationsByType(Manufacturer.class );
        System.out.println("Number of car manufacturers is "+ a.length );
 
        System.out.println("\n-------Printing out Car Manufacturers--------");
 
        Cars cars = Car.class.getAnnotation(Cars.class);
        for(Manufacturer car: cars.value()){
            System.out.println(car.value());
        }
 
    }
}
