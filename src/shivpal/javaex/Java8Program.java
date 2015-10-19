/**
 * 
 */
package com.shivpal.javaex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static java.util.stream.IntStream.range;
import static java.util.stream.LongStream.rangeClosed;
import static java.util.stream.Collectors.toList;
import static java.util.Comparator.comparing;


/**
 * @author Shivpal.Chouhan
 *
 */
public class Java8Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(5,17,8,13,40,5,30);
		System.out.println("Sum by Java7= "+sumIterator(list));
		System.out.println("Sum by Java8= "+sumStream(list));
		streamMapEx(list);
		System.out.println("Is Prime :"+isPrime(7));
		countPrimes(20);
		studentEx();
		
	}//end of the main method
	
	
	
	//by java 8
	private static int sumStream(List<Integer> list) {
	    return list.stream().filter(i->i <10).mapToInt(i -> i).sum();
	}
	
	//by Java7
	private static int sumIterator(List<Integer> list) {	   
	    int sum = 0;
	     for(int num:list) { 
	    	   if(num<10)sum += num;   
	    	 }
	    return sum;
	}
		
	//adding value into map
	
	private static void streamMapEx(List<Integer> list){
		Map<Integer, Integer> result=list.stream().distinct().collect(Collectors.toMap(i->i, i->i+10));
		System.out.println(result);
	}
	
	//number is prime or not
	private static boolean isPrime(int number) {        
	    return number > 1 && IntStream.range(2, number).noneMatch(i -> number % i == 0);
	}
	
	// list of prime in specific range .	
	private static void countPrimes(int max) {
	     range(10, max).parallel().filter(Java8Program::isPrime).forEachOrdered(l->System.out.print(l+" "));
	  
	}

	private static void studentEx(){
		Student s1 = new Student("Shyam", 22,"A");
        Student s2 = new Student("Ram  ",   23,"A");
        Student s3 = new Student("Mohan",22,"B");
        Student s4 = new Student("Kumar",21,"B");
        Student s5 = new Student("Rohit",25,"B");
        List<Student> list = Arrays.asList(s1,s2,s3,s4,s5);
       /* Comparator<Student> ageComparator = Comparator.comparing(Student::getAge); 
        Map<String, Optional<Student>> eldestByClass =
        		list.stream().collect(Collectors.groupingBy(Student::getClassName,Collectors.reducing(BinaryOperator.maxBy(ageComparator))));
        eldestByClass.forEach((k,v)->System.out.println("Class:"+k+" Age:"+
                ((Optional<Student>)v).get().getAge()+" Name:"+((Optional<Student>)v).get().getName()));*/
        
        		System.out.println();
        		list.sort(Comparator.comparing(Student::getAge).reversed());
        		list.forEach(l-> {
        			System.out.print(l.getName());
        			System.out.println(" : Age "+l.getAge());
        			
        		});
        		
        		
        		
        		//partitioningBy class name 
        		
        		Map<Boolean, List<Student>> stdByClass = list.stream()
                        .collect(Collectors.partitioningBy(s -> s.getClassName().equals("A")));
            
            stdByClass.forEach((k,v)->System.out.println("Key:"+k+"  "+ 
                    ((List<Student>)v).stream().map(s->s.getName()).collect(Collectors.joining(","))));
 
	}
	
}



class Student {
    private String name;
    private Integer age;
    private String className;
    public Student(String name,Integer age, String className){
        this.name=name;
        this.age=age;
        this.className = className;
    }
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public String getClassName() {
        return className;
    }
}  

