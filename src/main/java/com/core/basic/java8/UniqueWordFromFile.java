/**
 * 
 */
package com.core.basic.java8;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;
import static java.util.function.Function.identity;



/**
 * @author Shivpal.Chouhan
 *
 */
public class UniqueWordFromFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 
	 try(Stream<String> lines=Files.lines(Paths.get("data.txt"),Charset.defaultCharset())){
		
		Map<String,Long> result=
		lines.map(line -> line.split(" ")).flatMap(Arrays::stream).collect(groupingBy(identity(),counting()));
		System.out.println(result);
		 
		/* List<String> uniqueWords=lines.map(line -> line.split(" "))
				 .flatMap(Arrays::stream)
				 .distinct()
			     .sorted()
			     .collect(Collectors.toList());
		 System.out.println(uniqueWords);*/
		 
	} catch (Exception e) {
		e.printStackTrace();
	}	
	}//end of main
	
	

}
